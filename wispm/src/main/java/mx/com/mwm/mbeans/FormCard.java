package mx.com.mwm.mbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped

public class FormCard {
	private String token;
	private String titularCard;
	private String numberCard;
	private String mes;
	private String anio;
	private String codigoCard;
	
	public FormCard() {
		
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getTitularCard() {
		return titularCard;
	}

	public void setTitularCard(String titularCard) {
		this.titularCard = titularCard;
	}

	public String getNumberCard() {
		return numberCard;
	}

	public void setNumberCard(String numberCard) {
		this.numberCard = numberCard;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getCodigoCard() {
		return codigoCard;
	}

	public void setCodigoCard(String codigoCard) {
		this.codigoCard = codigoCard;
	}
	

}
