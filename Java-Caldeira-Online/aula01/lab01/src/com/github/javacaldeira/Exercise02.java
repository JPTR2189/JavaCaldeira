package com.github.javacaldeira;

import java.util.Scanner;

public class Exercise02 {

    /**
     * Exercicio 02:
     * Crie um programa que receba 2 números e imprima na tela.
     */

    public static void main(String[] args) {
        //Cria as variaveis que vamos utilizar depois
        double firstNumber;
        double secondNumber;

        // Instancia um objeto da classe Scanner para podermos interagir com o terminal
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        // Lê a entrada do usuário e associa a variável 'firstNumber' do tipo double para usarmos depois
        firstNumber = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        secondNumber = scanner.nextDouble();

        System.out.println("Primeiro numero: " + firstNumber);
        System.out.println("Segundo numero: " + secondNumber);

        scanner.close();
    }
}