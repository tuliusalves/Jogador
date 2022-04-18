package br.com.fuctura.olamundo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.fuctura.model.Jogador;

@Controller
public class OlaMundoController {
	
		@GetMapping("/inicial")
		public String getInicial(Model model) {
			Jogador j = new Jogador();
			j.setNome("Messi");
			j.setIdade(15);
			j.setAltura(1.75);
			j.setPeso(70.0);
			j.setImg("https://a.espncdn.com/combiner/i?img=%2Fphoto%2F2021%2F0607%2Fr864237_1296x729_16%2D9.jpg&w=570&format=jpg");
			model.addAttribute("jogador",j);
			model.addAttribute("tituloDaPagina","Fuctura");
			
			return "inicial";
		}
	
	
}
