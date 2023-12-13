## Estruturas de Dados em Java Parte 2 📦📋📚🗺️

**Conjuntos(Set) e HashSet** 🎁🎁🎁

Imagine uma caixa onde você coloca brinquedos 🎁, mas ela não aceita brinquedos iguais. Isso é um conjunto em Java. Ele armazena coisas únicas, então, se você tentar colocar o mesmo item duas vezes, ele só vai manter uma cópia. "HashSet" é uma das implementações da interface "Set" em Java, o termo Hash diz respeito a uma função que transforma um valor em outro, e a palavra Set tem diversos significados diferentes sendo que, nessa situação específica, significa conjunto. Então uma HashSet é um conjunto de elementos organizados por meio de uma função . Ela realiza operações de adição, remoção e busca de forma muito rápida, contudo, não garante uma ordem dos elementos.

- **Características:** 
   - Conjuntos armazenam elementos únicos, eliminando duplicatas automaticamente.
   - Não garantem uma ordem específica dos elementos.
   - São eficientes para verificar se um elemento está presente.
   - HashSet" é uma das classes que implementa essa interface para criar uma coleção de elementos únicos.
   - Existem outras implementações da interface "Set" em Java, como "TreeSet" e "LinkedHashSet", que têm características ligeiramente diferentes em termos de ordenação e desempenho, mas todas compartilham a característica principal de armazenar elementos exclusivos.

- **Quando Usar:** 
   - Use conjuntos quando precisa armazenar elementos únicos e não se importa com a ordem.
   - Úteis para verificar a existência de elementos sem duplicatas.

- **Exemplo:**

```java
import java.util.HashSet;

public class ExemploHashSet {
    public static void main(String[] args) {
        // Criando um HashSet de Strings
        HashSet<String> nomes = new HashSet<>();

        // Adicionando elementos
        nomes.add("Mario");
        nomes.add("Luigi");
        nomes.add("Yoshi");
        nomes.add("Mario"); // Esta duplicata será automaticamente removida
        nomes.add("Peach");

        int total = nomes.size(); // Descobre o total de items

        nomes.remove("Yoshi"); // Remove Yoshi
        System.out.println(nomes); // Imprime todos os nomes

        // Verificando se um elemento está no HashSet
        boolean contemLuigi = nomes.contains("Luigi");
        System.out.println("O conjunto contém Luigi? " + contemLuigi);

        //Outra forma de verificar se existe
       if (nomes.contains("Luigi")) { 
            System.out.println("Ele está presente");
        } else {
            System.out.println("Não está presente");
        }
   
        // Iterando pelos elementos do HashSet
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
```

Aqui criamos um HashSet chamado "nomes" para armazenar nomes de pessoas. Observe como a duplicata "Alice" foi automaticamente removida. O HashSet permite que você verifique a existência de elementos rapidamente usando o método contains e itere facilmente por seus elementos. É uma estrutura de dados eficaz para lidar com conjuntos de dados onde a exclusividade dos elementos é importante.

**Mapas** 🗺️🗺️🗺️

Pense em um dicionário 📚 onde você pode procurar o significado de uma palavra. Mapas em Java são como isso. Você associa algo a outra coisa. Por exemplo, pode associar nomes a idades, de forma que quando você procurar um nome, obtenha a idade correspondente.

- **Características:** 
   - "Map" é uma interface em Java que define um tipo de coleção que armazena pares de chave-valor.
   - Disponíveis por meio do pacote java.util.
   - Mapas associam chaves a valores, permitindo acessar rapidamente valores usando chaves únicas.
   - Não garantem uma ordem específica das entradas.
   - As chaves devem ser únicas, mas os valores podem ser duplicados.
   - Exemplos de implementações de "Map" incluem "HashMap", "TreeMap", "LinkedHashMap" e outros.
   - A interface Map não é um uma das subinterfaces das coleções, como um List ou ArrayList.

- **Quando Usar:** 
   - Use mapas quando precisar associar informações com chaves exclusivas.
   - Úteis para indexação e pesquisa eficiente.

- **Exemplo:**

Como apenas pode haver uma chave específica para cada elemento em um map, é importante obedecermos a essa característica na hora que criarmos uma nova estrutura.

```java
Map<objeto_chave, objeto_valor> nome_do_mapa = new tipo_de_dado();
```

Repare que precisamos declarar o tipo de dado de cada objeto, seja no valor, seja na chave. Pense em uma situação em que temos nomes que precisamos relacionar com alguns números, como em uma agenda. Nesse caso, usamos as chaves para armazenar os nomes, e ela precisa ser única para cada posição.

Como são caracteres, definimos como String. Já no valor, como são números, precisamos declará-los como Inteiros (ou Integer).

```java
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) 
    {
        Map<String, Integer> agenda = new HashMap<String, Integer>();
        agenda.put("Luma", 11222);
        agenda.put("Alex", 22333);
        agenda.put("Andrea", 3344);

        System.out.println(agenda);
    }
}

```

**O que é HashMap()?**
Falando de uma maneira bem resumida, o HashMap é a classe responsável por implementar uma estrutura map para a interface Map, armazenar chaves únicas (hashes) e as atribuir a valores. Embora possa parecer complicada de início, a sintaxe da interface e das classes usadas nos códigos são bem simples.

Para declararmos um novo map, podemos utilizar o HashMap. Para essa implementação, usaremos o “Map” + “nome que queremos para ele” e o igualaremos ao operador “new”, seguido do método HashMap().

