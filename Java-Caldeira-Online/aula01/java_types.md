# Java e seus tipos ☕

Como vocês já sofreram nos exercícios anteriores, Java é uma linguagem FORTEMENTE tipada, logo tudo precisa de um tipo definido... "Mas professor, eu vi que tem isso":

```java
    var nome = " Miles Morales ";
```

Calma, isso é inferência, mais para frente do curso, vamos abordar isso. Por agora vamos focar nos tipos mais básicos.

# Tipos Primitivos

No Java, assim como várias outras linguagens, possui algumas palavras reservadas e parte delas são os tipos primitivos:

- int, byte, short, long, float, double, boolean e char.

As diferenças entre ambos é memória que eles ocupam no programa e quais os valores possíves para cada um. Por exemplo, o 'int' pesa 4 bytes, pode receber números no intervalo de -2.147.483.648 à 2.147.483.647.

:point_right::[] É bem provavel que vocês utilizem mais o int, double, long e boolean ao longo da carreira e com os exercícios, você vão reparar mais nisso ;)

## Constantes no Java?

Claro, também existe isso aqui, mas qual seria a diferença dela para uma variável em si? Podemos ter constantes de tipos primitivos?

Para a primeira pergunta, a diferençca está na funcionalidade e numa convenção. Se é constante que você quer, então o valor não pode mudar, logo, obvio, GG easy, enquanto a convenção, precisamos declar como utilizando a palavra reservada 'final' junto e geralmente são escritas com todas as letras maiúsculas.

# Tipos de Referência e Tipos de Valor 💼🗺️

Agora, vamos falar sobre uma distinção importante em Java: tipos de referência e tipos de valor.

## Tipos "por valor" (Value Types) 💎

Imagine que você tem uma caixa 📦 e quer colocar um número dentro dela, como o número "10". Em Java, isso é como usar um tipo primitivo. Quando você coloca o "10" na caixa (variável), você está colocando o próprio número dentro dela. Se você pegar outra caixa (outra variável) e colocar o número da primeira caixa dentro dela, você está fazendo uma cópia direta desse número. Agora, se você mudar o número em uma caixa, não afetará o número na outra caixa. Cada caixa tem seu próprio número.

Exemplo em Java:

```java
int numero1 = 10;
int numero2 = numero1; // Copia o valor de numero1 para numero2
numero1 = 20; // Mudando numero1, não afeta numero2
System.out.println(numero2); // Isso imprimirá 10
```
## Tipos de Referência (Reference Types) 🗝️

Agora, pense em uma situação em que você tem uma caixa 📦 que contém uma instrução sobre onde encontrar algo, como um mapa 🗺️ para um tesouro. Em Java, isso é como usar tipos de referência. Quando você coloca o mapa (objeto) em uma caixa (variável), você não está colocando o tesouro em si na caixa, mas sim uma maneira de encontrar o tesouro. Se você pegar outra caixa e colocar a mesma instrução de onde encontrar o tesouro dentro dela, ambas as caixas apontam para o mesmo tesouro. Isso significa que, se você encontrar o tesouro em uma caixa e fazer alguma mudança, a outra caixa também verá essa mudança, porque elas estão se referindo ao mesmo tesouro.

Exemplo em Java:

```java
List<String> lista1 = new ArrayList<>();
List<String> lista2 = lista1; // Ambas as variáveis se referem à mesma lista
lista1.add("Item 1");
System.out.println(lista2.get(0)); // Isso imprimirá "Item 1"
```
Portanto, em resumo, tipos primitivos são como colocar o valor diretamente em uma caixa, e tipos de referência são como colocar um mapa 🗺️ para onde encontrar algo em uma caixa. Mudanças em tipos primitivos não afetam outros, mas em tipos de referência, mudanças podem afetar todos que estão se referindo ao mesmo "tesouro". 💎🗝️

## Checkpoint do conteúdo

```java
    public class TiposPrimitivos {
        public static void main(String[] args) {
            char letra = "a";
            byte idade = 45;
            short ano = 2023;
            int cep = 21070333; 
            long id = 68903L; 
            float pi = 3.14F;
            double salario = 1275.33;
        }
}
```

Lembre-se: Ao longo do desenvolvimento de aplicações maiores, os tipos no exemplo acima, cada software que vocês atuarem terá responsabilidades diferentes e a utilização dos tipos primitivos pode/vai mudar. O que quer dizer isso? Que em algum programa, pode ser que precise usar um int para a idade, fique ligado com o seu escopo.

## Tem só exemplo de número aqui, cadê o texto?

Então meus consagrados...
Não existe tipo primitivo para texto, quando vamos usar texto no Java, precisamos de:

```java
    public class PrimeiraClasse {
        public static void main(String[] args) {
            String frase = "Caiu no bait, vai para o proximo arquivo!"
        }
}
```
O tipo String, atenção na primeira letra, em maiscúlo!! Acessem o próximo arquivo!
