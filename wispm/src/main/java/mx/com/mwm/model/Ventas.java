package mx.com.mwm.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_Venta")
public class Ventas {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_Venta")
	private int idVenta;
	
	@ManyToOne
	@JoinColumn(name="Id_Persona")
	private Persona persona;
	
	@Column(name="Monto_venta")
	private float montoVenta;
	
	@Column(name="Fecha_Venta")
	private LocalDate fechaVenta;
	
	@Column(name="Forma_Pago")
	private String formaPago;
	
	public Ventas() {
		// TODO Auto-generated constructor stub
	}

	public Ventas(float montoVenta, LocalDate fechaVenta, String formaPago) {
		super();
		this.montoVenta = montoVenta;
		this.fechaVenta = fechaVenta;
		this.formaPago = formaPago;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public float getMontoVenta() {
		return montoVenta;
	}

	public void setMontoVenta(float montoVenta) {
		this.montoVenta = montoVenta;
	}

	public LocalDate getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	@Override
	public String toString() {
		return "Ventas [idVenta=" + idVenta + ", persona=" + persona + ", montoVenta=" + montoVenta + ", fechaVenta="
				+ fechaVenta + ", formaPago=" + formaPago + "]";
	}
	
	
	
	
	

}
