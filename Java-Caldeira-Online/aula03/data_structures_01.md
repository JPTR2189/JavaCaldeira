## Estruturas de Dados em Java Parte 1 📦📋📚🗺️

As estruturas de dados são usadas para armazenar, organizar e manipular dados em programas Java. Cada estrutura de dados tem suas características e vantagens específicas:

- **Eficiência:** A escolha da estrutura de dados correta pode impactar significativamente o desempenho do seu programa. Por exemplo, usar uma lista vinculada para inserções frequentes é mais eficiente do que usar um array em certos cenários.

- **Organização:** Estruturas de dados apropriadas ajudam a organizar e gerenciar dados de maneira lógica e coerente. Por exemplo, uma árvore binária pode ser usada para armazenar dados de forma hierárquica.

- **Facilidade de Acesso:** Estruturas de dados fornecem maneiras diferentes de acessar e manipular dados. Listas são ideais para acesso sequencial, enquanto mapas são excelentes para acessar dados por chave.

- **Flexibilidade:** A escolha das estruturas de dados certas permite que você modele problemas de maneira eficaz. Isso facilita a implementação de algoritmos e funcionalidades específicas para a aplicação.


Em Java, você tem acesso a várias estruturas de dados que podem ser usadas para atender às necessidades específicas do seu programa. Imagine que você está organizando suas coisas em caixas 📦. Em Java, você tem diferentes tipos de "caixas" para armazenar e organizar informações. Vou te mostrar algumas delas:

**1. Arrays (matrizes)** 🧩🧩🧩

Pense em um arranjo como uma fileira de gavetas. Cada gaveta pode conter um item, e você acessa esses itens usando números, como o primeiro, o segundo, o terceiro, etc. Mas aqui está o truque: você precisa saber quantas gavetas deseja antes de começar a usá-las, e não pode mudar esse número depois.

- **Características:** 
   - Fazem parte do pacote java.util na coleção da API do Java
   - É uma estrutura de tamanho fixo, o que significa que você precisa especificar o tamanho do array quando o cria e não pode alterá-lo posteriormente.
   - Cada item em um array é chamado de elemento, e cada elemento é acessado por um índice inteiro.
   - São eficientes para acesso direto aos elementos, mas seu tamanho não pode ser alterado dinamicamente.

<img width="587" alt="arrayfig1" src="https://github.com/SkiereszDiego/Java-Caldeira-Privado/assets/46655332/9476ab5e-881f-408f-9bf7-cebd52531143">

- **Quando Usar:** 
   - Use arrays quando souber o tamanho exato da coleção antecipadamente.
   - São úteis para armazenar elementos do mesmo tipo, como números inteiros, caracteres ou objetos personalizados.

- **Exemplos de Declaração de Arrays:**

Quando você cria um grupo de números em Java, é como fazer uma lista com caixas. Por exemplo:

```java
int[] numeros = new int[5]; // Criei uma lista de números com espaço para 5 caixas
numeros[0] = 10; // Coloquei o número 10 na primeira caixa
numeros[1] = 20; // Coloquei o número 20 na segunda caixa
// ...
```
Você também pode criar a lista e as caixas separadamente, assim:
```java
int[] a = new int[4]; // Criei a lista com 4 caixas
int[] b; // Declarei outra lista
b = new int[10]; // Criei a lista "b" com 10 caixas
```
E até dá para fazer várias listas de uma vez, como se fossem caixas diferentes:
```java
int[] r = new int[44], k = new int[23]; // Criei duas listas, uma com 44 caixas e outra com 23
```
Quando você cria uma lista e já coloca os números nela, é como fazer uma lista de compras:
```java
int[] iniciaValores = {12, 32, 54, 6, 8, 89, 64, 64, 6}; // Fiz uma lista com esses números
```
- **Descobrindo o Tamanho de um Array**
  
Para saber quantas caixas tem em uma lista, é só usar .length. Por exemplo:
```java
int[] arrayUm = {12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321};
int[] arrayDois = {43, 42, 4, 8, 55, 21, 2, 45};

if (arrayDois.length > 8) {
    // Se o "arrayDois" tiver mais de 8 caixas, você diz isso
    System.out.println("O arrayDois tem mais de 8 caixas!");
} else {
    // Se não, você diz isso
    System.out.println("O arrayDois tem menos de 8 caixas!");
}

System.out.println("O arrayUm tem " + arrayUm.length + " caixas.");
```

- **Inicializando um Array**
  
Quando você cria uma lista, pode deixá-la vazia ou colocar números nela desde o começo:
```java
int[] arrayBase;
arrayBase = new int[20]; // Criei uma lista vazia com 20 caixas

int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
// Fiz uma lista com esses números desde o começo
```

- **Percorrendo Arrays com o "for" Aprimorado**
  
