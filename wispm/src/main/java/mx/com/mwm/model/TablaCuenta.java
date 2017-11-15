package mx.com.mwm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



/**
 * @author jorge
 *
 */
@Entity
@Table(name="t_cuenta")
public class TablaCuenta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_Cuenta")
	private int id_Cuenta;
	
	@Column(name="Usuario")
	private String user;
	
	@Column(name="Password")
	private String pass;
	
	@Column(name="E_Mail")
	private String mail;
	
	@ManyToOne
	private Rol rol;

	public TablaCuenta(String user, String pass, String mail) {
		super();
		this.user = user;
		this.pass = pass;
		this.mail = mail;
		
	}
	
	public TablaCuenta() {
		
	}

	public int getId_Cuenta() {
		return id_Cuenta;
	}

	public void setId_Cuenta(int id_Cuenta) {
		this.id_Cuenta = id_Cuenta;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "TablaCuenta [id_Cuenta=" + id_Cuenta + ", user=" + user + ", pass=" + pass + ", mail=" + mail + ", rol="
				+ rol + "]";
	}
	

	
}
