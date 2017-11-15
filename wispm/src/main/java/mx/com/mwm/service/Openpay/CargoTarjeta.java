package mx.com.mwm.service.Openpay;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

public class CargoTarjeta {
	
	

	public void cargoT (String tokenId,String metodo,int monto, String currency, String descripcion,String deviceId,
			String clienteName,String lastName,String numberPhone, String email) {
		
		try {
		Client cliente = Client.create();
		cliente.addFilter(new HTTPBasicAuthFilter("sk_baecf471d8cd4f3cad0528436d028236", ""));
		WebResource webResource = cliente
				.resource("https://sandbox-api.openpay.mx/v1/mexcviwsqt2snzeylcy5/charges");
		
		String input ="{\"source_id\" : \""+tokenId+"\",\r\n" + 
				"   \"method\" : \""+metodo+"\",\r\n" + 
				"   \"amount\" : "+monto+",\r\n" + 
				"   \"currency\" : \"MXN\",\r\n" + 
				"   \"description\" : \""+descripcion+"\",\r\n" +  
				"   \"device_session_id\" : \""+deviceId+"\",\r\n" + 
				"   \"customer\" : {\r\n" + 
				"        \"name\" : \""+clienteName+"\",\r\n" + 
				"        \"last_name\" : \""+lastName+"\",\r\n" + 
				"        \"phone_number\" : \""+numberPhone+"\",\r\n" + 
				"        \"email\" : \""+email+"\"\r\n" + 
				"   }\r\n" + 
				"}";
		
	System.out.println(input);
		// ClientResponse
					// response=webResource.accept("application/json").get(ClientResponse.class);
					ClientResponse response = webResource.type("application/json").post(ClientResponse.class, input);

					if (response.getStatus() != 200) {
						throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
					}

					String output = response.getEntity(String.class);
					System.out.println("Output from Server .... \n");
					System.out.println(output);

				} catch (Exception e) {

					e.printStackTrace();

				}

		
		
	}
	
	
}
