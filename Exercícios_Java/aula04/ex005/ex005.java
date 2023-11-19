package JavaCaldeira.Exercícios_Java.aula04.ex005;
import java.util.Scanner;
// Criar uma execeção personalizada "IdadeInvalidaException" que herde de "RuntimeException"
// Pedir a idade do usuário, onde se  0 > idade > 120 lançar a execeção "IdadeInvalidaException" com uma mensagem

import java.util.Scanner;

public class ex005 {

    public static void main(String[] args) {
        ex005 classe = new ex005();

        Scanner scanner = new Scanner(System.in);
        int idade = 0;

            try {
                System.out.print("Digite sua idade: ");
                 idade = scanner.nextInt();
                 classe.verificarIdade(idade);
                System.out.println("--------------------------------");
                System.out.printf("Você tem %d anos!\n", idade);
                System.out.println("--------------------------------");


            } catch (IdadeInvalidaException iie) {
                System.out.println("--------------------------------");
                System.out.println("Digite uma idade válida!");
                System.out.println("--------------------------------");



            }


        }

    public void verificarIdade(int idade) throws IdadeInvalidaException{

        if(idade < 0 || idade > 120) throw new IdadeInvalidaException("Digite uma idade válida!");


    }

    }




