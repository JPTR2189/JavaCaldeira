package JavaCaldeira.Exercícios_Java.aula02.ex003;

public class Carro extends Veiculo {

    @Override
    public void calcularCustoViagem(int distancia) {
        super.calcularCustoViagem(distancia);
        System.out.println("O custo da sua viagem vai custar: R$" + distancia * 0.20);

    }
}
