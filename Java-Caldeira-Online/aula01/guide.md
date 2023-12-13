# Guia para Organizar e Versionar Seus Exercícios com Git 📂👩‍💻👨‍💻

Vamos aprender como organizar e versionar seus exercícios de forma eficiente usando Git e uma estrutura de pastas bem organizada. 😊

## Exemplo de Estrutura de Pastas para Seus Exercícios em Java 📂

Para começar, vamos organizar seus exercícios em uma estrutura de pastas como esta:

```
├── src
│   ├── aula01/
│   │   ├── exercicio01
│   │   │   ├── ClasseExemplo.java
│   │   │   ├── PrincipalA01E01.java
│   │   ├── exercicio02
│   │   │   ├── PrincipalA01E02.java
│   ├── aula02/
│   │   ├── exercicio01
│   │   │   ├── ClasseExemplo.java
│   │   │   ├── PrincipalA02E01.java
│   │   ├── exercicio02
│   │   │   ├── PrincipalA02E02.java
│   └── ...
├── Main.java   
└── ...
```

## Como montar essa estrtutura:
- Passo 1: Abra o IntelliJ IDEA e certifique-se de que o projeto java-caldeira está aberto no IntelliJ.
- Passo 2.: Clique com o botão direito do mouse na pasta com nome do repositorio e selecione "New" (Novo) e, em seguida, "module" (Modulo). Isso criará um novo module dentro da pasta selecionada.
- Passo 3: Dê um nome para a nova pasta. Por exemplo, se você deseja criar a pasta "src", insira o nome "src" e pressione Enter.
- Passo 4: Clique com o botão direito do mouse na pasta src e selecione "New" (Novo) e, em seguida, "package" (Pacote). Isso criará um novo pacote dentro da pasta selecionada.
- Passo 5: Dê um nome para a nova pasta. Por exemplo, se você deseja criar a pasta "src", insira o nome "src" e pressione Enter.
- Passo 6: Repita os passos 4 e 5 para criar as pastas restantes (aula01, aula02, etc...) conforme a estrutura desejada.
- Passo 7: Clique com o botão direito do mouse na pasta da aula (aula01, aula02, etc...) e selecione "New" (Novo) e, em seguida, "Java Class" (Classe Java). Isso criará uma nova classe dentro da pasta selecionada.
- Passo 8: Você também pode criar o arquivo "Main.java" seguindo os mesmos passos, se ele não existir.

Por exemplo, sua Classe PrincipalA02E02.java

```java
package aula01.exercicio02;

public class PrincipalA02E01 {
    public void run() {
        System.out.println("hello Exercicio 02");
    }
}
```

E sua Classe principal iria executar o programa:

```java
   import aula01.exercicio01.PrincipalA01E01;
   import aula01.exercicio02.PrincipalA02E01;
   
   public class Main {
       public static void main(String[] args) {
           var ex1 = new PrincipalA02E01();
           ex1.run();
           var ex2 = new PrincipalA01E01();
           ex2.run();
       }
   }
```
🚨 Lembre-se de comentar os exercicios que você não quer executar.


# Dicas para Usar o Git/GitHub Durante as Aulas

Você pode usar serviços como o GitHub, GitLab ou Bitbucket para criar repositórios remotos onde você armazenará seu código online. Isso permite que você faça backup e compartilhe seu trabalho com outras pessoas.
Nas aulas vamos utilizar o GitHub.

1. 🚀**Inicialize um Repositório Git:** No seu Github crie um repositorio com o nome de  `JavaCaldeira` e marque a opção de criar um README.md , depois de criado, clone o repositorio para uma pasta no seu computador!

2. 🌿**Ramos Mágicos:** Use ramos (`branches`) para testar ideias novas ou resolver problemas.
   Certifique-se de estar na branch principal (normalmente chamada "main")
   ```bash
    git branch a01ex01
   # Troque para a branch "a01ex01"
    git checkout a01ex01
   ```

3. ☕**Commits:** Sempre que você concluir um exercício ou fizer alterações significativas em seu código, faça um "commit" com uma mensagem explicativa. Isso ajuda a rastrear o histórico de alterações. Faça commits pequenos e bem explicados.
   ```
    git commit -m "Adicionado método calcularMedia()"
   ```

4. 📡**Repositório Remoto:** Faça push para o repositório remoto (como o GitHub) para manter seu código seguro.
   ```
    git push origin a01ex01
   ```

5. 🔄**Atualizações do Repositório Remoto:** Use o git pull para obter as atualizações mais recentes do repositório remoto. Isso é importante para manter seu código sincronizado com o trabalho de seus amigos.
   ```
     git pull
   ``` 

6. 🤝**Lidando com Conflitos:** Se dois amigos editam o mesmo arquivo, pode ocorrer um conflito. Resolvam juntos!
     
     - Quando você executa um git pull e há conflitos, o Git informará quais arquivos estão em conflito. Você pode ver os conflitos diretamente nos arquivos afetados, pois o Git os marca com indicadores especiais, como `<<<<<<<`, `=======`, e `>>>>>>>`.
     
     - A seção HEAD representa o seu código local, enquanto a seção branch-conflitante representa as alterações feitas por outra pessoa.
     
     - Edite o arquivo para decidir como você deseja combinar as alterações conflitantes. Você pode manter seu código, o código do outro contribuidor ou uma combinação dos dois, dependendo da situação. Certifique-se de remover os marcadores de conflito `<<<<<<<`, `=======`, `>>>>>>>` após a resolução.
     
     - Depois de resolver todos os conflitos em todos os arquivos, você precisa adicionar os arquivos alterados com `git add` e, em seguida, fazer um novo commit com `git commit`.
     
     - Após resolver os conflitos e fazer o commit, você pode continuar o merge ou pull que estava em andamento.
     
     - É importante testar seu código após resolver os conflitos para garantir que tudo funcione como esperado.

  
