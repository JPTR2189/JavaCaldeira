package JavaCaldeira.Exercícios_Java.aula01;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {

        int salarioMinimo = 1320;

        DecimalFormat formatador = new DecimalFormat("#.## ");

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite seu salário: ");
        String salario = scanner.nextLine();

        Float numeroConvertido = Float.parseFloat(salario);
        Float quantidadeDeSalariosMinimos = numeroConvertido;

        Float total = quantidadeDeSalariosMinimos/ salarioMinimo;

        System.out.println("Seu salário vale " + formatador.format(total) + " salários minímos");





    }

}
