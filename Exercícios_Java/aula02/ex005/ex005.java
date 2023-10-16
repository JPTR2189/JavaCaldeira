package JavaCaldeira.Exercícios_Java.aula02.ex005;

// TERMINAR DE FAZER O 5 PASSO
public class ex005 {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupança();
        SeguroDeVida seguroDeVida = new SeguroDeVida();
        GerenciadorDeImpostoDeRenda gerenciadorDeImpostoDeRenda = new GerenciadorDeImpostoDeRenda();

        contaCorrente.deposito(1574);
        contaPoupanca.deposito(1869);

        System.out.printf("%.2f%n", contaCorrente.calculaTributos());
        System.out.printf("%.2f%n", contaPoupanca.calculaTributos());
        System.out.printf("%.2f%n", seguroDeVida.calculaTributos());

        contaCorrente.deposito(500);

        System.out.printf("Saldo da conta corrente: R$" + "%.2f%n", contaCorrente.obterSaldo());
        System.out.printf("Saldo da conta poupança: R$" + "%.2f%n", contaPoupanca.obterSaldo());

        gerenciadorDeImpostoDeRenda.adicionarTributaveis(seguroDeVida);
        gerenciadorDeImpostoDeRenda.adicionarTributaveis(contaCorrente);

        System.out.printf("A soma dos total dos tributos é: R$" + "%.2f%n", gerenciadorDeImpostoDeRenda.getSomaDosTributos());






    }

}
