package JavaCaldeira.Exercícios_Java.aula02.ex004;

public class Triangulo extends FormaGeometrica{

    private double area;
    private String forma = "Triangulo";

    @Override
    public void calcularArea(double base, double altura) {
        area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area + "cm2");

    }

    @Override
    public String getForma() {
        return forma;
    }
}
