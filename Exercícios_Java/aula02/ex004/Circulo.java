package JavaCaldeira.Exercícios_Java.aula02.ex004;

public class Circulo extends FormaGeometrica{

    private double area;
    private String forma = "Circulo";

    @Override
    public void calcularArea(double raio, double ignoredaltura) {
        area = 3.14 * (raio * raio);

        System.out.println("A área do círculo é: " + area + "cm2");
    }

    @Override
    public String getForma() {
        return forma;
    }
}
