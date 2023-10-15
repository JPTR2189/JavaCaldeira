package JavaCaldeira.Exercícios_Java.aula02.ex004;

public abstract class FormaGeometrica {

    protected String forma;
    protected double area;

    public abstract void calcularArea(double base, double altura);

    public abstract String getForma();

}
