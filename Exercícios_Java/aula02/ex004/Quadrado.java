package JavaCaldeira.Exercícios_Java.aula02.ex004;

public class Quadrado extends FormaGeometrica{

    private double area;
    private String forma = "Quadrado";
    @Override
    public void calcularArea(double base, double altura) {
        area = base * altura;

        System.out.println("A área do quadrado é: " + area + "cm2");

    }

    @Override
    public String getForma() {
        return forma;
    }
}
