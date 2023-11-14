package JavaCaldeira.Exercícios_Java.aula03.parte1.ex004;

public class Reserva {

    private String nome;
    private String destino;
    private String cpf;
    private String dataDeEntrada;
    private String dataDeSaida;


public Reserva (String nome, String destino, String cpf, String dataDeEntrada, String dataDeSaida){

    this.nome = nome;
    this.destino = destino;
    this.cpf = cpf;
    this.dataDeEntrada = dataDeEntrada;
    this.dataDeSaida = dataDeSaida;


}

public void getDados(){

    System.out.printf("Nome: %s\n", nome);
    System.out.printf("Destino: %s\n", destino);
    System.out.printf("CPF: %s\n", cpf);
    System.out.printf("Data de Embarque: %s\n", dataDeEntrada);
    System.out.printf("Data de Retorno: %s\n", dataDeSaida);
    System.out.println("---------------------------------------------");


}


}
