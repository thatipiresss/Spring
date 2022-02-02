package br.org.generation.heloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class heloworldController {

	@GetMapping("/helo")
	public String helo() {
		return "Hello World!!!!";
	}
	@GetMapping("/chora")
	public String chora() {
		return "Finalmente esse Hello World saiu! Aleluia!!!";
	}
	
	@GetMapping("/mentalidades")
	public String mentalidades() {
		return "As mentalidades utilizadas para essa atividade foram: Persistencia, "
				+ "pois precisei estudar várias vezes durante a semana o mesmo conteúdo "
				+ "para conseguir comprende-lo e Mentalidade de Crescimento, pois por "
				+ "diversas vezes achei que não seria capaz, mas lembrei de tudo oque já "
				+ "aprendi nessa vida e o quão difícil sempre foi no começo.";
	}
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Pra essa semana (que já estou em atraso com algumas atividades devido "
				+ "ao tempo maior que levei para comprrender a matéria), eu desejo conseguir "
				+ "colocar todas as tarefas em dia para que na Sexta-feira, quando recebermos matéria nova, "
				+ "eu possa estar na mesma página que a turma.";
	}
	
}
