package JavaCaldeira.Exercícios_Java.aula04.ex006;

import JavaCaldeira.Exercícios_Java.aula04.ex005.IdadeInvalidaException;

public class ContaBancaria {
    private double saldo = 1000;

    public void sacar(double valor) throws SaldoInsuficienteException {

        this.saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
