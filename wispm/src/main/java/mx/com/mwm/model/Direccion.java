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
@Table(name="t_direccion")
public class Direccion implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_Direccion")
	private int idDireccion;
	
	@Column(name="Codigo_Postal")
	private int codigoPostal;
	
	@Column(name="Calle")
	private String calle;
	
	@Column(name="Numero_Exterior")
	private String numeroExterior;
	
	@Column(name="Numero_Interior")
	private String numeroInterior;
	
	@Column(name="Estado")
	private String estado;
	
	@Column(name="Colonia")
	private String colonia;
	
	@Column(name="Municipio")
	private String municipio;
	
	public Direccion() {
		// TODO Auto-generated constructor stub
	}
	




	public Direccion(int codigoPostal, String calle, String numeroExterior, String numeroInterior, String estado,
			String colonia, String municipio) {
		super();
		this.codigoPostal = codigoPostal;
		this.calle = calle;
		this.numeroExterior = numeroExterior;
		this.numeroInterior = numeroInterior;
		this.estado = estado;
		this.colonia = colonia;
		this.municipio = municipio;
	}





	public int getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumeroExterior() {
		return numeroExterior;
	}

	public void setNumeroExterior(String numeroExterior) {
		this.numeroExterior = numeroExterior;
	}

	public String getNumeroInterior() {
		return numeroInterior;
	}

	public void setNumeroInterior(String numeroInterior) {
		this.numeroInterior = numeroInterior;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}


	@Override
	public String toString() {
		return "Direccion [idDireccion=" + idDireccion + ", codigoPostal=" + codigoPostal + ", calle=" + calle
				+ ", numeroExterior=" + numeroExterior + ", numeroInterior=" + numeroInterior + ", estado=" + estado
				+ ", colonia=" + colonia + ", municipio=" + municipio + "]";
	}
	
	

}
