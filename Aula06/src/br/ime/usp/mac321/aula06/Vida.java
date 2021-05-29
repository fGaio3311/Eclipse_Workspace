package br.ime.usp.mac321.aula06;

public class Vida {
	public static void ciclo(Animal qualquer) {
		qualquer.nasce();
		for(int i=0;i<5;i++)
			qualquer.cresce();
	}
	public static void main(String[] args) {
		Vida.ciclo(new Animal());
		Vida.ciclo(new Mamifero());
		Vida.ciclo(new Homem());
	}
}
