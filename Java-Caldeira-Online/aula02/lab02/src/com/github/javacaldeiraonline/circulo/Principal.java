package com.github.javacaldeiraonline.circulo;

public class Principal {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);
        Circulo circulo2 = new Circulo(3);

        System.out.println("Círculo 1:");
        System.out.println(circulo1);
        circulo1.calcularArea();
        circulo1.calcularCircunferencia();
        circulo1.definirRaio(6);

        System.out.println("Círculo 2:");
        System.out.println(circulo2);

        System.out.println("Círculo 1 é igual ao Círculo 2? " + circulo1.saoIguais(circulo2));

        System.out.println("Área sombreada entre os dois círculos: " + circulo1.calcularAreaSombreada(circulo2));

        Circulo circulo3 = Circulo.criarAPartirDeCoordenadas(3, 4, 5);
        System.out.println("Círculo criado a partir das coordenadas (3, 4) e raio 5:");
        System.out.println(circulo3);
    }
}