package com.github.javacaldeira;

import java.util.Scanner;

public class Exercise07 {

    /**
     * Exercicio 07:
     * Criar para uma empresa de consórcio. No teste inicial, você deve perguntar
     * para o usuário a idade dele e o seu salário. A pessoa só pode comprar um automóvel
     * se for de maior e ganhar mais de R$ 2.000,00.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int age = scanner.nextInt();

        System.out.println("Digite seu salário: ");
        double wage = scanner.nextDouble();

        //Sempre cuidar com os itens '>=' e '>'
        if (age >= 18 && wage > 2000.00) {
            System.out.println("Pode comprar um automóvel!!");
        } else {
            System.out.println("Vixi, ou você tem idade menor que 18 anos ou não tem a verba suficiente :/");
        }

        scanner.close();
    }
}
