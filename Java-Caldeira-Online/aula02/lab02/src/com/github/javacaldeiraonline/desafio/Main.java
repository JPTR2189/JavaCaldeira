package com.github.javacaldeiraonline.desafio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra/frase: ");
        String texto = scanner.nextLine();

        //Resolução
        StringBuilder reverso = new StringBuilder();
        for (int i = texto.length() - 1; i >=0; i--) {
            reverso.append(texto.charAt(i));
        }


        System.out.println("Texto ao contrário: " + reverso.toString().toString());
    }
}
