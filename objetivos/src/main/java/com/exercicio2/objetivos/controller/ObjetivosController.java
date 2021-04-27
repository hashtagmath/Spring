package com.exercicio2.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/objetivos")

public class ObjetivosController {
	
	@GetMapping
	public String objetivos() {
		return "Spring;\n"
			 + "Métodos;\n"
			 + "Verbos;\n"
			 + "Utilização do Postman;\n"
			 + "Maven Project.";
	
	}

}
