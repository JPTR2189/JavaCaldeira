package JavaCaldeira.Exercícios_Java.aula02.ex005;

public class ContaPoupança extends Conta {

    double tributos = 0;

    @Override
    public double calculaTributos() {
        System.out.print("A conta pupança não tem tributos: R$");
        return tributos;
    }

    public double getTributos(){

        return tributos;

    }
}
