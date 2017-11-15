package mx.com.mwm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Jorge
 *
 */
@Entity
@Table(name="t_rol")
public class Rol implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_Rol")
	private int id_rol;
	
	@Column(name="Nombre_Tipo")
	private String nombre_Tipo;
	
	@Column(name="Estado")
	private String estado;
	
	public Rol () {
		
	}
	
	

	public Rol(String nombre_Tipo, String estado) {
		super();
		this.nombre_Tipo = nombre_Tipo;
		this.estado = estado;
	}



	public int getId_rol() {
		return id_rol;
	}

	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}

	public String getNombre_Tipo() {
		return nombre_Tipo;
	}

	public void setNombre_Tipo(String nombre_Tipo) {
		this.nombre_Tipo = nombre_Tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}



	@Override
	public String toString() {
		return "Rol [id_rol=" + id_rol + ", nombre_Tipo=" + nombre_Tipo + ", estado=" + estado + "]";
	}
	
	
	
	
	

}
