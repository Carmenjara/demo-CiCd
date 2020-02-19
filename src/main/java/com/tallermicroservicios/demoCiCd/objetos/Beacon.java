package com.tallermicroservicios.demoCiCd.objetos;

import org.springframework.stereotype.Component;

@Component
public class Beacon {
	private String uid;
	private String protocolo;
	private String fabricante;
	
	public Beacon() {
		super();
	}
	
	public Beacon(String uid, String protocolo, String fabricante) {
		super();
		this.uid = uid;
		this.protocolo = protocolo;
		this.fabricante = fabricante;
	}
	public String getUID() {
		return this.uid;
	}
	public void setUID(String uID) {
		this.uid = uID;
	}
	public String getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	

}
