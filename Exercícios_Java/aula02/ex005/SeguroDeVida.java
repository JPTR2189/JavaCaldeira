package JavaCaldeira.Exercícios_Java.aula02.ex005;

public class SeguroDeVida implements Tributavel {

    double tributos = 42;
    @Override
    public double calculaTributos() {
        System.out.print("A tributação do Seguro de Vida é: R$");
        return tributos;
    }

    public double getTributos(){

        return tributos;

    }
}
