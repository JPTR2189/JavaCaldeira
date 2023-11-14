package JavaCaldeira.Exercícios_Java.aula03.parte1.ex004;
import java.util.LinkedList;

// Criar um objeto "Reserva" com os atributos: " nome, destino, cpf, data de entrada e data de saída"
// Deve permitir a reserva, cancelamento e exibimento das passagens
// Usar um LinkedList para reservar as passagens
public class ex004 {

    public static void main(String[] args) {

        LinkedList<Reserva> reservas = new LinkedList<>();


    Reserva reservaJean = new Reserva("Jean", "Alemanha", "4536455287", "28/11", "16/12");
    Reserva reservaAllan = new Reserva("Allan", "Canadá", "5166846173", "05/11", "04/12");

    reservas.add(reservaJean);
    reservas.add(reservaAllan);
    //reservas.removeFirst();

    for(Reserva item:reservas){
        item.getDados();
    }
    }

}
