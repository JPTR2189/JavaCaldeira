package com.github.javacaldeira;

import java.util.Scanner;

public class Exercise03 {

    /**
     * Exercicio 03:
     * Crie um programa que leia 3 números, imprima o maior, o menor e a média aritmética.
     */

    public static void main(String[] args) {
        // Cria as variaveis necessárias para o programa
        double firstNumber, secondNumber, thirdNumber, maxValue, minValue, arithmeticMean;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        firstNumber = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        secondNumber = scanner.nextDouble();

        System.out.println("Digite o terceiro numero: ");
        thirdNumber = scanner.nextDouble();

        //Primeira solução: usando if
        //Encontrar o maior número
        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) {
                maxValue = firstNumber;
            } else {
                maxValue = thirdNumber;
            }
        } else {
            if (secondNumber > thirdNumber) {
                maxValue = secondNumber;
            } else {
                maxValue = thirdNumber;
            }
        }

        //Encontrar o menor número
        if (firstNumber < secondNumber) {
            if (firstNumber < thirdNumber) {
                minValue = firstNumber;
            } else {
                minValue = thirdNumber;
            }
        } else {
            if (secondNumber < thirdNumber) {
                minValue = secondNumber;
            } else {
                minValue = thirdNumber;
            }
        }

        //Sempre usar parenteses para definir a prioridade nos cálculos
        arithmeticMean = (firstNumber + secondNumber + thirdNumber) / 3.0;

        System.out.println("[Solução com if] O maior número é: " + maxValue);
        System.out.println("[Solução com if] O menor número é: " + minValue);
        System.out.println("[Solução com if] A média aritmética é: " + arithmeticMean);

        //Segunda solução: usando métodos da classe Math
        maxValue = Math.max(Math.max(firstNumber, secondNumber), thirdNumber);
        minValue = Math.min(Math.min(firstNumber, secondNumber), thirdNumber);

        System.out.println("[Solução com Math] O maior número é: " + maxValue);
        System.out.println("[Solução com Math] O menor número é: " + minValue);
        System.out.println("[Solução com Math] A média aritmética é: " + arithmeticMean);

        scanner.close();
    }
}