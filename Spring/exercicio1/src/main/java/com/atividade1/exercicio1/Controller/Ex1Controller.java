package com.atividade1.exercicio1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("")
class Ex1Controller {
	
	@RequestMapping(value = "/mentalidadeEHabilidade")
	@GetMapping
	public String mentalidadeEHabilidade() {
		return "- Habilidades e Mentalidades utilizadas neste exercício: \n- Persistência;\n"
				+ "- Atenção aos detalhes\n- Mentalidade de Crescimento";
	}

@RequestMapping(value = "/objetivos")
	@GetMapping
	public String objetivo() {
		return "Objetivos de aprendizagem da semana: \n - Spring\n - MySQL";
	}
}
