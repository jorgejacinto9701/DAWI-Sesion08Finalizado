package com.empresa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoletaRegistroController {

	
	
	@RequestMapping("/verBoletaRegistro")
	public String verBoleta() {
		return "boletaRegistro";
	}  
	
	
	
}
