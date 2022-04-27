package br.com.fuctura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.fuctura.model.Jogador;
import br.com.fuctura.repository.JogadorRepository;

import java.util.List;
import java.util.Optional;
@Controller
public class JogadorController {
	@Autowired
	private JogadorRepository jogadorRepository;
	@Autowired
	Jogador j;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Model model) {
		model.addAttribute("tituloDaPagina", "Cadastrar");
		return "cadastrar";
	}
	/*
	@GetMapping("/listar")
	public String listar(Model model) {
		Optional<Jogador>jogador = jogadorRepository.findById(1L);
		
		if(jogador.isPresent()) {
			model.addAttribute("jogador",jogador.get());
		}
		
		model.addAttribute("tituloDaPagina"," ");
		return "listar";
	}
	*/

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
