package com.projeto.banco;

public class ContaPoupanca extends Conta{
	
	@Override
	public void atualizar(float percentual) {
		this.setSaldo(this.getSaldo() - (this.getSaldo()*(2*this.getTaxa())));
	}
}
