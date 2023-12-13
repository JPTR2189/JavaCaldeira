## Maven 🏠

O Maven é uma ferramenta de código aberto mantida pela Apache. Trata-se de uma ferramenta de gestão de dependências e um task runner. 
Em outras palavras, o Maven faz o trabalho duro de compilação de projetos Java, gerenciar dependências e automatizar tarefas. 

### **Características do Maven:**

- **Convenção sobre Configuração (CoC):** O Maven segue um conjunto de convenções que simplifica o processo de configuração. Por exemplo, os arquivos de origem Java são esperados no diretório `src/main/java`, e as dependências são definidas no arquivo `pom.xml`.
- **Gerenciamento de Dependências:** O Maven faz o gerenciamento automático de dependências, buscando bibliotecas e frameworks de repositórios centralizados. Por exemplo, Se nós precisamos do driver do MySQL, por exemplo, simplesmente registramos essa dependência no pom.xml. As ferramentas de automação do Maven irão detectar esta dependência, baixa-la e configura-la no Build Path/Classpath de nosso projeto. 🧩
- **Ciclo de Vida de Construção (Build Lifecycle):** O Maven tem um plano de construção inteligente. Ele segue etapas predefinidas, como compilação, teste, empacotamento e distribuição, para construir seu projeto do início ao fim. 🚧
- **Arquivo POM (Project Object Model):** O Maven utiliza o arquivo `pom.xml` para configurar o projeto e suas dependências. . É como um mapa que diz ao Maven o que construir e como. 🗺️
- **Plugins:** É possível estender as funcionalidades do Maven usando plugins.

### **Onde Usar o Maven:**

- Maven é frequentemente usado em projetos Java padrão, especialmente em projetos corporativos e de código aberto.
- É popular em projetos baseados em servlets, JSP (JavaServer Pages), e em muitos projetos web e de backend em geral.
- É amplamente adotado em projetos Apache, como o Apache Tomcat.
- É possível automatizar a execução de testes unitários durante a fase de build, entre outras automatizações.

### **O que são os Maven Archetypes?🗺️💼**
Imagine que você deseja criar um projeto Java, como iniciar um novo jogo. Com o Maven, você não precisa construir a base do zero. Em vez disso,
você pode usar "arquétipos" (templates) para criar automaticamente a estrutura básica do seu projeto. 

Exemplos de arquétipos Maven comuns:

- **maven-archetype-quickstart:** Este é um arquétipo básico usado para criar um projeto Java simples. É um ponto de partida ideal para projetos Java padrão. 🚀

- **maven-archetype-webapp:** Útil ao criar aplicativos da web Java. Define a estrutura de diretórios e arquivos necessários para criar um aplicativo da web Java usando tecnologias como Servlets e JSP. 🌐

- **maven-archetype-spring:** Para projetos que usam o framework Spring, este arquétipo configura um projeto Spring com as dependências apropriadas. 🌼

- **maven-archetype-ear:** Usado para criar um arquivo EAR (Enterprise Archive) que pode conter vários módulos Java EE, como EJBs e aplicativos da web. 🏢

### **Exemplo de Uso do Maven?**

Suponhamos que você esteja criando um projeto Java simples com Maven. Você seguiria estes passos:

1. Crie um arquivo `pom.xml` com informações sobre o projeto e suas dependências.
2. Execute comandos:
   - `mvn clean` para limpar o projeto;
   - `mvn compile` para compilar o código;
   - `mvn test` para executar testes;
   - `mvn package` para criar um arquivo JAR executável. 🧱
3. O Maven cuidará automaticamente do download das bibliotecas que você especificou no `pom.xml` e as incluirá em seu projeto.

## Gradle 🌟

O Gradle é um sistema avançado de automatização de builds. Sua principal característica e vantagem é que ele une o melhor da flexibilidade do Ant com o gerenciamento de dependências e as convenções do Maven.

### Características do Gradle:

- **DSL (Domain-Specific Language):** O Gradle permite que você escreva scripts de construção usando uma DSL em Groovy ou Kotlin, oferecendo uma grande flexibilidade na configuração do projeto. 💪📝
- **Build by Convention or Configuration:** Você pode usar as convenções padrão do Gradle ou configurar tudo detalhadamente, dependendo das necessidades do projeto. 🤖🔧
- **Extensibilidade:** O Gradle é altamente extensível e suporta plugins que podem ser facilmente adicionados para estender suas funcionalidades.
- **Desempenho:** O Gradle é conhecido por sua velocidade de construção e é otimizado para projetos grandes.
- **Linguagem de Script:** Os arquivos de build do Gradle são scripts escritos na linguagem Groovy, o que oferece uma abordagem mais dinâmica e expressiva em comparação com os arquivos XML utilizados pelo Ant e Maven.
- **Flexibilidade de Scripting:** Como os arquivos de build são baseados em scripts, você tem a liberdade de realizar tarefas de programação diretamente no seu arquivo de configuração.🛠️
- **Integração com Android Studio:** Antes do Android Studio, o Eclipse era muito utilizado para o desenvolvimento Android. O Gradle simplificou muito o processo, automatizando tarefas complexas, como a conversão de classes Java em arquivos DEX e a criação do arquivo APK. Com essa integração, o desenvolvimento Android ficou ainda mais eficiente e ágil. 🤖📱

