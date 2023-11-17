package JavaCaldeira.Exercícios_Java.aula04.ex004;

import java.util.InputMismatchException;
import java.util.Scanner;

// Dar continuidade ao ex003
// Criar uma interface "Calculavel" com métodos "somar, subtrair, multiplicar e dividir números inteiros"
// Implementar a interface na classe principal e use um "enum" para selecionar o metódo
// Trate exceções adequadas como "divisão por zero ou operação inválida"
public class ex004 implements Calculavel  {

    public static void main(String[] args) {

        ex004 classe = new ex004();
        Scanner scanner = new Scanner(System.in);

        boolean keepGoing = true;

        while(keepGoing)
        {
            int numero1 = 0;
            int numero2 = 0;


                try {

                    System.out.print("Digite um número inteiro: ");
                    numero1 = scanner.nextInt();
                    System.out.print("Digite outro número inteiro: ");
                    numero2 = scanner.nextInt();

                } catch(InputMismatchException ime){

                    System.out.println("Digite um número inteiro válido!");
                    break;


                }

            System.out.println("************************************");
            System.out.printf("Selecione a operação:\n\n 1- %s\n 2- %s\n 3- %s\n 4- %s\n 5- SAIR", Metodos.SOMAR, Metodos.SUBTRAIR, Metodos.MULTIPLICAR, Metodos.DIVIDIR);
            System.out.println();
            System.out.print("--> ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    classe.SOMAR(numero1, numero2);
                    break;
                case 2:
                    classe.SUBTRAIR(numero1, numero2);
                    break;
                case 3:
                    classe.MULTIPLICAR(numero1, numero2);
                    break;
                case 4:
                    classe.DIVIDIR(numero1, numero2);
                    break;
                case 5:
                    keepGoing = false;
                    break;
                default:
                    System.out.println("Opção inválida!");

            }
        }

    }

    @Override
    public void SOMAR(int numero1, int numero2) {
        int operacao = numero1 + numero2;

        System.out.println("--------------------------------");
        System.out.printf("A Soma dos números é: %d\n", operacao);
        System.out.println("--------------------------------");

    }

    @Override
    public void SUBTRAIR(int numero1, int numero2) {
        int operacao = numero1 - numero2;

        System.out.println("--------------------------------");
        System.out.printf("A Subtração dos números é: %d\n", operacao);
        System.out.println("--------------------------------");


    }

    @Override
    public void MULTIPLICAR(int numero1, int numero2) {
        int operacao = numero1 * numero2;

        System.out.println("--------------------------------");
        System.out.printf("A Multiplicação dos números é: %d\n", operacao);
        System.out.println("--------------------------------");


    }

    @Override
    public void DIVIDIR(double numero1, double numero2) {
        double operacao = 0;
        try {
             operacao = numero1 / numero2;
            System.out.println("--------------------------------");
            System.out.printf("A Divisão dos números é: %.2f%n\n", operacao);
            System.out.println("--------------------------------");


        } catch (ArithmeticException ae){
            System.out.println("--------------------------------");
            System.out.println("Não possível dividir um número por 0");
            System.out.println("--------------------------------");

        }



    }
}
