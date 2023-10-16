package JavaCaldeira.Exercícios_Java.aula02.ex005;

import java.text.DecimalFormat;

public class ContaCorrente extends Conta {

    double tributos;
    DecimalFormat formatador = new DecimalFormat("#.##");

    @Override
    public double calculaTributos() {
        tributos  = (saldo / 100) * 1;
        System.out.print("A tributação da Conta Corrente é: R$");
        return tributos;
    }

    public double getTributos(){

        return tributos;

    }
}


