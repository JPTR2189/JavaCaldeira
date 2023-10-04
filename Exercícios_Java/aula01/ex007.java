package JavaCaldeira.Exercícios_Java.aula001;
import java.util.Scanner;
public class ex007 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Qual a sua idade? ");
        int idade = scanner.nextInt();

        System.out.printf("Qual seu salário? ");
        double salario = scanner.nextDouble();

        if(idade >= 18 && salario >= 2000){
            System.out.printf("Você pode comprar um automóvel!");

        }
        else {
            System.out.printf("Você não pode comprar um automóvel!");
        }
    }
}
