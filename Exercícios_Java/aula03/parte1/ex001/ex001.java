package JavaCaldeira.Exercícios_Java.aula03.parte1.ex001;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class ex001 {
    public static void main(String[] args) {

        int[] numeros = new int[5];
        int soma = 0;
        int media = 0;

        Scanner scanner = new Scanner(System.in);

        for (int x = 0; x <= 4; x++) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();
            numeros[x] = numero;

        }

        for(int num: numeros){
            soma += num;
        }

        media = soma / numeros.length;

        System.out.printf("A soma de todos os números foi %d e a média deles foi %d" , soma, media);



    }


}
