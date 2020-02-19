package com.tallermicroservicios.demoCiCd.objetos;

import org.springframework.stereotype.Component;

@Component
public class Usuarios {
	private String nombre;
	private String apellido;
	private String usuario;
	
	public Usuarios() {
		super();
	}
	
	
	

	public Usuarios(String nombre, String apellido, String usuario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
	}




	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
}
