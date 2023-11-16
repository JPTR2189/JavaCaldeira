package JavaCaldeira.Exercícios_Java.aula04.ex001;

// Criar uma interface com nome "Desenhavel"
// Criar um método chamado "Desenhar" na interface
// Criar duas classes "Circulo" e "Quadrado" que implementem a interface com ações diferentes para o método "Desenhar"
public class ex001 {
    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();

        quadrado.Desenhar();
        circulo.Desenhar();

    }


}

