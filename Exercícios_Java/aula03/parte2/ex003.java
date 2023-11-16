package JavaCaldeira.Exercícios_Java.aula03.parte2;

import java.lang.reflect.Array;
import java.util.*;

// Utilizar TreeMap para criar uma agenda telefônica
// Agenda deve conter número de telefone, nome, endereço e local da cidade (norte, sul, centro, leste e oeste)
// Associar "nomes" aos "números de telefone"
// Imprimir a lista de contatos em ordem alfabética
// Imprimir os contatos com base na localidade
public class ex003 {
    public static void main(String[] args) {

        // Criando a agenda com o "TreeMap"
        Map<String, List<String>> agenda = new TreeMap<>();

        // Criando os dados de cada pessoa e adicionando no "TreeMap"
        List<String> dadosJean = new ArrayList<>();

        dadosJean.add("Telefone: 5198547137");
        dadosJean.add("Rua: Santo antônio 23");
        dadosJean.add("Norte");
        agenda.put("Jean", dadosJean);

        List<String> dadosMaria = new ArrayList<>();

        dadosMaria.add("5368491241");
        dadosMaria.add("São francisco 358");
        dadosMaria.add("Sul");
        agenda.put("Maria", dadosMaria);

        List<String> dadosAlice = new ArrayList<>();

        dadosAlice.add("047864329");
        dadosAlice.add("Luiz gonzaga 89");
        dadosAlice.add("Oeste");
        agenda.put("Alice", dadosAlice);

        List<String> dadosBruno = new ArrayList<>();

        dadosBruno.add("52763887187");
        dadosBruno.add("Cirne lima 36");
        dadosBruno.add("Centro");
        agenda.put("Bruno", dadosBruno);




        // Criando uma estrutura de dados para armazenar os nomes em ordem alfabética
        SortedSet<String> nomesEmOrdemAlfabetica = new TreeSet<>();

        for(Map.Entry <String, List<String>> item: agenda.entrySet()){
            nomesEmOrdemAlfabetica.add(item.getKey());
        }

        // Imprimindo os dados
        for(Map.Entry <String, List<String>> item: agenda.entrySet()){

            System.out.printf("%s - Dados: %s\n", item.getKey(), item.getValue());
            System.out.println("*********************************************************************************");

        }

        // Imprimindo os dados pela localidade

        String localidade = "Sul";

        for(Map.Entry <String, List<String>> item: agenda.entrySet()){
            System.out.println();
            System.out.printf("**** Pessoas no %s: ****\n", item.getValue().get(2));
            System.out.println("-------------------------------------------------------");
            System.out.printf("%s - Dados: %s\n", item.getKey(), item.getValue());
            System.out.println("-------------------------------------------------------");




        }




    }
}

