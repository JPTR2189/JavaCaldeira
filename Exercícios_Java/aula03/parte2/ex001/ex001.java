package JavaCaldeira.Exercícios_Java.aula03.parte2.ex001;
import java.io.*;
import java.util.*;


// Criar um objeto "Livro" com: "titulo e categoria"
// Criar umas "Stack" para armazenar objetos da classe "Livro"
// Inicializar a pilha com alguns livros
// Imprimir os elementos da pilha
// Imprimir com base na "Categoria" do livro
// Implementar um loop para remover todos os livros da pilha

import java.util.Stack;

public class ex001{

    public static void main(String[] args) {

        // Criando a pilha "Livros"

        Stack<Livro> livros = new Stack<>();

        // Instanciando os objetos do tipo "Livro"

        Livro livroPequenoPrincipe = new Livro("Pequeno Príncipe", "Fábula");
        Livro livroCulpaDasEstrelas = new Livro("A Culpa é das estrelas", "Romance" );
        Livro livroDiarioDeUmBanana = new Livro("Diário de um banana: Bons tempos", "Romance" );

        // Inicializando a pilha

        livros.push(livroPequenoPrincipe);
        livros.push(livroCulpaDasEstrelas);
        livros.push(livroDiarioDeUmBanana);

        // Imprimindo todos os elementos da pilha

        for(Livro item:livros){
            item.getInformacoes();

        }

        // Imprimindo os elementos conforme a categoria "Romance"

        System.out.println("******************************");
        System.out.println("Livros da Categoria Romance: ");
        System.out.println("******************************");
        System.out.println();


        for(Livro item:livros){

            if (item.getCategoria().equals("Romance")){
                item.getInformacoes();

        }
        }

        // Removendo todos os elementos da pilha

        for(int pos = livros.size(); pos >= 0; pos--)
        {
            System.out.printf("Restam %d livros na pilha\n",livros.size());

            if(pos != 0)
                livros.pop();
        }

    }
}
