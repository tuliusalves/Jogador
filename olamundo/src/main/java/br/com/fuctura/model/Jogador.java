package br.com.fuctura.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="jogador")
public class Jogador {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private String img;
	
	
	public Jogador() {}
	
	public Jogador(String nome) {
		this.nome= nome;
		System.out.println("Construindo uma instância de Jogador: "+nome);
	}
	
	
	
}
