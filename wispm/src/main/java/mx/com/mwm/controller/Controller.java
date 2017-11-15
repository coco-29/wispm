package mx.com.mwm.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import mx.com.mwm.mbeans.FormCard;
import mx.com.mwm.service.Openpay.CargoTarjeta;



@ManagedBean
@RequestScoped

public class Controller {

	public Controller() {
		// TODO Auto-generated constructor stub
	}

	@ManagedProperty(value = "#{formCard}")

	private FormCard formulario;

	public FormCard getFormulario() {
		return formulario;
	}

	public void setFormulario(FormCard formulario) {
		this.formulario = formulario;
	}

	public void imprimir() {
		System.out.println("Valores del formulario");
		System.out.println("Token: " + formulario.getToken());
		System.out.println("Nombre: " + formulario.getTitularCard());
		System.out.println("Numero de tarjeta: " + formulario.getNumberCard());
		System.out.println("Año: " + formulario.getAnio());
		System.out.println("mes: " + formulario.getMes());
		System.out.println("Codigo: " + formulario.getCodigoCard());
	
		CargoTarjeta cargoT=new CargoTarjeta();
		cargoT.cargoT(formulario.getToken(), "card", 100, "MXN", "Compra TP-link", "1rvGhOGaFgPwNbrtefA4IwPZbMRjsQpe", "Jorge", "Damian", "9581318869", "coco_dava@hotmail.com");
		
		
		

	}

}