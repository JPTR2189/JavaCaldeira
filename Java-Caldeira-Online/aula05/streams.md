**Stream API** 

Java Stream é uma API introduzida no Java 8 que fornece uma maneira mais "funcional" e "expressiva" de lidar com coleções de objetos em Java. O Java Stream fornece uma maneira mais moderna, elegante e concisa de lidar com operações em coleções de objetos em Java.
Em resumo, a utilização das Java Streams fornece uma maneira mais moderna, concisa, expressiva e funcional de lidar com coleções de objetos em Java.

**Caracteristicas**:

  - Operar coleções de objetos em uma única linha de código;
  - Maior eficiência e escalabilidade de código;
  - Segue o paradigma de programação funcional;
  

**Quando usar:**

  - Java Stream é muito útil quando precisamos manipular dados que estão sendo gerados ou consumidos em tempo real


**Exemplos:**

**Filtrar** elementos de uma coleção com base em determinados critérios usando o método **filter()**.  
  
O exemplo a seguir filtra a lista de nomes para incluir apenas os nomes que começam com a letra "R".

```java
Exemplo 01 - Usando filter()

List<String> nomes = Arrays.asList("Joao", "Paulo", "Rafaela", "Renato")
List<String> filteredNomes = nomes.stream()
                                    .filter(nome -> nome.startsWith("R"))
                                    .collect(Collectors.toList());
```

  
**Mapear** elementos de uma coleção para um novo conjunto de valores usando o método **map()**.

Este exemplo mapeia a lista de números para uma nova lista contendo cada número multiplicado por 2.

```java
Exemplo 02 - Usando map()

List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5)
List<Integer> numerosMap = numbers.stream()
                                        .map(numero -> numero * 2)
                                        .collect(Collectors.toList());

```


Classificar os elementos de uma coleção com base em uma determinada ordem usando o método **sorted()**.

Este exemplo classifica a lista de números em ordem crescente.

```java
Exemplo 03 - usando sorted()

List<Integer> numeros = Arrays.asList(5, 3, 1, 4, 2)
List<Integer> numerosSorted = numeros.stream()
                                        .sorted()
                                        .collect(Collectors.toList());



```

Agrupar elementos de uma coleção com base em uma propriedade comum usando o método **groupingBy()**.

Este exemplo agrupa a lista de pessoas por idade, criando um mapa em que cada chave é uma idade e cada valor é uma lista de pessoas com essa idade.

```java
Exemplo 04 - Usando groupingBy()

List<Pessoas> pessoa = Arrays.asList
    new Pessoas("Joao", 27),
    new Pessoas("Paulo", 27),
    new Pessoas("Renato", 22),
    new Pessoas("Rafaela", 26)
);
Map<Integer, List<Pessoas>> pessoasByIdade= people.stream()
                                                .collect(Collectors.groupingBy(Pessoa::getIdade));

```

Reduzir uma coleção de elementos a um único valor usando o método **reduce()**.

Este exemplo reduz a lista de números a um único valor, que é a soma de todos os números.

```java
Exemplo 05 - Usando reduce()

List<Integer> numeros= Arrays.asList(1, 2, 3, 4, 5)
int sum = numeros.stream()
                    .reduce(0, (a, b) -> a + b);

```

Realizar operações em paralelo em uma coleção de elementos usando os métodos **parallelStream()** e **forEach()**.

Este exemplo executa a operação "Olá, nome!" em paralelo para cada elemento da lista de nomes, usando o método **forEach()**.

```java
Exemplo 06 - Usando parallelStream() e forEach()

List<String> nomes = Arrays.asList("Joao", "Paulo", "Rafaela", "Renato")
names.parallelStream()
        .forEach(nome -> System.out.println("Ola, " + nome + "!"));
```

**Conclusões**

Em geral, a API de streams pode ser usada para manipular coleções de objetos de uma maneira mais eficiente e expressiva, o que pode levar a um código mais limpo e fácil de entender.

É importante lembrar que, embora a API de streams possa ser usada em muitos casos, nem sempre é a solução mais eficiente para todas as situações, então é importante avaliar cuidadosamente as necessidades do seu código antes de decidir usar streams.
