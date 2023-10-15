package JavaCaldeira.Exercícios_Java.aula02.ex004;

public class Retangulo extends FormaGeometrica {

    private double area;
    private String forma = "Retangulo";




    @Override
    public void calcularArea(double base, double altura) {
        area = base * altura;

        System.out.println("A área do retângulo é: " + area + "cm2");

    }

    @Override
    public String getForma() {
        return forma;
    }
}
