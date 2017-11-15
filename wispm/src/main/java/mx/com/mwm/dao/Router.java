package mx.com.mwm.dao;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import mx.com.mwm.dao.impl.RouterDAOImpl;

@ManagedBean
@RequestScoped
public class Router implements java.io.Serializable{
	
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@GeneratedValue
	private int id;
	
	private String nombre;
	private String ipDns;
	private String nombreUser;
	private String llave;
	private String ubicacion;
	private List<Router> routerList;
	public static RouterDAOImpl dbObj;
	private static final long serialVersionUID = 1L;
	
	
	
	public Router() {}
	
	public Router(int id) {
		this.id=id;
	}
	
	public Router(int id, String nombre, String ipDns, String nombreUser, String llave, String ubicacion) {
		this.id = id;
		this.nombre = nombre;
		this.ipDns = ipDns;
		this.nombreUser = nombreUser;
		this.llave = llave;
		this.ubicacion = ubicacion;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIpDns() {
		return ipDns;
	}
	public void setIpDns(String ipDns) {
		this.ipDns = ipDns;
	}
	public String getNombreUser() {
		return nombreUser;
	}
	public void setNombreUser(String nombreUser) {
		this.nombreUser = nombreUser;
	}
	public String getLlave() {
		return llave;
	}
	public void setLlave(String llave) {
		this.llave = llave;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<Router> getRouterList() {
		return routerList;
	}

	public void setRouterList(List<Router> routerList) {
		this.routerList = routerList;
	}

	public void guardarRouter() {
		System.out.println("LLamando al metodo guardarRouter() para guardar Router");
		dbObj=new RouterDAOImpl();
		dbObj.guardarRouterEnDb(this);
	}
	
	public List<Router> getRouterDetails() {
		System.out.println("Lamando getRouterDetails para mostrar routers... ");
		dbObj=new RouterDAOImpl();
		routerList=dbObj.getRouter();
		for(Router selectedRouter : routerList) {
			id=selectedRouter.getId();
			nombre=selectedRouter.getNombre();
			ipDns=selectedRouter.getIpDns();
			nombreUser=selectedRouter.getNombreUser();
			llave=selectedRouter.getLlave();
			ubicacion=selectedRouter.getUbicacion();
			System.out.println("id: " + id +" nombre: "+nombre+" IpDNS: "+ipDns+" nombre Usurario: " +nombreUser+" llave: " + llave + " Ubicacion: " + ubicacion + "\n");
		}
		return routerList;
	}

}
