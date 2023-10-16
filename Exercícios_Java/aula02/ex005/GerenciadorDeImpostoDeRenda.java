package JavaCaldeira.Exercícios_Java.aula02.ex005;

import com.sun.source.tree.BreakTree;

public class GerenciadorDeImpostoDeRenda {
    private double somaTotalDosAtributos = 0;


    public void adicionarTributaveis(Tributavel tributavel){

        this.somaTotalDosAtributos += tributavel.getTributos();


    }

    public double getSomaDosTributos() {

        return somaTotalDosAtributos;

    }


}
