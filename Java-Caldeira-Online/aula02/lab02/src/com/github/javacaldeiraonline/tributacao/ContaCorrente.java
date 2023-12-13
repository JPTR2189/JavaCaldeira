package com.github.javacaldeiraonline.tributacao;

public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public double calculaTributos() {
        return obterSaldo() * 0.01;
    }
}
