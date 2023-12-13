## Interface e Enum

**Interface em Java** 📜🤝

Uma interface em Java é como um contrato que define um conjunto de ações que as classes devem seguir. É como uma lista de coisas que todas as classes devem fazer, mas sem a implementação real. 
Imagine que você tem um controle remoto que precisa funcionar com diferentes tipos de TVs. O controle remoto é como uma interface, e cada marca de TV deve seguir as mesmas regras (ligar, desligar, trocar de canal).

- **Características:** 
   - Declara métodos, mas não os implementa.
   - Pode ser implementada por várias classes.
   - Garante um contrato de métodos.

- **Quando Usar:** 
   - Use interfaces quando diferentes classes precisam compartilhar um conjunto comum de ações.
   - Útil para criar um comportamento consistente em classes diferentes.

- **Exemplo:**
```java
// Declaração de uma interface
interface ControleRemoto {
    void ligar();
    void desligar();
    void trocarCanal(int canal);
}

// Implementação em uma classe
class TVSony implements ControleRemoto {
    public void ligar() {
        // Código para ligar a TV Sony
    }

    public void desligar() {
        // Código para desligar a TV Sony
    }

    public void trocarCanal(int canal) {
        // Código para trocar o canal na TV Sony
    }
}

```

**Enum** 🌟📊

Um enum (enumeração) em Java é um tipo de dados usado para representar um conjunto fixo de valores nomeados.
Pense em um cardápio de restaurante com opções de tamanho para um refrigerante: Pequeno, Médio, Grande. Um enum representa essas opções como valores nomeados.

- **Características:** 
   - Define constantes nomeadas.
   - Limita as opções a um conjunto fixo.

- **Quando Usar:** 
   - Use enums quando tiver um conjunto predefinido de valores que não mudarão.
   - Útil para melhorar a legibilidade do código e evitar erros de digitação.

- **Exemplo:**
```java
// Declaração de um enum
enum TamanhoRefrigerante {
    PEQUENO,
    MÉDIO,
    GRANDE
}

// Uso do enum em um método
public void pedirRefrigerante(TamanhoRefrigerante tamanho) {
    if (tamanho == TamanhoRefrigerante.GRANDE) {
        // Faça algo para o tamanho grande
    }
}
```
