package br.com.fuctura.olamundo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JogadorController {

	@GetMapping("/cadastrar")
	public String cadastrar(Model model) {
		model.addAttribute("tituloDaPagina", "Cadastrar");
		return "cadastrar";
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("tituloDaPagina", "Listar");
		return "listar";
	}

	@GetMapping("/excluir")
	public String excluir(Model model) {
		model.addAttribute("tituloDaPagina", "Excluir");
		return "excluir";
	}

	@GetMapping("/atualizar")
	public String atualizar(Model model) {
		model.addAttribute("tituloDaPagina", "Atualizar");
		return "atualizar";
	}

	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("tituloDaPagina", "Fuctura");
		return "home";
	}

}
