package com.github.javacaldeiraonline.figurasgeometricas;

public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
