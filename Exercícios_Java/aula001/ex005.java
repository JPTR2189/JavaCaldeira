package JavaCaldeira.Exercícios_Java.aula001;
import java.util.Scanner;

// Armazenar 'HORA', 'MINUTOS' e 'SEGUNDOS' em variáveis
// Converter tudo para segundos
// Quantidade de 'SEGUNDOS' que passaram desde a meia-noite
// Quantidade de 'SEGUNDOS' que faltam até a meia-noite

public class ex005 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Pegando a quantidade de HORAS e convertendo para SEGUNDOS

            System.out.printf("Digite apenas as 'HORAS' que são agora: ");
            int hora = scanner.nextInt();

            // Verificando se as HORAS estão dentro padrão
            if(hora < 0 || hora > 23){
                System.out.printf("HORA INVÁLIDA!");
                break;

            }// Convertendo HORAS para SEGUNDOS
            int horaEmSegundos = hora * 3600;

            // Pegando quantidade de MINUTOS e convertendo para SEGUNDOS

            System.out.printf("Digite apenas os 'MINUTOS' que são agora: ");
            int minutos = scanner.nextInt();

            // Verificando se os MINUTOS estão dentro padrão
            if(minutos < 0 || minutos > 60) {
                System.out.printf("MINUTOS INVÁLIDOS!");
                break;
            }

            // Convertendo MINUTOS para SEGUNDOS
            int minutosEmSegundos = minutos * 60;


            // Pegando a quantidade de SEGUNDOS
            System.out.printf("Digite apenas os 'SEGUNDOS' que são agora: ");
            int segundos = scanner.nextInt();

            if(segundos < 0 || segundos > 60 ){

                System.out.printf("SEGUNDOS INVÁLIDOS!");
                break;

            }

            // Imprimindo o Resultado
            int segundosPassadosDesdeMeiaNoite = horaEmSegundos + minutosEmSegundos + segundos;
            System.out.println("Se passaram " + segundosPassadosDesdeMeiaNoite + " 'SEGUNDOS' desde a meia noite");

            int segundosQueFaltamAteMeiaNoite = 86400 - segundosPassadosDesdeMeiaNoite;
            System.out.println("Faltam " + segundosQueFaltamAteMeiaNoite + " 'SEGUNDOS' para meia noite");
            scanner.close();
            break;
        }


    }

}
