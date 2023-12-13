# Conceitos Básicos de programação em Java ☕

## Partes de um Programa Java 🖥️

### Pacote (Package) 📦
Um pacote é como uma pasta onde você organiza seus arquivos Java. É como separar suas ferramentas por categoria em diferentes caixas.

```java
  package meupacote;
```

### Importações (Imports) 📚
As importações permitem que você use coisas de outros pacotes. É como trazer ferramentas especiais de outras caixas para usar.

```java
  import java.util.Scanner;
```

### Classe Principal (Main Class) 🏁
A classe principal é onde o programa começa a ser executado. Tudo que eta dentro das chaves é um bloco, logo uma classe em java é um bloco. Dentro dela temos o método principal (main), ele é o método que será chamado quando você inicia a execução de um programa Java.

```java
  public class MinhaClassePrincipal {
      public static void main(String[] args) {
          System.out.print("Olá, mundo");
      }
  }
```

- Nomenclatura
  - MinhaClasse: NomeDaClasse
  - MinhaInterface: nomeDaInterface
  - meuAtributo: nomeAtributo
  - minhaVariavel: mediaPrimeiroBimestre
  - meuMétodo: lancarNotaAluno
  - meu_pacote: javacaldeira
  - MINHA_CONSTANTE: VALOR_DE_PI
 
Java compativel com varios sistemas, por isso temos a classe System, porque não precisa ser uma tela de computador mas quaqluer um. (computador, celular, relogio, etc...)

### Variáveis e Tipos de Dados 📊

Em Java, as variáveis são como caixas onde você pode guardar coisas. Existem diferentes tipos de caixas, cada uma para um tipo diferente de coisa:

- `int`: é para números inteiros, como quantos doces você tem 🍬.
- `double`:  é para números com casas decimais, como a altura de alguém 📏.
- `String`: é para palavras ou frases, como o nome dos seus amigos 🧑.
- `boolean`: é para coisas que podem ser verdadeiras ou falsas, como se você está com fome ou não 🍔.

```java
  int idade = 25;
  double altura = 1.75;
  String nome = "João";
  boolean comFome = true;
```

## Operadores Lógicos e Relacionais 🔗

Os operadores relacionais são usados para comparar valores e expressões. Eles retornam um valor booleano que indica se a relação entre os valores é verdadeira ou falsa.

- `==`: Igual a (verifica se dois valores são iguais). 
- `!=`: Diferente de (verifica se dois valores são diferentes). 
- `>`: Maior que (verifica se o valor à esquerda é maior que o valor à direita). 
- `<`: Menor que (verifica se o valor à esquerda é menor que o valor à direita). 
- `>=`: Maior ou igual a (verifica se o valor à esquerda é maior ou igual ao valor à direita). 
- `<=`: Menor ou igual a (verifica se o valor à esquerda é menor ou igual ao valor à direita). 

```java
  int x = 5;
  int y = 10;
  
  boolean igual = (x == y); // false
  boolean diferente = (x != y); // true
  boolean maior = (x > y); // false
  boolean menor = (x < y); // true
  boolean maiorOuIgual = (x >= y); // false
  boolean menorOuIgual = (x <= y); // true
```

## Operadores Lógicos

Os operadores lógicos são usados para combinar expressões booleanas e tomar decisões com base nessas combinações. Os operadores lógicos mais comuns são:

- `&&`:  (E lógico): Retorna verdadeiro se ambas as expressões forem verdadeiras.
- `||`: (OU lógico): Retorna verdadeiro se pelo menos uma das expressões for verdadeira.
- `!`: (NÃO lógico): Inverte o valor de uma expressão booleana, ou seja, se a expressão for verdadeira, se torna falsa, e vice-versa.

```java
  boolean a = true;
  boolean b = false;
  
  boolean resultadoE = (a && b); // false
  boolean resultadoOU = (a || b); // true
  boolean resultadoNaoA = !a; // false
  boolean resultadoNaoB = !b; // true
```

## Estruturas Condicionais 🚦

As estruturas condicionais são usadas para tomar decisões em um programa com base em condições lógicas.
- `if`- `else`
  ```java
    int idade = 20;
    
    if (idade >= 18) {
      System.out.println("É maior de idade.");
    } else {
      System.out.println("É menor de idade.");
    }
  ```
  
- `if` - `else if` - `else`
  ```java
    int nota = 75;
    
    if (nota >= 90) {
        System.out.println("Aprovado com distinção.");
    } else if (nota >= 60) {
        System.out.println("Aprovado.");
    } else {
        System.out.println("Reprovado.");
    }
  ```

## Controle de Fluxo Condicional com switch-case 🧩
A estrutura switch-case é usada quando você deseja tomar decisões com base em um valor específico de uma variável. Ela permite que você compare um valor com vários casos e execute o bloco de código correspondente ao caso que corresponde ao valor.

  ```java
    int opcao = 2;
    
    switch (opcao) {
        case 1:
            System.out.println("Opção 1 selecionada.");
            break;
        case 2:
            System.out.println("Opção 2 selecionada.");
            break;
        case 3:
            System.out.println("Opção 3 selecionada.");
            break;
        default:
            System.out.println("Opção inválida.");
    }
  ```

## Estruturas de Repetição 🔄

As estruturas de repetição permitem que você execute um bloco de código várias vezes com base em uma condição. As estruturas de repetição mais comuns em Java são `for` e `while`.
- `for`:  é usado quando você sabe exatamente quantas vezes deseja repetir uma ação.
```java
  for (int i = 0; i < 5; i++) {
    System.out.println("Iteração #" + i);
  }
```

- `while`: é usado quando você deseja repetir uma ação enquanto uma condição for verdadeira.
```java
  int contador = 0;
  
  while (contador < 5) {
      System.out.println("Iteração #" + contador);
      contador++;
  }
```

- `do-while`: é semelhante ao while, mas a condição é verificada após a execução do bloco de código, garantindo que o bloco seja executado pelo menos uma vez.
```java
  int contador = 0;
  
  do {
      System.out.println("Iteração #" + contador);
      contador++;
  } while (contador < 5);
```

🚨IMPORTANTE: Embora o uso de break seja válido em algumas situações, como dentro de um switch-case, geralmente não é aconselhado usá-lo em estruturas de repetição while. A razão é que o break interrompe abruptamente a execução do loop, tornando o código menos legível e mais propenso a erros.🚫

- Recomendado: Exemplo de uso da condição de parada no cabeçalho do while 
```java
  int contador = 0;
  
  while (contador < 5) {
      System.out.println("Iteração #" + contador);
      contador++;
  }
```

### Funções e Métodos 🧩

Funções ou métodos são como receitas em um livro de culinária. Eles são blocos de código que fazem algo específico.

- `if-else`: é como escolher um caminho em uma bifurcação.
- `for` e `while`:  São como repetir uma ação várias vezes, como contar até 10 🕒.

```java
  // Definindo uma receita (função)
  public static int somar(int a, int b) {
      return a + b;
  }
  
  // Usando a receita
  int resultado = somar(3, 5); // Resultado será 8
```

### Entrada e Saída 📝

Para falar com o programa (entrada) e obter respostas dele (saída), usamos Scanner e System.out.println.

```java
  import java.util.Scanner;
  
  Scanner scanner = new Scanner(System.in);
  System.out.print("Digite seu nome: ");
  String nome = scanner.nextLine();
  System.out.println("Olá, " + nome + "!");

```
