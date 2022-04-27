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
public class OlaMundoController {
	
		@Autowired
		JogadorRepository repository;
		@GetMapping("/inicial")
		public String getInicial(Model model) {
			Optional<Jogador>jogador = repository.findById(1L);
			
			if(jogador.isPresent()) {
				model.addAttribute("jogador",jogador.get());
			}
			
			model.addAttribute("tituloDaPagina"," ");
			/*Jogador j = new Jogador();
			j.setNome("Messi");
			j.setIdade(15);
			j.setAltura(1.75);
			j.setPeso(70.0);
			j.setImg("https://a.espncdn.com/combiner/i?img=%2Fphoto%2F2021%2F0607%2Fr864237_1296x729_16%2D9.jpg&w=570&format=jpg");
			model.addAttribute("jogador",j);
			model.addAttribute("tituloDaPagina","Fuctura");*/
			
			return "inicial";
		}
		
		//localhost:9080/outra
		@GetMapping("/outra")
		public String fuctura() {
			return "outraPagina";
		}
		
		
		@GetMapping("/listar")
		public String getListar(Model model) {
			/*Optional<Jogador>jogador = repository.findById(1L);
			
			if(jogador.isPresent()) {
				model.addAttribute("jogadores",jogador.get());
			}*/
			List<Jogador>j =repository.findAll();
			model.addAttribute("jogadores",j);
			
			model.addAttribute("tituloDaPagina","Página listar ");
			return "listar";
		}
	
}
