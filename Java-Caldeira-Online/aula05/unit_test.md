# Testes Unitários em Java 🧪

Os testes unitários são uma parte fundamental do desenvolvimento de software em Java, são como "check-ups" para o código. 
Eles permitem que você verifique se as unidades individuais do seu código (como métodos ou classes) funcionam corretamente. 
Neste guia, vamos mostrar como escrever testes unitários em Java usando o framework de teste _`#JUnit`_ .

## Configuração do Ambiente 🛠️

Antes de começar a escrever testes unitários, você precisará configurar o ambiente de desenvolvimento Java e adicionar a biblioteca JUnit ao seu projeto. Aqui estão os passos básicos:

1. Certifique-se de ter o JDK (Java Development Kit) instalado no seu sistema.

2. Crie um projeto Java no seu ambiente de desenvolvimento preferido (IDE).

3. Coloque a biblioteca JUnit no seu projeto. Isso pode ser feito manualmente, baixando o arquivo JAR diretamente do site oficial do JUnit (https://junit.org/junit5/), ou de forma mais inteligente com o auxílio de ferramentas de gerenciamento de dependências como Maven ou Gradle.

## **Usando o Maven** 
  - Abra o arquivo `pom.xml` do seu projeto Maven.
  - Dentro da seção `<dependencies>`, adicione a seguinte dependência para o JUnit 5, que pode ser vista no [site do Maven](https://maven.apache.org/surefire/maven-surefire-plugin/examples/junit-platform.html):
   
    ```java
      <project ...>
        ...
          <dependencies>
              [...]
              <dependency>
                  <groupId>org.junit.jupiter</groupId>
                  <artifactId>junit-jupiter-engine</artifactId>
                  <version>5.9.1</version>
                  <scope>test</scope>
              </dependency>
              [...]
          </dependencies>
        ...
      </project>
    ```
     
  - Salve o arquivo  `pom.xml`.
  - O Maven irá baixar automaticamente a biblioteca JUnit e suas dependências quando você construir o projeto.

## **Usando o Gradle**
  - Abra o arquivo `build.gradle` do seu projeto Gradle.
  - Dentro da seção `<dependencies>`, adicione a seguinte dependência para o JUnit 5:
    
    ```java
      testImplementation("org.junit.jupiter:junit-jupiter:5.8.0")
    ```
  
  - Salve o arquivo  `build.gradle`.
  - O Gradle irá baixar automaticamente a biblioteca JUnit e suas dependências quando você construir o projeto.
   


# **Escrevendo Nosso Primeiro Teste**

Primeiro, vamos entender que quando estamos testando algum pedaço de software, queremos ter certeza de que ele está fazendo o que deveria fazer. Então, quando escrevemos testes automatizados, seguimos um padrão simples:

- **Preparação (Arrange)**: Configuramos o cenário para o código que queremos testar.

- **Ação (Act):** Interagimos com o código para testá-lo.

- **Verificação (Assert):** Verificamos se os resultados são o que esperávamos.

Esse padrão é chamado de "Arrange, Act, Assert".

Vamos dar uma olhada em um pedaço de software que gostaríamos de testar:

```java
  public class Calculadora {
      public int somar(int primeiro, int segundo) {
          return primeiro + segundo;
      }
  }
```

Neste exemplo temos uma classe de calculadora muito simples. Tudo o que ela faz é somar dois números. Ao testar esse código, gostaríamos de garantir que o cálculo esteja correto.

Aqui está como aplicamos o padrão "Arrange, Act, Assert" ao testar essa calculadora:

- **Preparação (Arrange)🛠️:** Começamos criando uma calculadora, que é uma instância da classe Calculadora.

- **Ação (Act)🚴‍♂️:** Em seguida, chamamos o método somar() com alguns números, digamos 1 e 2, e armazenamos o resultado.

- **Verificação (Assert)✅:** Por fim, verificamos se o resultado da soma é igual a 3, usando o método assertEquals().

Aqui está o código de teste:

```java
  import org.junit.jupiter.api.Assertions;
  import org.junit.jupiter.api.Test;
  
  class CalculadoraTeste {
      @Test
      void somarNumeros() {
          // Preparação
          Calculadora calculadora = new Calculadora();
          
          // Ação
          int soma = calculadora.somar(1, 2);
          
          // Verificação
          Assertions.assertEquals(3, soma);
      }
  }
```

A classe de teste pode ter qualquer nome, mas aqui chamamos de **CalculadoraTeste**. O método de teste é chamado `somarNumeros()`, para que saibamos o que estamos testando.

Para rodar o teste, precisamos usar a anotação `@Test`. Isso diz ao executor de teste que este é um método de teste.

## Executando Testes Unitários ▶️

Depois de escrever seus testes unitários, você pode executá-los usando sua IDE ou ferramenta de construção. Certifique-se de que sua classe de teste tenha um nome que termine com "Test" para que o JUnit a reconheça automaticamente como uma classe de teste. Também podemos executar o teste a partir da linha de comando usando uma ferramenta de construção como Maven ou Gradle.🖥️

Quando o software se comporta conforme o esperado, o teste é aprovado. Quando faz algo inesperado, o teste falha. 🎯👍

## Executando a partir do IntelliJ IDEA

Ao usar uma IDE como o IntelliJ IDEA, podemos clicar com o botão direito na classe de teste e selecionar "Executar CalculadoraTeste". Alternativamente, podemos usar o atalho Ctrl+Shift+F10 (Windows) ou Ctrl+Shift+R (Mac) para executar os testes.

## Executando com o Maven

Para executar os testes a partir da linha de comando usando o Maven:

```java
  $ mvn test
```

Devemos ver uma saída semelhante a esta:

```java
  [INFO] -------------------------------------------------------
  [INFO]  T E S T S
  [INFO] -------------------------------------------------------
  [INFO] Running com.arhohuttunen.CalculadoraTeste
  [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.021 s - in com.arhohuttunen.CalculadoraTeste
  [INFO] 
  [INFO] Results:
  [INFO] 
  [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
  [INFO] 
  [INFO] ------------------------------------------------------------------------
  [INFO] BUILD SUCCESS
  [INFO] ------------------------------------------------------------------------
```

## Executando com o Gradle

Para executar os testes a partir da linha de comando usando o Gradle:

```java
  $ gradle test
```

Devemos ver uma saída semelhante a esta:

```java
  > Task :test
  com.arhohuttunen.CalculadoraTeste > somarNumeros() PASSOU
  BUILD SUCCESSFUL in 0s
```

Com isso, aprendemos como escrever e executar um simples teste JUnit 5 para garantir que nosso código se comporte conforme o esperado. Isso é fundamental para o desenvolvimento de software de qualidade.
