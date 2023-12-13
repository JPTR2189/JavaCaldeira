package com.github.javacaldeiraonline.veiculo;

public class Moto extends Veiculo {
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public double calcularCustoViagem(int distancia) {
        // Custo fixo por quilômetro para Moto: R$0.15
        return distancia * 0.15;
    }
}
