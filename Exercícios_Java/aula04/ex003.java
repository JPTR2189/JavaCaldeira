package JavaCaldeira.Exercícios_Java.aula04;
import java.util.InputMismatchException;
import java.util.Scanner;

// Solicitar ao usuário 2 números inteiros
// Utilizar "exceções" para lidar com uma entrada inválida e exbir uma mensagem

public class ex003 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Digite um número: ");
            int numero1 = scanner.nextInt();
            System.out.print("Digite outro número: ");
            int numero2 = scanner.nextInt();
        } catch (InputMismatchException ime){
            System.out.println("Digite um número inteiro válido!");
        }


    }



}
