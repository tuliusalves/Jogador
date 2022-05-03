package br.com.fuctura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	@GetMapping("/v1/jogador/listar")
	public String getListar(Model model) {
		/*Optional<Jogador>jogador = repository.findById(1L);
		
		if(jogador.isPresent()) {
			model.addAttribute("jogadores",jogador.get());
		}*/
		List<Jogador>j =jogadorRepository.findAll();
		model.addAttribute("jogadores",j);
		
		model.addAttribute("tituloDaPagina","Página listar ");
		return "listar";
	}

	//localhost:9080/jogador/cadastrar
		@GetMapping("/v1/jogador/cadastrar")
		public String cadastrar(){
			return "/v1/jogador/cadastrar";
			//templates/jogador/cadastrar.html
		}
		
		//RequestParam("name que está no html"
		@PostMapping("/v1/jogador/cadastrar")
		public String cadastrar(@RequestParam("idade") int idadeDoJogador, @RequestParam(name = "nome") String nomeDoJogador) {
			//este método vai receber os dados do formulario
			System.out.println("idade:" + idadeDoJogador);
			System.out.println("nome:" + nomeDoJogador);
			
			
			Jogador j = new Jogador();
			j.setIdade(idadeDoJogador);
			j.setNome(nomeDoJogador);
			
			
			//salvar no banco de dados
			jogadorRepository.save(j);

			return "/v1/jogador/cadastrar";
		}
		
		@GetMapping("/v2/jogador/cadastrar")
		public String cadastrarV2(Model model) {
			Jogador jogador = new Jogador();
			model.addAttribute("jogador", jogador);
			return "/v2/jogador/cadastrar";
		}
		
		@PostMapping("/v2/jogador/cadastrar")
		public String cadastrarV2(@ModelAttribute("jogador") Jogador j) {
			System.out.println(j.getNome());
			return "/v2/jogador/cadastrar";
		}
		
		public String remover() {
			return "/v1/jogador/remover";
		}
		
		public String atualizar() {
			return "/v1/jogador/atualizar";
		}
		
		@GetMapping("/teste")
		public String testeDeBean() {
			
			System.out.println( j.getNome() );//eu sou um bean
			
			return "/v1/jogador/atualizar";
		}

}
