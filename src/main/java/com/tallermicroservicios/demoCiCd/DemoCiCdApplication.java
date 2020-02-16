package com.tallermicroservicios.demoCiCd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoCiCdApplication {
	
	@GetMapping("/")
	public String home() {
		return "Hola mijin";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoCiCdApplication.class, args);
	}

}
