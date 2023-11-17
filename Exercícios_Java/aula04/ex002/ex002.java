package JavaCaldeira.Exercícios_Java.aula04.ex002;
import java.util.Scanner;

// Criar um ENUM chamado "DiaDaSemana" representando os dias da semana
// Escrever um programa que aceite um dia pelo usuário e imprima uma mensagem personalizada

public class ex002 {

    public static void main(String[] args) {



    Scanner scanner = new Scanner(System.in);

    System.out.print("Escolha um dia da semana: ");
    System.out.println("\n 1- SEGUNDA\n 2- TERÇA\n 3- QUARTA\n 4- QUINTA\n 5- SEXTA\n 6- SÁBADO\n 7- DOMINGO");
    System.out.print("--> ");
    int escolha = scanner.nextInt();

    switch (escolha) {
        case 1:
            System.out.printf("Você escolheu %s, é dia de Pizzaria!\n",DiasDaSemana.SEGUNDA);
            break;
        case 2:
            System.out.printf("Você escolheu %s, é dia de Boliche!\n",DiasDaSemana.TERÇA);
            break;
        case 3:
            System.out.printf("Você escolheu %s, é dia de de passear no parque!\n",DiasDaSemana.QUARTA);
            break;
        case 4:
            System.out.printf("Você escolheu %s, é dia de ir ao Shopping!\n",DiasDaSemana.QUINTA);
            break;
        case 5:
            System.out.printf("Você escolheu %s, é dia de ir a uma Festa!\n",DiasDaSemana.SEXTA);
            break;
        case 6:
            System.out.printf("Você escolheu %s, é dia de jogar futebol!\n",DiasDaSemana.SÁBADO);
            break;
        case 7:
            System.out.printf("Você escolheu %s, é dia de Descansar!\n",DiasDaSemana.DOMINGO);
            break;
        default:
            System.out.println("Escolha uma opção válida!");
    }



    }
}
