# Orientação a Objetos com Java ☕

A orientação a objetos é uma abordagem no mundo da programação, que parte da seguinte premissa: precisamos modelar o mundo real por meio de objetos e suas interações. 🌍
Mas isso é muito vago, então vamos associar essa ideia a nossa vida, pensando em algo que todos nós conhecemos: uma conta bancária 💰.

Pense nas características que uma conta possui, numero, dono, banco, tipo... e as ações que uma conta pode executar, como depósito, saque, transferência, pix... 💳💸.

🏦 Uma **classe** é como o modelo da conta bancária. É como um formulário que diz como uma conta bancária deve ser. Por exemplo, o formulário tem espaços para o nome do dono da conta e o saldo.

💼 Um **objeto** é como uma conta bancária real que você cria usando esse formulário. Então, você preenche o formulário e obtém sua própria conta com o seu nome e saldo.

💰 Um **método** é como uma ação que você pode fazer com essa conta bancária. Por exemplo, você pode usar um método para adicionar dinheiro à conta (um depósito), usar outro método para retirar dinheiro (um saque) e um terceiro método para verificar quanto dinheiro tem na conta (saldo).

Então, quando traduzimos a ideia da conta para uma linguagem orientada a objetos, ele se torna uma representação de algo do mundo real, ou seja, ela se torna um **objeto** 🧐. E esse objeto tem suas ações (**métodos**) e suas características (**atributos**) que o tornam único e especial 🌟.
Você já entendeu o conceito, não é mesmo?

### Legal, mas e a classe? 🤔

A **classe** é como a receita de bolo para criar esse objeto, É como se fosse o passo a passo que nos diz o que um bolo deve ter, como ingredientes (atributos) e passsos a seguir (métodos) 🍰. Em outras palavras, define quais atributos (variáveis) e métodos (funções) um objeto desse tipo terá.

```java
    public class ReceitaDeBolo {
        // Atributos da classe ReceitaDeBolo
        private String nomeDoBolo;
        private String[] ingredientes;
        private String[] passos;
    }

```

### Atributos

Essas características que tornam o objeto único são os **atributos**. Por pertencerem somente ao objeto, colocamos a palavra private na frente 🔐.

```java
    
    private String conta;
    private double saldo;

```

### Métodos

Métodos são as ações que os objetos podem executar, funcionando como os mecanismos de interação entre o objeto e o mundo externo. Para que essas ações sejam acessíveis, usamos a palavra-chave 'public' na frente delas. Vamos dar uma olhada em um exemplo de depósito:

```java
   
    public void deposito(double valor) {
        this.saldo = saldo + valor;
    }            
    
```
Nesse caso, o método acima recebe um número por parâmetro, modifica uma propriedade da classe e não precisa retornar.

Beleza e quando a gente precisa do retorno? Por exemplo: se a gente quiser ver o nosso saldo:

```java
   
    public double retornaSaldo() {
        return this.saldo;
    }            
    
```

Quando criamos um método em Java, sempre precisamos respeitar algumas regrinhas de sintaxe:

    1. Tem que dizer se é público (public), privado (private) ou algo no meio (protected);
    2. A gente fala se o método vai dar alguma coisa de volta (como um número por exemplo) ou não (ai usamos o "void");
    3. Escolher um Nome maneiro e claro para o método;
    4. Parâmetros que recebe, sempre precisam ser identificados pelo seu tipo e um nome único;

### IMPORTANTE
> Sempre opte por criar métodos com uma responsabilidade, isso vai facilitar a leitura, entendimento e modificação do código. É um principio essencial de Clean Code! 🧹

### Contrutores 🏗️
Toda classe tem um construtor embutido nela e não possui parâmetros. Lembra como eram os métodos que funcionavam como ações da classe? Inclusive, temos o método especial de construir o objeto. Pense como se fosse um ritual de nascimento para os objetos!

```java
   
    public class Pessoa {

        private String nome;
        private int idade;
        
        // Construtor com parâmetros
        public  Pessoa(String nome, int idade {
            this.nome = nome;
            this.idade = idade;
        }

    public class Pessoa {

        private String nome;
        private int idade;
        
        // Construtor vazio (sem parâmetros)
        public  Pessoa() {
        }

    }           
    
```

### Checkpoint ✅

A orientação a objetos se baseia na ideia de objetos que têm características (atributos) e podem realizar ações (métodos), e esses objetos interagem uns com os outros. 
As Classes são usadas para definir modelos para criar objetos.

Juntando tudo, a gente teria algo assim:

```java
   
    public class Conta {

        private String conta;
        private double saldo;

        public void deposito(double valor) {
            this.saldo = saldo + valor;
        }

        public double retornaSaldo() {
            return this.saldo;
        } 
    }           
    
```

Para criar um objeto do tipo Conta, a gente precisa instanciar ele no nosso main, dessa maneira:

```java
   
    public class Principal {

        public static void main(String[] args) {
            //Cria o conta
            Conta conta = new Conta();

            //Interage com os métodos
            conta.deposito(200.0);
            System.out.println(armario.retornaSaldo());
        }
    }           
    
```

Legalzinho né? Mas será que esse código é a melhor abordagem para representar a Conta? Vamos ver... 🤔

### Convenções úteis do Javinha 📚

Bom pessoal, vocês leram nessa aula o suficiente para criaram as suas próprias classes e métodos, mas tem algumas convenções que são úteis para aprender e utilizar no Java:

 1. Atributos são estados (substantivos);
 2. Métodos são ações (verbos);

Logo, já teriamos que atualizar o código acima, não é mesmo? :smile

Mas, não é só isso! Na maioria das vezes, métodos que modificam atributos de uma classe recebem a palavra set no início e métodos que retornam, recebem a palavra get.
Vejam esse exemplo, criando uma abstração para um carro:

```java
   
    public class Carro {

        private String marca;
        private String modelo;

        //Métodos que retornam
        public String getMarca(){
            return this.marca;
        }

        public String getModelo(){
            return this.modelo;
        }

        //Metodos que atualizam valores
        public void setMarca(String novaMarca){
            this.marca = novaMarca;
        }

        public void setModelo(String novoModelo){
            this.modelo = novoModelo;
        }
    }
           
    
```

E esse this aí? É uma boa prática/convenção para dizer que esta referenciando o atributo da classe em si. A gente poderia refatorar um dos métodos set para ficar assim:

```java
   
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
```           

    
