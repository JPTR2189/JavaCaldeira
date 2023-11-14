package JavaCaldeira.Exercícios_Java.aula03.parte2.ex001;

public class Livro {

    private String titulo;
    private String categoria;

    public Livro (String titulo, String categoria){

        this.titulo = titulo;
        this.categoria = categoria;

    }

    public void getInformacoes(){
        System.out.println("--------------------------------------------------");
        System.out.printf("Título do livro: %s\n", titulo);
        System.out.printf("Categoria do livro: %s\n", categoria);
        System.out.println("--------------------------------------------------");


    }

    public String getCategoria(){

        return categoria;

    }

}
