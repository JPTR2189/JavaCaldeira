package com.github.javacaldeiraonline.tributacao;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2000);
        SeguroVida seguroVida = new SeguroVida();

        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
        gerenciador.adicionar(contaCorrente);
        gerenciador.adicionar(seguroVida);

        gerenciador.calcularTotalTributos();
        double totalTributos = gerenciador.getTotalTributos();

        System.out.println("Total de tributos a pagar: R$" + totalTributos);
        System.out.println("Sua conta poupança possui o valor: R$ " + contaPoupanca.obterSaldo());

        //Exemplos de impressões formatadas
        System.out.printf("%.3f%n", contaPoupanca.obterSaldo());
        System.out.printf("%.3f", contaPoupanca.obterSaldo());
    }
}
