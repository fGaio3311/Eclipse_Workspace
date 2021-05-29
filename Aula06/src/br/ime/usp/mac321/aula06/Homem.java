package br.ime.usp.mac321.aula06;

class Animal {
	  void nasce() {		
		  System.out.println("Nasceu 1 animal");
	  }
	  void cresce() {
		  System.out.println("Cresceu 1 animal");
	  }
}

class Mamifero extends Animal {
	@Override
	  void nasce()  {
		  System.out.println("Nasceu 1 mamifero");
	  }
	@Override
	  void cresce() {
		  System.out.println("Cresceu 1 mamifero");
	  }
}

public class Homem extends Mamifero {

	@Override
	void nasce()  {
		System.out.println("Nasceu um homem");
	}
	@Override
	void cresce()  {
		System.out.println("Cresceu um homem");
	}
	public static void main(String[] args) {
		Animal x = new Animal();
	    x.nasce();
	    Homem h = new Homem();
	    h.nasce();
	    x = h;
	   // OK, pois Homem deriva de Animal
	    x.nasce(); // mas o que faz???
	}

}
