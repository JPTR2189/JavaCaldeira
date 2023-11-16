package JavaCaldeira.Exercícios_Java.aula03.parte2;
import java.util.Map;
import java.util.LinkedHashMap;

// Utilizar o "LinkedHashMap" para associar produtos ao preços
// Imprimir a lista de produtos na ordem em que foram adicionados com "nome" e "preço"
public class ex004 {
    public static void main(String[] args) {

        Map<String, Double> produtos = new LinkedHashMap<>();

        produtos.put("Carne", 24.99);
        produtos.put("Arroz", 14.99);
        produtos.put("Feijão", 11.99);
        produtos.put("Suco", 8.99);

        for(Map.Entry<String, Double> item: produtos.entrySet()){
            System.out.println("-------------------------------------------------");
            System.out.printf("O Produto %s tem o preço de R$%.2f%n \n", item.getKey(), item.getValue());

        }



    }

}