- **Características:** 
   - "HashMap" é uma implementação de tabela de hash da interface "Map".
   - É uma estrutura de dados de mapeamento que usa uma tabela hash internamente para armazenar pares chave-valor
   - É eficiente para inserção, recuperação e remoção de elementos, pois oferece acesso rápido aos elementos com base em suas chaves.
   - Não garante uma ordem específica das chaves ou valores.

- **Quando Usar HashMap:** 
   - Use "HashMap" quando precisar de uma estrutura de dados eficiente para mapear chaves exclusivas para valores.
   - É apropriado quando a ordem dos elementos não é importante, mas o acesso rápido aos valores com base nas chaves é necessário.

- **Exemplo:**

```java
import java.util.*;

public class Main {    
    public static void main(String args[]) {        
        Map<String, String> meu_Map = new HashMap<String, String>();

        meu_Map.put("T", new String("melhor"));
        meu_Map.put("r", new String("escola"));
        meu_Map.put("y", new String("de"));
        meu_Map.put("b", new String("programação"));
        meu_Map.put("e", new String("e tecnologia"));

        for (Map.Entry<String, String> be : meu_Map.entrySet()) {
            System.out.print(be.getKey() + ":");
            System.out.println(be.getValue());
        }
    } 
}
Espero que estas adições esclareçam ainda mais as características e os cenários de uso do HashMap em Java.
```

🚨 Portanto:

- "Map" é uma interface que define o conceito geral de mapeamento chave-valor.
- "HashMap" é uma classe concreta que implementa essa interface usando uma tabela hash.
- "TreeMap" semelhante a HashMap, entretanto, também armazena a ordem dos itens, essa ordem pode ser livremente manipulada combinando as características de em um array.
- "LinkedHashMap" é semelhante a HashMap, todavia, internamente também armazena a ordem em que os elementos foram adicionados.



**Stack** 📚🔄
A classe Stack implementada no framework collection e estende o modelo de classe Vector e implementa a estrutura de dados Stack (Pilha é como uma pilha de coisas que você organiza e manipula seguindo a lógica do "last-in-first-out". Doido, né? 😉📚🔄 Imagine que você tem uma pilha de livros 📚, e sempre coloca o livro mais recente no topo. Agora, quando você pega um livro para ler, pega o que está no topo da pilha, certo? É exatamente assim que a classe Stack funciona!


- **Características:** 
   - É como uma pilha de elementos, onde o último elemento que você colocou (empilhou) é o primeiro a ser retirado (desempilhado).
   - Essa classe é parte das coleções em Java e tem algumas ações legais, como empilhar (push) e desempilhar (pop) elementos.
   - Além disso, tem uns truques na manga, como verificar se está vazia (empty), procurar elementos (search) e espiar o que tem no topo (peek).

- **Quando Usar HashMap:** 
   - Use uma Stack sempre que precisar organizar coisas em ordem de chegada, como uma pilha de pratos ou livros.
   - É útil quando a ordem em que você coloca e retira coisas importa.

- **Exemplo:**

```java
import java.io.*;
import java.util.*;

public class ExemploStack  {
    public static void main(String[] args)
    {
        // Tamanho do stack
        int n = 5;

        // Criando uma pilha
        Stack<Integer> pilha = new Stack<Integer>();

        // Adicionando novos elementos ao fim da lista
        for (int i = 1; i <= n; i++)
            pilha.push(i);

        // Imprimindo elementos
        System.out.println("Olha só o que tem na pilha: " + pilha);

        // Removendo elemento do topo da pilha
        int elementoRemovido = pilha.pop(); // Remove o elemento do topo
        System.out.println("Depois de remover o elemento do topo: " + pilha);
        System.out.println("Elemento removido: " + elementoRemovido);

        // Verificando se a pilha está vazia
        boolean vazia = pilha.empty();
        System.out.println("A pilha está vazia? " + vazia);

        // Procurando um elemento na pilha
        int posicao = pilha.search(4); // Procurando o número 4 na pilha
        System.out.println("Posição do elemento 4 na pilha: " + posicao);

        // Dá pra ver o que tem no topo sem tirar
        int elementoNoTopo = pilha.peek();
        System.out.println("Elemento no topo da pilha: " + elementoNoTopo);
    }
}

```

## HashMap vs. TreeMap**

Falando na "nossa língua", temos o HashMap e o TreeMap, e os dois são como baús para guardar as nossas coisas em Java.

**HashMap**: Imagine um baú mágico (bem a vibe baú do ender do Minecraft) que guarda suas coisas e você pode pegar suas coisas rapidinho, mas o baú não liga para a ordem que você as colocou.

<img width="140" src="https://static.wikia.nocookie.net/minecraft_gamepedia/images/d/db/Ender_Chest_JE2_BE2.gif/revision/latest?cb=20230305011915" alt="Baú Ender">

**TreeMap**: Agora, pense em um baú de duendes que guardam e organizam suas coisas. Eles mantém tudo organizado e em ordem, como se fosse uma lista de tarefas, mas leva um pouco mais de tempo para encontrar o que você precisa. (será que é porque os duendes gostam de pregar peças? kkkkk)

Resumindo, é indicado usar o HashMap quando quiser encontrar suas coisas rapidinho, e o TreeMap quando quiser que suas coisas estejam sempre em ordem e organizadinhas.


<img width="140" src="https://www.picgifs.com/graphics/g/gnomes/graphics-gnomes-621239.gif" alt="Duende">

