package com.github.javacaldeiraonline.veiculo;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2020);
        Moto minhaMoto = new Moto("Honda", "CBR", 2021);

        int distanciaViagem = 100; // Distância em quilômetros

        double custoCarro = meuCarro.calcularCustoViagem(distanciaViagem);
        double custoMoto = minhaMoto.calcularCustoViagem(distanciaViagem);

        System.out.println("Custo da viagem de carro: R$" + custoCarro);
        System.out.println("Custo da viagem de moto: R$" + custoMoto);
    }
}
