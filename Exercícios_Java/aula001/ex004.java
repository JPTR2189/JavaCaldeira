package JavaCaldeira.Exercícios_Java.aula001;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.DateFormat;
public class ex004 {
    public static void main(String[] args) {

        int salarioMinimo = 1320;

        DecimalFormat formatador = new DecimalFormat("#.##git ");

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite seu salário: ");
        String salario = scanner.nextLine();

        Float numeroConvertido = Float.parseFloat(salario);
        Float quantidadeDeSalariosMinimos = Float.valueOf(formatador.format(numeroConvertido));


        System.out.println("Seu salário vale " + quantidadeDeSalariosMinimos/ salarioMinimo + " salários minímos");





    }

}
