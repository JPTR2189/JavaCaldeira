package com.github.javacaldeiraonline.figurasgeometricas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FormaGeometrica> formas = new ArrayList<>();
        
        formas.add(new Retangulo("Retângulo 1", 5.0, 10.0));
        formas.add(new Circulo("Círculo 1", 3.0));
        formas.add(new Triangulo("Triângulo 1", 4.0, 6.0));
        formas.add(new Quadrado("Quadrado 1", 4.0));
        formas.add(new Losango("Losango 1", 8.0, 6.0));

        for (FormaGeometrica forma : formas) {
            System.out.println("Área da " + forma.nome + ": " + forma.calcularArea());
        }

    }
}
