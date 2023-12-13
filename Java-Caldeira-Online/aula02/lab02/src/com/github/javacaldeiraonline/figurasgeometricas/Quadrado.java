package com.github.javacaldeiraonline.figurasgeometricas;

public class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }


    @Override
    public double calcularArea() {
        return lado * lado;
    }

}
