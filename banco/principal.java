package com.projeto.banco;

public class principal {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		cc.depositar(50);
		cp.depositar(50);
		
		cc.status();
		cp.status();

	}

}
