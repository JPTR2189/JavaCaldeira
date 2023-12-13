package com.github.javacaldeiraonline.veiculo;

public class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public double calcularCustoViagem(int distancia) {
        // Custo fixo por quilômetro para Carro: R$0.20
        return distancia * 0.20;
    }
}