Às vezes, você quer olhar cada número em uma lista. O for aprimorado é como pegar cada número da lista e ver o que tem nele:
```java
int[] arrayNum = {87, 68, 52, 5, 49, 83, 45, 12, 64};
int total = 0; // Comecei com um número zero

// Agora, vou pegar cada número da lista "arrayNum"
for (int numero : arrayNum) {
    total += numero; // Adicionei cada número ao total
}

System.out.println("A soma de todos os números é: " + total);
```

**2. Arraylist** 📜📜📜

Agora, imagine uma lista de compras 🛒. Você pode adicionar ou remover itens a qualquer momento e não precisa saber o tamanho da lista com antecedência. Arraylist são como isso em Java, uma maneira flexível de armazenar coisas, e você pode até misturar tipos de itens, como colocar nomes e números na mesma lista.

- **Características:** 
   - ArrayList é uma implementação da interface *List* em Java
   - Faz parte do pacote **java.util** (é como uma caixa cheia de ferramentas úteis para o desenvolvimento de aplicativos Java, incluindo coleções, gerenciamento de data e hora, suporte para idiomas diferentes e muitos outros recursos)
   - Listas são coleções **dinâmicas** que podem crescer ou diminuir em tamanho.
   - Permitem armazenar elementos de diferentes tipos.
   - ArrayList é um agrupamento dinâmico de objetos, oferecendo assim métodos convenientes para adicionar, remover e acessar elementos.
   - Permite acesso direto aos elementos, semelhante a um array.

- **Quando Usar:** 
   - Use listas quando precisa de uma coleção flexível com tamanho variável;
   - Implementacões de filas;
   - Trabalhar com banco de dados;
   - Manter um histórico de ações que os usuários podem reverter ou avançar.
 
- **Quais as diferenças entre array e arraylist em java?** 
   Um "array" tem um tamanho fixo e não pode ser alterado, enquanto um "ArrayList" é flexível e pode crescer ou encolher conforme necessário. No entanto, o ArrayList também consome um pouco mais de memória devido à sua capacidade de redimensionamento dinâmico. Portanto, a escolha entre um array e um ArrayList depende das necessidades específicas de um programa.
  
- **Exemplo:**

```java
import java.util.ArrayList;

List<String> herois = new ArrayList<String>();
nomes.add("Ahsoka");
nomes.add("Luffy");
// ...
```
- **Sintaxe**
   - ArrayList -> Classe  
   - String -> Datatype(Wrapper da Classe - Não Primitivo)
   - List -> Variavel referencia
   - new -> Cria um novo objeto
   - ArrayList<String>() -> Construtor do ArrayList sem tamanho inicial

- **Alguns métodos**
   - add()             -> Adiciona um novo elemento para o ArrayList  
   - set(index, value) -> Atualiza um valor existente em um indice especifico.
   - get(index)        -> Pegar um valor existente em um indice especifico.

- **Hierarquia da classe ArrayList 👑**

Por serem membros de uma mesma classe, a java.util, as interfaces nas estruturas das coleções Java obedecem a uma hierarquia 🏰. Entre essas estruturas presentes nesses pacotes, algumas aparecem como as principais para o conhecimento das pessoas iniciantes nessa linguagem 🚀.

Uma coleção pode agregar vários tipos de interface 🗂️. Podemos destacar conjuntos, listas (list), filas (queue) e mapas (maps) 📊. Cada uma delas pode fazer parte de uma mesma coleção, independentemente da estrutura utilizada 🤝.

A hierarquia serve para representar que cada uma dessas estruturas são de um tipo único 🧩. Explicando de outra maneira: não é possível termos uma lista e, ao mesmo tempo, termos um conjunto na mesma coleção 🧐. Por exemplo, para declararmos uma coleção, usamos a seguinte sintaxe: 💻

```java
List<String> coleção = new ArrayList();
```

Agora, para adicionar valores a essa coleção, é só seguir esse esquema:

```java
import java.util.Collection;
import java.util.ArrayList;

public class MetodoAdd {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList();
        nomes.add("Mario");
        nomes.add("Luigi");
        nomes.add("Peach");
        nomes.add("Bowser");
        nomes.add("Toad");

        System.out.println("Lista de nomes: " + nomes);
    }
}

```

**3. O que é o Java list**

Em termos simples, um Java List é uma coleção organizada de elementos. Esses elementos podem ser de diferentes tipos, como números inteiros, caracteres, booleanos ou decimais. O List age como uma interface que ajuda a gerenciar elementos e suas posições em uma coleção.

A parte legal é que cada elemento nessa lista tem um número de identificação, chamado de índice. Isso permite acessar e mexer nesses elementos de maneira bem direta no Java List. 😉

**Java List e o Java Collections Framework** 

