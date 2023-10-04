package JavaCaldeira.Exercícios_Java.aula001;
import java.util.Scanner;
public class ex006 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


        System.out.printf("Digite sua idade: ");
        int idade = scanner.nextInt();

        if(idade < 16){
            System.out.printf("Você não pode votar!");
        }

        else if(idade >= 16 && idade <= 17){
            System.out.printf("Seu voto é FACULTATIVO!");

        } else if (idade >= 65) {
            System.out.printf("Seu voto é FACULTATIVO!");
            
        }

        else{
            System.out.printf("Seu voto é OBRIGATÓRIO!");
        }

    }
}
