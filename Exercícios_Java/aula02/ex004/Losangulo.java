package JavaCaldeira.Exercícios_Java.aula02.ex004;

public class Losangulo extends FormaGeometrica {

    private double area;
    private String forma = "Losangulo";

    @Override
    public void calcularArea(double diagonalMaior, double diagonalMenor) {
        area = (diagonalMaior * diagonalMenor) / 2;

        System.out.println("A área do losango é: " + area + "cm2");
    }

    @Override
    public String getForma() {
        return forma;
    }
}
