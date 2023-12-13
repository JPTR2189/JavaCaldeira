# Primeiros passos para Iniciar em Java ☕

Você que está entrando no mundo do desenvolvimento e considerando Java, saiba que você está prestes a embarcar em uma jornada incrível. Java é como um vinho 🍷, melhorando com o tempo,
e com seus 27 anos, é uma escolha madura e confiável.

## 🚀 Por Que Escolher Java?

- **Linguagem de Longa Data:** Java é como aquele amigo que sempre esteve lá. Com quase três décadas, é confiável e sólido. 💪

- **Ecossistema Forte:** Não é só Java! Há bibliotecas e frameworks para todas as necessidades, desde aplicações desktop até big data. 🌐

## **Entendendo o Básico do Java**

O Java é uma linguagem de programação que a galera usa pra fazer aplicativos e programas de computador. Ela é orientada a objetos, o que significa que podemos juntar pedacinhos de código
como peças de Lego para criar coisas incríveis.

### **Como Funciona**

Quando a gente escreve código em Java, ele não roda direto no computador. 
Antes, ele passa por um processo de transformação e fica guardado em um formato especial chamado byte-code. Esse byte-code é como uma versão universal da nossa criação.
Aí entra em cena a Máquina Virtual Java (JVM). 

## **O Poder da JVM**

Imagina a JVM como um assistente que ajuda o código a rodar. Ela cuida de coisas como traduzir o código especial byte-code, controlar a memória e garantir que tudo funcione direitinho. 
É como um tradutor e um gerente de operações ao mesmo tempo.

## **As Ferramentas Necessárias o Java Development Kit (JDK)**

Quando você quer começar a programar em Java, precisa de um kit de um pacote ferramentas chamado JDK.
O OpenJDK é praticamente a mesma coisa, mas com um detalhe: é como se ele fosse um "projeto aberto",
ou seja, muita gente colabora e contribui para tornar o Java ainda mais acessível para todos.

É como se o OpenJDK fosse uma grande comunidade de pessoas que trabalham juntas para manter o Java incrível e disponível para todo mundo.
Eles estão sempre cuidando para que as ferramentas sejam as melhores possíveis e que qualquer um possa usar.

## **Um Clube de Ideias - JCP**

Se a galera quiser mudar alguma coisa no Java, tem um grupo chamado JCP (O Java Community Process) que cuida disso. Eles sempre pensam em jeitos de melhorar o Java e fazer ele ficar ainda mais poderoso.
Então, se um dia você ouvir falar do JCP, lembre-se que são essas pessoas que estão nos bastidores, garantindo que o Java continue evoluindo e se adaptando às nossas necessidades! 🤝📚

### Distribuição

Agora a parada fica interessante! Pensa assim: a plataforma Java é tipo uma festa e quem mantém essa festa funcionando é o projeto OpenJDK.
Imagine que nessa festa, tem vários fornecedores, tipo Amazon, Microsoft, Oracle e outros, que trazem seus próprios "pratos" de Java para a mesa.
E aí que entra a diferença: cada "prato" tem suas particularidades, como suporte profissional, tipos de sistemas que suportam e até jeitos diferentes de cuidar do lixo, tipo "garbage collectors".

Alguns dos fornecedores são:
Eclipse Temurin: O Eclipse Temurin é suportado por um grupo de empresas como Google, Red Hat, Microsoft, Alibaba, Azul e outras. Ele oferece uma versão gratuita que contém todas as ferramentas necessárias para desenvolver e executar aplicações em Java. Além disso, é compatível com o Test Compatibility Kit (TCK) da JDK, o que o torna uma JVM "homologada". Caso seja necessário, também possui suporte comercial disponível por diferentes fornecedores.

- Oracle JDK: A Oracle, uma das principais impulsionadoras do Java, oferece o Oracle JDK. Ele tem tanto uma versão gratuita quanto uma versão paga, com recursos adicionais e suporte profissional.

- AdoptOpenJDK: Essa organização mantém distribuições do OpenJDK com foco em transparência e colaboração. Eles fornecem uma variedade de versões e atualizações regulares.

- Amazon Corretto: A Amazon oferece o Amazon Corretto, um JDK certificado e otimizado para uso na AWS. É uma opção sólida para quem opera na infraestrutura da Amazon.

- Azul Zulu: A Azul Systems fornece o Zulu JDK, conhecido por sua alta performance e suporte a diversas plataformas. Ele é oferecido em diferentes edições para atender diversas necessidades.

- Microsoft Build of OpenJDK: A Microsoft também oferece sua distribuição do OpenJDK, focada em fornecer uma experiência compatível com suas soluções em nuvem na plataforma Azure.

- Red Hat OpenJDK: A Red Hat, conhecida por sua contribuição para tecnologias open-source, oferece o Red Hat OpenJDK, alinhado com suas ofertas e suporte.

- Alibaba Dragonwell: A Alibaba Cloud traz o Dragonwell JDK, otimizado para ambientes em nuvem e amplamente utilizado em suas operações.

E aí, você pergunta: qual "prato" escolher? Bom, no começo, não precisa quebrar a cabeça com isso. Durante as aulas vamos te guiar nisto. 


## 👉 Primeiros Passos

Se ainda está confuso, relaxa! Isso é normal. Aqui estão algumas dicas para iniciar:

1. **Comece com Café:** Antes de tudo, pegue uma xícara de café ☕ e prepare-se para ler!

2. **Escolha a Versão Certa:** Opte pela versão LTS (long-term support) que é declarada a cada 2 anos. No momento, é a Java 17. Versões não LTS que é
lançada a cada 6 meses(como a 18 e 19) são legais, mas podem ser um pouco complicadas. 📅

4. **Instalação do Java:** Criamos um [Guia de Instalação Java](java_install.md) para ajudar nessa etapa, pode dar uma olhada nele agora ou seguir aqui no guia. 🛠️

5. **Build Tool:** Você precisará de uma ferramenta de automação da compilação do projeto. Essas ferramentas ajudam não apenas na compilação, como no gerenciamento das dependências (bibliotecas terceiras que você utilizará), execução e validação dos testes automatizados, montagem dos artefatos (arquivos .jar), entre outras. As ferramentas mais conhecidas incluem Apache Maven, Gradle e Bazel. Vamos utilizar a ferramenta Gradle também é popular e poderosa, tem muita flexibilidade e funcionalidades interessantes como compilação incremental (ou compilation avoidance, que, de forma inteligente, compila apenas as partes que foram modificadas). São funcionalidades interessantes, porém mais avançadas.

6. **Esolha da IDE:** Minha sugestão é utilizar o IntelliJ IDEA. É uma IDE relativamente pesada, mas te dará suporte valioso em todas as etapas do desenvolvimento: desde a criação do projeto, com o versionamento (git), com os testes automatizados, com as execuções do Maven/Gradle, com sugestões para simplificar e/ou melhorar seu código, com refatorações, suporte a debugging, ou seja, vale a pena. Vale citar que existe a versão Community (free) e também a Ultimate (paga). Reserve um tempo para aprender e se acostumar com as teclas de atalho, pois elas te salvarão muito tempo no dia a dia. Existem outras IDEs igualmente famosas: Eclipse IDE e NetBeans. Como não poderia deixar de ser, existem opções bastante leves, como é o caso do VSCode com o auxílio de plugins para suportar a linguagem Java. Esta seria a minha segunda opção depois do IntelliJ.

7. **Seu Primeiro Programa:** Crie um "Hello World"! É assim que todo mundo começa. O código é como:

```java
public class HelloWorld {
  public static void main(String... args) {
    System.out.println("Hello world!");
  }
}
```
