package JavaCaldeira.Exercícios_Java.aula02;
import javax.naming.directory.SchemaViolationException;
import java.util.Scanner;


public class ex002 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();


        Circulo circulo = new Circulo(raio);

        while (true) {
            System.out.println("------------------------------------");

            System.out.printf("Escolha uma opção:\n" +
                    "0 - Sair do programa\n" +
                    "1 - Calcular a área\n" +
                    "2 - Calcular a circunferência\n" +
                    "3 - Calcular diâmetro do círculo\n" +
                    "4 - Comparar 2 círculos\n" +
                    "5 - Definir novo raio\n");

            System.out.println("------------------------------------");


            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("------------------------------------");
                System.out.println("Até logo!");
                System.out.println("------------------------------------");
                break;
            }

            switch (opcao){

                case 1:
                    circulo.calcularArea();
                    break;

                case 2:
                    circulo.calcularCircufenrencia();
                    break;

                case 3:
                    circulo.calcularDiametro();
                    break;

                case 4:
                    System.out.println("Raio do círculo 1:");
                    double circulo1 = scanner.nextInt();

                    System.out.println("Raio do círculo 2: ");
                    double circulo2 = scanner.nextInt();

                    circulo.compararDoisCirculos(circulo1, circulo2);

                    break;

                case 5:
                    System.out.printf("Digite o raio do círculo: ");
                    double novoRaio = scanner.nextDouble();
                    circulo.definirRaio(novoRaio);

                    break;

            }

        }



    }
}
