package com.tallermicroservicios.demoCiCd.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tallermicroservicios.demoCiCd.objetos.Usuarios;
import com.tallermicroservicios.demoCiCd.service.FirebaseService;

@RestController
public class RestControllerU {
	@Autowired
	FirebaseService fireBaseService; 
	
	@PostMapping("/createUser")
	//public String postExample(@RequestBody Usuarios usuario) throws InterruptedException, ExecutionException {
    public String postExample(@RequestParam(name="nombre", required=false) String nombre, 
    		@RequestParam(name="apellido", required=false) String apellido,
    		@RequestParam(name="usuario", required=false) String usuario,Model model) throws InterruptedException, ExecutionException {
		
		Usuarios obj = new Usuarios(nombre, apellido, usuario);
		return fireBaseService.saveUsuario(obj);
	}

}
