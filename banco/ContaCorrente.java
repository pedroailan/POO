package com.projeto.banco;

public class ContaCorrente extends Conta {
	
	@Override
	public void depositar(float deposito) {
		this.setSaldo(this.getSaldo()+deposito-0.10f);
		this.atualizar(deposito);
	}
	
	@Override
	public void atualizar(float percentual) {
		this.setSaldo(this.getSaldo() - (this.getSaldo()*(3*this.getTaxa())));
	}
}
