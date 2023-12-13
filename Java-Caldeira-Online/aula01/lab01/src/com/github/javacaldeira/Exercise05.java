package com.github.javacaldeira;

import java.util.Scanner;

public class Exercise05 {

    /**
     * Exercicio 05:
     * Crie um programa que armazene um horário (hora, minuto e segundo) em variáveis, depois,
     * determine e exiba a quantidade de segundos que se passaram desde as 0h00min0s e
     * a quantidade de segundos que faltam para a meia-noite.
     */

    public static void main(String[] args) {
        //Instancia as variaveis necessárias
        int hour, minute, second;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora [0-23]: ");
        // Sempre utilizar o método nexInt() para valores inteiros
        hour = scanner.nextInt();

        System.out.println("Digite os minutos [0-59]: ");
        minute = scanner.nextInt();

        System.out.println("Digite os segundos [0-59]: ");
        second = scanner.nextInt();

        // Teste básico para checarmos se cada unidade de tempo foi colocada corretamente
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {

            //Converte os valores
            int secondsHavePassed = hour * 3600 + minute * 60 + second;
            //86400 é a quantidade de segundos em 1 dia
            int secondsLeft = 86400 - secondsHavePassed;

            System.out.println("Segundos passados desde 0h00min00s: " + secondsHavePassed);
            System.out.println("Segundos faltando para meia-noite: " + secondsLeft);
        } else {
            System.out.println("Entrada de tempo inválida.");
        }

        scanner.close();
    }

}
