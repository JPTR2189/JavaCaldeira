package JavaCaldeira.Exercícios_Java.aula04.ex006;

// Criar uma exceção "SaldoInsuficienteException" que herde de "Exception"
// Criar um objeto "ContaBancaria" com saldo inicial
// Escrever metódo "sacar" lançando a exceção "SaldoInsuficienteException" caso necessário

import JavaCaldeira.Exercícios_Java.aula04.ex005.IdadeInvalidaException;

public class ex006 {

    public static void main(String[] args) throws SaldoInsuficienteException {
        ex006 classe = new ex006();

        ContaBancaria conta = new ContaBancaria();

        double valorSacar = 800;

            try {

                classe.verificarSaldo(conta, valorSacar);
                conta.sacar(valorSacar);
                System.out.printf("Você sacou R$%.2f%nSobrararam R$%.2f na sua conta", valorSacar, conta.getSaldo());


            } catch (SaldoInsuficienteException sie) {

                System.out.println("Saldo insuficiente!");
            }




    }

    public void verificarSaldo (ContaBancaria conta, double valor) throws SaldoInsuficienteException{

        if (valor > conta.getSaldo())

            throw new SaldoInsuficienteException("Saldo insuficiente");

    }

}