7. *🕵️*Ignorando o Lixo:** Crie um arquivo `.gitignore` para dizer ao Git quais arquivos ignorar.

   ```
    # Arquivos temporários gerados pelo IDE (por exemplo, IntelliJ IDEA ou Eclipse)
    .idea/
    
    # Arquivos compilados e bytecode
    *.class
    
    # Diretórios de saída de compilação
    bin/
    target/
    
    # Arquivos de log
    *.log
    
    # Arquivos de configuração do Maven (se estiver usando Maven)
    target/
    pom.xml.tag
    pom.xml.releaseBackup
    pom.xml.versionsBackup
    pom.xml.next
    release.properties
    dependency-reduced-pom.xml
    buildNumber.properties
    
    # Arquivos de configuração do Gradle (se estiver usando Gradle)
    .gradle/
    build/
    
    # Diretório de saída do IntelliJ IDEA
    out/
   ```

8. 🐙 Use o GitHub Desktop: Se preferir uma interface gráfica, o [GitHub Desktop](https://desktop.github.com/) é ótimo! 

9. 🤖 Trabalhe em Equipe: Se você e seus amigos colaboram, sigam um modelo como o Gitflow para manter o código limpo.

10. 📘 Aprenda Mais: Explore recursos avançados, como git rebase, para se tornar um ninja do Git!
   

# Dicas para Programar de Forma Limpa em Java

1. **Nomes Significativos:** Dê nomes que façam sentido para variáveis e métodos, como `nomeDoUsuario` ou `calcularMedia`. Evite nomes genéricos como `x`, `y`, `temp`, etc.

2. **Mantenha Simplicidade:** Código complexo assusta! Divida tarefas em partes menores e mais fáceis de entender. Divida o código em funções/métodos menores e reutilizáveis.

3. **Comentários Inteligentes:** Use comentários para explicar partes do código que são complexas ou não óbvias.

   - ERRADO
   ```java
      public void calcularImposto(double salario) {
          // Função para calcular
          double imposto = salario * 0.2;
          System.out.println("Imposto a ser pago: " + imposto);
      }
   ```
   
   - CORRETO
   ```java
      public void calcularImposto(double salario) {
          // Calcula o imposto com base no salário
          double imposto = salario * 0.2;
          System.out.println("Imposto a ser pago: " + imposto);
      }
   ```

5. **Formatação Amigável:** Siga as regras de formatação do Java para manter tudo organizado.

   - ERRADO
   ```java
      public class Exemplo {
      public static void main(String[] args) {
      int numero = 42;
      if (numero > 0) {
      System.out.println("Número positivo");
      } else {
      System.out.println("Número negativo ou zero");
      }
      }
      }
   ```
   
   - CORRETO
   ```java
      public class Exemplo {
          public static void main(String[] args) {
              int numero = 42;
              if (numero > 0) {
                  System.out.println("Número positivo");
              } else {
                  System.out.println("Número negativo ou zero");
              }
          }
      }
   ```

6. **Evite Magia:** Evite números mágicos no código. Use constantes ou variáveis com nomes significativos em vez de números literais.

   - ERRADO
   ```java
      double resultado = valor * 0.1;

   ```
   
   - CORRETO
   ```java
      public static final double TAXA_DE_JUROS = 0.1;
      // ...
      double resultado = valor * TAXA_DE_JUROS;
   ```

7. **Use Herança e Polimorfismo com Cuidado:** Herança e polimorfismo são poderosos, mas use-os quando faz sentido. Não herde de classes apenas para reutilização de código.

8. **Evite Classes Gigantes:** Divida classes grandes em classes menores e mais especializadas. Siga o princípio da responsabilidade única.

9. **Teste seu Código:** Escreva testes unitários para verificar se seu código funciona conforme o esperado. Isso ajuda a identificar problemas rapidamente.

10. **Mantenha Dependências Atualizadas:** Mantenha as bibliotecas e dependências do seu projeto atualizadas para aproveitar correções de bugs e melhorias de desempenho.


Lembre-se, amigo, a prática é a chave! Comece com projetos simples e vá avançando. 🚀 E se precisar de ajuda, a comunidade e a documentação do Java e do Git estão aí para você.

## Lista de alguns sites que podem te ajudar

1. **Stack Overflow** - [Stack Overflow](https://stackoverflow.com)
   - Stack Overflow é uma comunidade de perguntas e respostas onde programadores podem fazer perguntas, responder a perguntas de outros desenvolvedores e aprender com uma vasta base de conhecimentos.

2. **Medium** - [Medium](https://medium.com)
   - Medium é uma plataforma de publicação de artigos e tutoriais escritos por especialistas em diversos campos, incluindo programação. É uma fonte valiosa de informações e tutoriais sobre programação e desenvolvimento de software.

3. **W3Schools** - [W3Schools](https://www.w3schools.com)
   - W3Schools é um recurso popular para aprender tecnologias web, como HTML, CSS, JavaScript e muitos outros. Oferece tutoriais interativos e exemplos práticos.

4. **GeeksforGeeks** - [GeeksforGeeks](https://www.geeksforgeeks.org)
   - GeeksforGeeks é um site que oferece uma ampla variedade de tutoriais e recursos relacionados à ciência da computação e programação. É especialmente útil para preparação de entrevistas técnicas.
  
### O que NÃO FAZER:

- Metodologia Extreme Go Horses: https://gohorse.com.br/extreme-go-horse-xgh/

