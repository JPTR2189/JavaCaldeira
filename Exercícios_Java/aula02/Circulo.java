package JavaCaldeira.Exercícios_Java.aula02;

import java.text.DecimalFormat;

public class Circulo {

    DecimalFormat formatador = new DecimalFormat("#.##");
    private double raio;

    public Circulo(double raio){

        this.raio = raio;

    }

    public void calcularArea(){
        double area = 3.14 * (raio * raio) ;

        System.out.println("------------------------------------");
        System.out.println("A área do círculo é: " + formatador.format(area));
        System.out.println("------------------------------------");
    }

    public void calcularCircufenrencia(){
       double circunferencia = (2 * 3.14) * (raio * raio);
        System.out.println("------------------------------------");
        System.out.println("A circunferência do círculo: " + formatador.format(circunferencia));
        System.out.println("------------------------------------");

    }

    public void calcularDiametro(){
        double diametro = raio * 2;
        System.out.println("------------------------------------");
        System.out.println("O diâmetro do círculo é: " + formatador.format(diametro));
        System.out.println("------------------------------------");
    }

    public void compararDoisCirculos(double circulo1, double circulo2){

        if (circulo1 > circulo2){
            System.out.println("------------------------------------");
            System.out.println("O Círculo 1 tem o raio maior (" + circulo1 + ")");
            System.out.println("------------------------------------");
        }
        else if (circulo2 > circulo1){
            System.out.println("------------------------------------");
            System.out.println("O Círculo 2 tem o raio maior (" + circulo2 + ")");
            System.out.println("------------------------------------");
    }    else
        {
            System.out.println("------------------------------------");
            System.out.println("Os dois círculos tem o raio igual");
            System.out.println("------------------------------------");
        }
    }

    public void definirRaio(double raio){

        this.raio = raio;

    }

}
