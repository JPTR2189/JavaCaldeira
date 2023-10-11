package JavaCaldeira.Exercícios_Java.aula02;
import java.util.Scanner;

public class ex001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.printf("Digite seu cpf: ");
        String cpf = scanner.nextLine();

        System.out.printf("Digite seu endereço: ");
        String endereco = scanner.nextLine();

        ContaBancaria jean = new ContaBancaria(nome, cpf, endereco );
        ContaBancaria paulo = new ContaBancaria("Paulo", cpf, endereco);

        jean.deposito(1000.78);
        jean.transferencia(paulo,2000);
        jean.verificaInformacoes();
        System.out.printf("--------------------------------------------------");
        paulo.verificaInformacoes();
        System.out.println(jean.verificaSaldo());




    }
}
