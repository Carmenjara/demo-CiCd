package com.tallermicroservicios.demoCiCd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoCiCdApplication {
	
	@GetMapping("/")
	public String home() {
		return "FIREBASE";	
	}
	
	@GetMapping("/principal")
	public String hola(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "index";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(DemoCiCdApplication.class, args);
	}

}
