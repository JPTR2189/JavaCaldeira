package com.github.javacaldeira;

import java.util.Scanner;

public class Exercise01 {

    /**
     * Exercicio 01:
     * Crie um programa que leia seu nome e imprima na tela.
     */

    public static void main(String[] args) {
        // Instancia um objeto da classe Scanner para podermos interagir com o terminal
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        // Lê a entrada do usuário e associa a variável 'name' do tipo String para usarmos depois
        String name = scanner.nextLine();
        System.out.println("O nome digitado é: " + name);

        //Boa prática: Sempre fechar o Scanner
        scanner.close();
    }

}