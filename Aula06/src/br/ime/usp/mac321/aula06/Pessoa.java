package br.ime.usp.mac321.aula06;

public class Pessoa {
	protected String nome;
	protected double peso;
	protected double altura;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public void imprime ( ) {
		System.out.println("Pessoa" + nome + ", peso: " + peso + ", altura: " + altura);
	}
}
