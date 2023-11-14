package JavaCaldeira.Exercícios_Java.aula03.parte2;
import java.util.Map;
import java.util.HashMap;

// Utilizar "HashMap" para associar "nomes e idades"
// Imprimir a idade de um nome especifíco
// Criar um metódo para imprimir o "nome" das pessoas que estão na "terceira-idade"
// Lidar caso o nome não esteja presente na lista


public class ex002 {
    public static void main(String[] args) {

        // Criando um "HashMap" de "pessoas"
        Map<String, Integer> pessoas = new HashMap<>();

        pessoas.put("Jean", 17);
        pessoas.put("João", 26);
        pessoas.put("Maria", 62);
        pessoas.put("Cleusa", 75);

        // Imprimindo a "idade" de uma "pessoa" especifíca

        String chaveEspecifíca = "Jean";
        if (pessoas.containsKey(chaveEspecifíca)) {
            System.out.printf("A idade de %s é %d\n", chaveEspecifíca, pessoas.get(chaveEspecifíca));
        }else {
            System.out.println("A chave não existe no map");
        }
        System.out.println("----------------------------------------");

        // Imprimindo as pessoas que são da terceira idade na lista
        System.out.printf("Pessoas que são da Terceira Idade na lista: ");
        for(Map.Entry<String, Integer> pessoa: pessoas.entrySet()){
            if(pessoa.getValue() >= 60)
                System.out.printf("%s ", pessoa.getKey());
        }
        System.out.println();
        System.out.println("----------------------------------------");





    }

}
