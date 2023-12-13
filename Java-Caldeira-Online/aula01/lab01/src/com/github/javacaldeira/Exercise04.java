package com.github.javacaldeira;

import java.util.Scanner;

public class Exercise04 {

    /**
     * Exercicio 04:
     * Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário,
     * calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado,
     * assuma que o salário mínimo é R$1.320.
     */

    public static void main(String[] args) {
        // Variável com o valor fornecido no exercício
        double minimumWage = 1320.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do salário:");
        double wage = scanner.nextDouble();

        double quantity = wage / minimumWage;

        // Primeiro exemplo de como formatar o resultado para exibir apenas duas casas decimais
        String formattedResult = String.format("%.2f", quantity);
        System.out.println("O usuário ganha " + formattedResult + " salários mínimos.");

        // Segundo exemplo de formatação
        System.out.printf("O usuário ganha %.2f salários mínimos.", quantity);

        scanner.close();
    }
}