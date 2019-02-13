package com.projeto.banco;

public class Conta {
	private float saldo;
	private float taxa = 0.015f;
	
	public Conta () {
		saldo = 0;
	}
	
	public float getTaxa () {
		return taxa;
	}
	
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(float deposito) {
		this.setSaldo(this.getSaldo()+deposito);
		this.atualizar(deposito);
	}
	
	public void sacar(float saque) {
		if(saque>this.getSaldo()) {
			System.out.println("Saldo insuficiente");
		}
		else {
			this.setSaldo(this.getSaldo()-saque);
			this.atualizar(saque);
		}
	}
	
	public void atualizar(float valor) {
		saldo = saldo - (this.getTaxa()*valor);
	}
	
	public void status() {
		System.out.printf("%.2f %n", this.getSaldo());
	}
}