Tudo no Gradle se resume a dois conceitos básicos:

### Projects 🏢

Toda build da ferramenta é feita a partir de um ou mais projects, então, a representação de project dependerá de como você utilizará o Gradle. Você pode, por exemplo, ter um project que representa um JAR ou até mesmo uma aplicação web. Um project não necessariamente representa coisas que serão construídas, mas também pode representar coisas que serão feitas, como o deploy de sua aplicação para ambientes de homologação ou produção. 🌐

### Tasks 🧩

Cada project é feito de uma ou mais tasks. Cada uma significa um pedaço de trabalho que uma build vai executar. É possível ter tasks que fazem a compilação de classes, criação de JARs e até mesmo a publicação de arquivos para um repositório específico.

Agora, o Gradle é uma estrela tão brilhante que o Android Studio e o Hibernate já o adotaram como ferramenta padrão. ✨🌟🚀


### Onde Usar o Gradle:

- O Gradle é adequado para projetos Java de todos os tamanhos, mas brilha especialmente em projetos maiores e complexos.
- É comumente usado em projetos Android para construir aplicativos.
- É escolhido por muitos desenvolvedores Kotlin, já que suporta essa linguagem de programação de forma nativa.


### Exemplo de Uso do Gradle:

Vamos supor que você esteja criando um aplicativo Java usando o Gradle:

1. Crie um arquivo `build.gradle` na raiz do seu projeto.
2. No arquivo `build.gradle`, você especifica as dependências, tarefas personalizadas e configurações específicas do projeto.
3. Especifique as dependências necessárias para o seu projeto no mesmo arquivo, como bibliotecas, frameworks ou qualquer outro recurso que possa precisar.
4. Use comandos como `gradle build` para compilar o projeto e criar um APK.


## Maven VS Gradle

| Aspecto             | Gradle                                               | Maven                                                     |
| ------------------- | --------------------------------------------------- | --------------------------------------------------------- |
| Baseado em          | O Gradle é baseado no desenvolvimento de projetos de linguagem específica de domínio. | O Maven é baseado no desenvolvimento de software puramente em linguagem Java. |
| Configuração        | Utiliza uma Linguagem Específica de Domínio (DSL) baseada em Groovy para criar a estrutura do projeto. | Utiliza a Linguagem de Marcação Extensível (XML) para criar a estrutura do projeto. |
| Foco                | Enfoca o desenvolvimento de aplicativos adicionando novos recursos a eles. | Enfoca o desenvolvimento de aplicativos dentro de um limite de tempo especificado. |
| Desempenho          | Tem um desempenho melhor que o Maven, pois é otimizado para rastrear apenas a tarefa atual em execução. | Não cria arquivos temporários locais durante a criação de software e, portanto, é mais lento. |
| Compilação Java     | Evita a compilação.                                  | A compilação é necessária.                                |
| Usabilidade         | É uma ferramenta mais recente, o que exige que os usuários gastem mais tempo se acostumando com ela. | É uma ferramenta conhecida por muitos usuários e facilmente disponível. |
| Personalização      | É altamente personalizável, pois suporta uma variedade de IDEs. | Atende a um número limitado de desenvolvedores e não é tão personalizável. |
| Idiomas Suportados   | Suporta desenvolvimento de software em Java, C, C++ e Groovy. | Suporta desenvolvimento de software em Java, Scala, C# e Ruby. |
| Configuração do Projeto | Não usa arquivos XML para declarar a configuração do projeto. | Usa arquivos XML para declarar a configuração do projeto. |
| Baseado em          | Baseado em um gráfico de dependências de tarefas que fazem o trabalho. | Baseado nas fases do modelo fixo e linear. |
| Objetivo             | O principal objetivo do Gradle é adicionar funcionalidade ao projeto. | O principal objetivo do Maven é concluir o projeto dentro do prazo estabelecido. |

## Mas qual usar?

Isso, geralmente, depende do acordo com cliente/empresa, mas nós temos vistos mais projetos com Gradle devido a sua alta versatilidade e facilidade de leitura das dependências que um projeto tem - é muito mais rápido ler um arquivo em groovy do que o xml do maven - além de poder codificar tasks dentro dele que facilitam processos de implantações (deploy) de serviços web java. 
