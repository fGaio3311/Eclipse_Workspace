package br.ime.usp.mac321.aula06;

public class Cliente extends Pessoa {
	// além dos membros de Pessoa:
	private int conta;
	private String cpf;
	private double saldo;
	
	private static int próximaConta = 1000;
	
	// também colocamos novos métodos
	public void deposito (double val) { saldo += val;}

	public boolean saque (double val) {
				    if (saldo-val>=0) { saldo -= val; return true;}
		    return false;
	}
	
	public Cliente(String nome, String cpf, int saldo) {
		super(nome); // tem que ser o primeiro comando;
		this.cpf = cpf;
		conta = ++próximaConta;
		this.saldo = saldo;
	}

	public Cliente(String nome, String cpf) {
		this(nome, cpf, 0);
	}

	@Override
	public void imprime ( ) {
		System.out.println(nome + ", conta "+conta+", saldo: "+saldo+
			", cpf: "+cpf);
	}
	
	public static void main(String[] args) {
		Cliente c = new Cliente("Zé","001.002.008-76");
		c.imprime();

	}

}
