package JavaCaldeira.Exercícios_Java.aula01;
import java.util.Scanner;
public class ex002 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        String n2 = scanner.nextLine();

        System.out.printf("Digite outro número: ");
        String n1 = scanner.nextLine();

        System.out.printf("Os número digitados foram: " + n1 + " e " + n2);


    }
}
