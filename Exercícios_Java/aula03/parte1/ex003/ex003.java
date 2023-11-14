package JavaCaldeira.Exercícios_Java.aula03.parte1.ex003;
import java.util.ArrayList;
import java.util.List;


// Criar uma lista de tarefas com ArrayList
// Deve conter metódos como adicionar, remover e exbir tarefas
// Criar um objeto com nome "Tarefa" com os atributos: "titulo, data e descrição"
public class ex003 {

    public static void main(String[] args) {
        List<Tarefa> listaDeTarefas = new ArrayList<Tarefa>();

        Tarefa tarefa = new Tarefa("Arrumar a casa", "13/11", "Começar pelo quarto");
        Tarefa tarefa2 = new Tarefa("Estudar programação", "14/11", "Estrutura de dados em Java");
        Tarefa tarefa3 = new Tarefa("Ensaiar música no Teclado", "15/11", "Solo da músicia 'Real Love Hilsong Young & Free'");

        listaDeTarefas.add(tarefa);
        listaDeTarefas.add(tarefa2);
        listaDeTarefas.add(tarefa3);

        //listaDeTarefas.remove(tarefa);


        for(Tarefa item:listaDeTarefas){

            item.getDadosTarefa();


        }

    }

}

