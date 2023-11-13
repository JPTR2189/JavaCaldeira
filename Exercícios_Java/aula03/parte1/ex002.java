package JavaCaldeira.Exercícios_Java.aula03.parte1;
import java.util.Scanner;
import java.util.Random;

// Array com 10 números inteiros aleatórios de 1 a 100
// Usuário inserir um número e verificar se ele esta presente no Array
// Exibir mensagem dizendo se o número foi encontrado ou não
public class ex002 {
    public static void main(String[] args) {

        // Sorteio e armazenamento dos números
        int[] numeros = new int [10];
        Random random = new Random();

        for (int x = 0; x <= 9; x++) {

            int numeroAleatorio = random.nextInt(101);
            numeros[x] = numeroAleatorio;
        }


        // Verificação do usuário na lista
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar na lista: ");
        int numeroVerificadoNaLista = scanner.nextInt();

        for(int posicao = 0; posicao <= 9; posicao++) {
            if (numeroVerificadoNaLista == numeros[posicao]){
                System.out.println("O número está na lista!");
                break;
            } else if (posicao == 9){
                System.out.println("O número NÃO está na lista!");
            }
        }
        System.out.println("--------------------------------------------");
        System.out.printf("Números na lista [");

        for (int num:numeros){
            System.out.printf(" %d ", num);
        }

        System.out.printf("]");
    }
}