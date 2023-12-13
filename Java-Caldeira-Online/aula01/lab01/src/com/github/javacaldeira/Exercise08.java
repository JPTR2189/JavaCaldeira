package com.github.javacaldeira;

import java.util.Scanner;

public class Exercise08 {

    /**
     * Exercicio 08:
     * Criar um algoritmo para definir as filas prioritárias. Seu programa deve exibir um menu de opções,
     * perguntando se a pessoa é Gestante, Idosa, PCD ou Nenhuma das alternativas.
     * Se ela for PCD, Idosa ou Gestante, tem direito a fila prioritária. Se não, não tem direito.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione uma opção:");
        System.out.println("1. Gestante");
        System.out.println("2. Idosa");
        System.out.println("3. Pessoa com Deficiência (PCD)");
        System.out.println("4. Nenhuma das alternativas");

        /* Esse exercício poderia ser feito utilizando ifs mas, nesse caso,
           vamos usar o switch porque facilita a leitura do código
        */

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Você tem direito à fila prioritária como gestante.");
                break;
            case 2:
                System.out.println("Você tem direito à fila prioritária como pessoa idosa.");
                break;
            case 3:
                System.out.println("Você tem direito à fila prioritária como pessoa com deficiência (PCD).");
                break;
            case 4:
                System.out.println("Você não tem direito à fila prioritária.");
                break;
            default:
                // É sempre bom ter o item 'default' quando utilzamos o 'switch'
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
