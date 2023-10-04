package JavaCaldeira.Exercícios_Java.aula01;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ex003 {

    public static void main(String[] args) {

        List lista = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        String n1 = scanner.nextLine();
        lista.add(n1);

        System.out.printf("Digite outro número: ");
        String n2 = scanner.nextLine();
        lista.add(n2);

        System.out.printf("Digite outro número: ");
        String n3 = scanner.nextLine();
        lista.add(n3);

        System.out.printf("O maior número digitado foi " + Collections.max(lista) + " e o menor foi " + Collections.min(lista));


    }

}


