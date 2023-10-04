package JavaCaldeira.Exercícios_Java.aula001;
import java.util.Scanner;
public class ex008 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.printf("OPÇÕES:\n" +
                "1 - Gestante\n" +
                "2 - Idoso(a)\n" +
                "3 - PCD\n" +
                "4 - Outro\n\n");

        System.out.printf("Sua opção: ");

        int opcao = scanner.nextInt();

        switch (opcao){

            case 1:
                System.out.printf("Você tem direito a fila PRIORITÁRIA!\n");
                break;
            case 2:
                System.out.printf("Você tem direito a fila PRIORITÁRIA!\n");
                break;
            case 3:
                System.out.printf("Você tem direito a fila PRIORITÁRIA!\n");
                break;
            default:
                System.out.printf("Você NÃO tem direito a fila prioritária!");

        }

    }
}
