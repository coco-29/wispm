package mx.com.mwm.service.Openpay;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

public class CargoBanco {

	
public void cargoB (String metodo,int monto,String descripcion, String clienteName,String lastName,String numberPhone,String email) {
	String url="https://sandbox-api.openpay.mx/v1/mexcviwsqt2snzeylcy5/charges";
	try {		
	
	Client cliente = Client.create();
cliente.addFilter(new HTTPBasicAuthFilter("sk_baecf471d8cd4f3cad0528436d028236",""));

WebResource webResource= cliente.resource(url);
String input ="{\"method\" : \""+metodo+"\",\r\n" + 
		"   \"amount\" : "+monto+",\r\n" + 
		"   \"currency\" : \"MXN\",\r\n" + 
		"   \"description\" : \""+descripcion+"\",\r\n" +  
		"   \"customer\" : {\r\n" + 
		"        \"name\" : \""+clienteName+"\",\r\n" + 
		"        \"last_name\" : \""+lastName+"\",\r\n" + 
		"        \"phone_number\" : \""+numberPhone+"\",\r\n" + 
		"        \"email\" : \""+email+"\"\r\n" + 
		"   }\r\n" + 
		"}";

ClientResponse response = webResource.type("application/json")
   .post(ClientResponse.class, input);

if (response.getStatus() != 200) {
throw new RuntimeException("Failed : HTTP error code : "
+ response.getStatus());
}


String output = response.getEntity(String.class);
System.out.println("Output from Server .... \n");
System.out.println(output);

} catch (Exception e) {

e.printStackTrace();

}

	
}



}
