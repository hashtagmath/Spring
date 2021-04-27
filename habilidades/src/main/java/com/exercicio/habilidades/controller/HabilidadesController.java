package com.exercicio.habilidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/habilidades")

public class HabilidadesController {
	
	@GetMapping
	public String habilidades() {
		return "Persistência; \n"
				+ "Atenção aos detalhes; \n"
				+ "Comunicação; \n"
				+ "Trabalho em equipe; \n"
				+ "Mentalidade de crescimento.";
	}

}
