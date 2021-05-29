package br.ime.usp.mac321.aula06;

public class Qualquer {
	// métodos
	 void f(){
	     Testador t = new Testador();
	     t.teste();
	     t.x += 5;
	     System.out.println(t.x);
	 }
	 public static void main(String[] args) {
		 Qualquer q = new Qualquer();
		 q.f();
	 }
	 
	 // Classes
	 class Testador{
		 private double x = 10.5;
	     public void teste(){
		 for(int i = 0; i < 10; i++)
		     System.out.println("Funciona");
	     }
	  }
	 

}
