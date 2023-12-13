# Aula de Herança e Polimorfismo em Java! 🚀

Vamos falar sobre dois conceitos importantes em Java: **herança** e **polimorfismo**.🎉

## Herança 🏰

**O que é Herança?**

Herança é como quando você herda a receita secreta da pizza da sua avó! 🍕 Em Java, é a mesma ideia! Uma classe pode "herdar" coisas (campos e métodos) de outra classe. A classe filha pode substituir (sobrescrever) os métodos herdados para fornecer uma implementação específica. Isso é ótimo porque economiza tempo de escrita de código.💪

🚨 **Mas atenção:** nem todos os membros da classe base são acessíveis na classe derivada. Isso depende dos segredos de acesso de cada membro. Portanto, lembre sempre dos atributos de acesso:

**sem atributo**: acesso permitido a partir de todas as classes no mesmo pacote (esta opção não deve ser usada); 
**public**: acesso permitido de qualquer classe em qualquer lugar; 
**private**:  sem acesso de fora da classe; 
**protected**: acessível a partir de todas as classes no mesmo pacote e a partir de qualquer sub-classe em qualquer lugar. 

**Por que Usar Herança?**

Você pode criar uma classe base com coisas que várias outras classes têm em comum. Por exemplo, se você tem uma classe `Animal`, pode criar subclasses como `Cachorro` 🐶 e `Gato` 😾 que herdam coisas da classe `Animal`.

**Exemplo de Herança em Java**

```java
public class Animal {
    String nome;
    
    public Animal(String nome) {
        this.nome = nome;
    }
    
    public void fazerSom() {
        System.out.println("O animal faz um som!");
    }
}

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }
    
    public void fazerSom() {
        System.out.println("O cachorro late!");
    }
}
```
Aqui, Cachorro é uma subclasse de Animal e herda o nome e o método fazerSom().

## Polimorfismo 🦋

O polimorfismo é um dos quatro pilares da programação orientada a objetos, juntamente com encapsulamento, herança e abstração. Ele permite que objetos de diferentes classes sejam tratados de maneira uniforme, o que facilita o desenvolvimento e a manutenção de código.

Em termos de programação, polimorfismo representa a capacidade de uma única referência invocar métodos diferentes, dependendo do seu conteúdo.

**Exemplificando -Diferentes Veículos, Mesmo Comando!** 🚗🏍️

Imagine que você tem uma garagem mágica cheia de diferentes tipos de veículos: carros 🚗, motos 🏍️ e até mesmo aviões! Todos eles têm a habilidade de "ligar", mas cada um faz isso do seu jeito especial.

Em programação, o polimorfismo te permite dar o mesmo "comando" (ligar) para todos esses veículos, mas cada um responde de maneira única. É como se você pudesse usar uma "chave" mágica 🔑 que funciona em qualquer veículo.

Para fazer isso, usamos uma "chave" (referência) genérica para se referir a esses veículos, que são um tipo especial de veículo maior (superclasse). Mas só podemos dar o "comando" (ligar) se for algo que todos os veículos têm em comum com o tipo maior (superclasse), como iniciar o motor.

Quando usamos a "chave" (referência) genérica para ligar um veículo, o computador verifica o tipo de veículo (classe) que a "chave" está referenciando quando o programa é escrito (compilado). Mas quando o programa é realmente executado, ele olha para o veículo em si e faz o que o veículo sabe fazer com base em sua própria classe. Isso é como o truque mágico que permite que o Java decida, enquanto o programa está sendo executado, como cada veículo deve responder ao comando de ligar, com base em sua própria classe. Chamamos isso de "ligação dinâmica"! 🌟

O motivo pelo qual o Java faz isso é para que possamos escrever códigos genéricos que funcionem com muitos tipos diferentes de veículos mágicos sem precisar verificar o tipo de veículo a cada vez que ligamos. É como se você pudesse ligar todos os seus veículos de forma mágica, independentemente de serem carros, motos ou naves espaciais. 🪄🌌🌠

**Classe Base: Veiculo**
```java
public class Veiculo {
    public void ligar() {
        System.out.println("O veículo está ligado.");
    }
}
```

**Subclasses: Carro e Moto**
```java
public class Carro extends Veiculo {
    @Override
    public void ligar() {
        System.out.println("O carro está ligado.");
    }
}

public class Moto extends Veiculo {
    @Override
    public void ligar() {
        System.out.println("A moto está ligada.");
    }
}
```
**Uso do Polimorfismo**
```java
public class ExemploPolimorfismo {
    public static void main(String[] args) {
        // Usando a referência genérica
        Veiculo veiculo1 = new Carro();
        Veiculo veiculo2 = new Moto();

        // Chamando o método ligar
        veiculo1.ligar(); // O carro está ligado.
        veiculo2.ligar(); // A moto está ligada.
    }
}
```
## Classes Abstratas 📝

Além da herança, Java oferece outro mecanismo importante: as classes abstratas. As classes abstratas atuam como um 'template' para outras classes que herdam delas, sendo incapazes de serem instanciadas por si só.
Por exemplo, é definido que a classe “Animal” seja herdada pelas subclasses “Gato”, “Cachorro”, “Cavalo”, mas ela mesma nunca pode ser instanciada.

**Por que Usar Classes Abstratas?**

As classes abstratas são úteis quando você tem um conjunto comum de métodos que devem ser implementados por várias subclasses, mas a implementação desses métodos pode variar de uma subclasse para outra. Ao definir esses métodos na classe abstrata, você garante que todas as subclasses terão esses métodos, mas cada uma pode fornecer sua própria implementação específica.

**Exemplo de Classe Abstrata em Java**

```java
public abstract class FormaGeometrica {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

public class Circulo extends FormaGeometrica {
    private double raio;
    
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

```
Neste exemplo, FormaGeometrica é uma classe abstrata que define métodos calcularArea() e calcularPerimetro(), que devem ser implementados por qualquer classe que herde dela. A classe Circulo é uma subclasse que fornece sua própria implementação para esses métodos.

Lembre-se de que você não pode criar um objeto diretamente a partir de uma classe abstrata, mas pode criar objetos de suas subclasses.
