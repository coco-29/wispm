package mx.com.mwm.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_persona")
public class Persona implements Serializable {

	/**
	 * @author Jorge
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id_Persona")
	private int id_Persona;

	@Column(name = "Nombre", nullable = false)
	private String nombre;

	@Column(name = "Ap_Paterno", nullable = false)
	private String ap_Paterno;

	@Column(name = "Ap_Materno", nullable = false)
	private String ap_Materno;

	@Column(name = "Telefono", nullable = false)
	private String telefono;



	public Persona() {

	}

	public Persona(String nombre, String ap_Paterno, String ap_Materno, String telefono) {
		super();
		this.nombre = nombre;
		this.ap_Paterno = ap_Paterno;
		this.ap_Materno = ap_Materno;
		this.telefono = telefono;
	}

	public int getId_Persona() {
		return id_Persona;
	}

	public void setId_Persona(int id_Persona) {
		this.id_Persona = id_Persona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAp_Paterno() {
		return ap_Paterno;
	}

	public void setAp_Paterno(String ap_Paterno) {
		this.ap_Paterno = ap_Paterno;
	}

	public String getAp_Materno() {
		return ap_Materno;
	}

	public void setAp_Materno(String ap_Materno) {
		this.ap_Materno = ap_Materno;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	



}
