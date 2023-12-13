package com.github.javacaldeiraonline.tributacao;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeImpostoDeRenda {
    private double totalTributos;
    private List<Tributavel> tributaveis;

    public GerenciadorDeImpostoDeRenda() {
        totalTributos = 0;
        tributaveis = new ArrayList<>();
    }

    public void adicionar(Tributavel tributavel) {
        tributaveis.add(tributavel);
    }

    public void calcularTotalTributos() {
        for (Tributavel tributavel : tributaveis) {
            totalTributos += tributavel.calculaTributos();
        }
    }

    public double getTotalTributos() {
        return totalTributos;
    }
}
