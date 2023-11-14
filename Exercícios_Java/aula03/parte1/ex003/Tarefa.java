package JavaCaldeira.Exercícios_Java.aula03.parte1.ex003;

import java.sql.Struct;

public class Tarefa {

    private String titulo;
    private String data;
    private String descricao;

    public Tarefa (String titulo, String data, String descricao){
        this.titulo = titulo;
        this.data = data;
        this.descricao = descricao;

    }

    public void getDadosTarefa(){
        System.out.printf("Titulo: %s\n", titulo);
        System.out.printf("Data: %s\n", data);
        System.out.printf("Descrição: %s\n", descricao);
        System.out.println("---------------------------------------");

    }

}