O Java List 📃 faz parte de algo maior chamado Java Collections Framework 📚. Não pense nele como uma estrutura de dados, mas sim como uma biblioteca cheia de ferramentas úteis 🧰. Essa "biblioteca" oferece um monte de interfaces e classes para lidar com coleções de dados 🗄️. Desde a versão 8 do Java, a interface List ganhou novos truques ✨, como spliterator(), replaceall(), sort(), e muito mais 🚀.

**Entendendo os Índices** 

Lembre-se de que, em Java, a contagem começa do zero. Olha só, se você tiver uma lista com esses elementos:

```java
A
B
C
D
E
F

```
O elemento "A" está na posição 0 da lista, e o "F" está na posição 5. Simples, né?

**Lidando com Tipos de Dados** 
Uma coisa importante a saber é que o Java Collections Framework suporta algo chamado "generics." Isso foi introduzido na versão 5 do Java e ajuda a especificar o tipo dos objetos que você guarda na sua lista. Isso evita erros chatos, como uma "ClassCastException," que acontece quando o tipo de dado não combina com o que você esperava.

**4. Entendendo o LinkedList em Java 🔗**

Vamos dar uma olhada no LinkedList, que é uma estrutura de dados interessante em Java. 🤓

**O que é o LinkedList?**

O LinkedList é uma implementação da interface List em Java. Assim como o ArrayList, ele é usado para armazenar uma coleção de elementos. No entanto, o LinkedList tem algumas características distintas.

**Diferenças do ArrayList:**

- **Estrutura:** Enquanto o ArrayList usa um array dinâmico para armazenar os elementos, o LinkedList é uma sequência de nós, onde cada nó contém um valor e uma referência ao próximo nó.

- **Inserção/Remoção:** O LinkedList é excelente para inserções e remoções de elementos, pois não exige realocação de elementos, como acontece no ArrayList.

**Como criar um LinkedList em Java?**

Para criar um LinkedList em Java, você pode usar o seguinte código:

```java
import java.util.LinkedList;

public class ExemploLinkedList {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
         // Também pode ser instanciado dessa maneira:
         // List<String> lista = new LinkedList<>();
        
        lista.add("Maçã");
        lista.add("Banana");
        lista.add("Laranja");
        
        System.out.println("Lista de frutas: " + lista);
    }
}
```

**Principais métodos:**

add(element): Adiciona um elemento ao final da lista.
addFirst(element): Adiciona um elemento no início da lista.
addLast(element): Adiciona um elemento ao final da lista (equivalente ao add()).
remove(element): Remove o primeiro elemento igual ao especificado.
removeFirst(): Remove o primeiro elemento da lista.
removeLast(): Remove o último elemento da lista.
get(index): Obtém o elemento na posição especificada.
size(): Retorna o tamanho da lista.

- **Vantagens do LinkedList:** 

- Ótimo desempenho para inserções e remoções frequentes.
- Consumo de memória mais eficiente para coleções grandes que sofrem muitas alterações.

- **Desvantagens do LinkedList:** 

- Acesso mais lento aos elementos, pois requer navegação sequencial.
- O ArrayList pode ser mais eficiente para acessos frequentes a elementos específicos.
-😄🔗

- **Exemplo:**
 No exemplo abaixo, criamos uma lista de strings 🍏🍌🍊, adicionamos algumas frutas, realizamos operações de adição no início e no final 🏁, remoção do primeiro e do último elemento, acessamos uma fruta pelo índice e verificamos o tamanho da lista. 

```java
import java.util.LinkedList;

public class ExemploLinkedListSimples {
    public static void main(String[] args) {
        // Passo 1: Criando uma lista vazia
        LinkedList<String> listaDeFrutas = new LinkedList<>();

        // Passo 2: Adicionando frutas à lista
        listaDeFrutas.add("Maçã");
        listaDeFrutas.add("Banana");
        listaDeFrutas.add("Laranja");

        // Passo 3: Exibindo a lista original
        System.out.println("Lista original de frutas: ");
        for (String fruta : listaDeFrutas){
            System.out.println(fruta);
        }       

        // Passo 4: Adicionando uma fruta no início
        listaDeFrutas.addFirst("Uva");

        // Passo 5: Adicionando uma fruta no final
        listaDeFrutas.addLast("Pera");

        // Passo 6: Removendo a primeira fruta
        listaDeFrutas.removeFirst();

        // Passo 7: Removendo a última fruta
        listaDeFrutas.removeLast();

        // Passo 8: Acessando uma fruta pelo índice (segunda fruta na lista)
        String segundaFruta = listaDeFrutas.get(1);
        System.out.println("A segunda fruta na lista é: " + segundaFruta);

        // Passo 9: Verificando o tamanho da lista
        int tamanhoDaLista = listaDeFrutas.size();
        System.out.println("O tamanho da lista é: " + tamanhoDaLista);
    }
}

```
## Revisãozinha

<img src="https://github.com/SkiereszDiego/Java-Caldeira-Online/blob/main/aula03/demo.gif" alt="image" width="300" height="400">
