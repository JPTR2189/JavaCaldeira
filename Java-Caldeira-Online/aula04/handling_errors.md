## Exceções e Tratamento de Erro em Java 🚨🛠️


**Exceções** em Java são eventos anormais ou erros que podem ocorrer durante a execução do programa. O tratamento de erro é o processo de lidar com essas exceções de maneira controlada. 
Imagine que você está dirigindo um carro 🚗, mas de repente algo dá errado. Pode ser um pneu furado 📌, um tanque vazio de gasolina ⛽, ou qualquer outra coisa que te impeça de continuar dirigindo.
Isso é um erro ou uma exceção na sua viagem.

Em Java, quando escrevemos programas, também podem acontecer erros imprevistos, como tentar dividir um número por zero 🙅‍♂️, 
tentar acessar uma posição inválida em uma lista 📝, ou até mesmo perder a conexão com a internet 🌐 quando você está fazendo uma chamada para um servidor. 
Para lidar com essas situações, usamos o tratamento de erros e exceções em Java. É como ter um plano B quando seu carro apresenta problemas durante uma viagem! 🚗💨

- **Características:** 
   - Exceções representam erros ou condições excepcionais.
   - O tratamento de erro permite que o programa continue a funcionar após um erro.

- **Quando Usar:** 
   - Use exceções para lidar com situações excepcionais que podem interromper o programa.
   - Use o tratamento de erro para capturar e lidar com exceções de maneira controlada.

- **try-catch 🧡** 
   - O código dentro do bloco try é como você dirige o carro, mas se algo der errado, o código no bloco catch entra em ação para resolver o problema. 🦸‍♂️
     
   - **Características:** 
   - O bloco try-catch é usado para envolver um trecho de código onde uma exceção pode ocorrer.
   - Se uma exceção ocorrer dentro do bloco try, o controle é transferido para o bloco catch, onde você pode lidar com a exceção.

   - **Quando Usar:** 
      - Use try-catch quando você espera que uma exceção específica possa ocorrer e deseja tomar medidas para lidar com ela.
      - Isso evita que o programa pare de funcionar abruptamente.

  - **Exemplo:**
  ```java
  try {
      // Código que pode causar um erro
  } catch (TipoDeExcecao nomeDaExcecao) {
      // O que fazer se ocorrer um erro
  }
  ```
  - **Mais Exemplo:**
  
  - Cenário:
  Vamos imaginar que estamos criando um programa para calcular a média de notas de alunos.
  Pedimos ao usuário que insira as notas e, em seguida, calculamos a média.
  No entanto, precisamos garantir que o programa seja robusto e lide corretamente com todas as possíveis situações.
  ```java
  import java.util.Scanner;
  
  public class CalculadoraDeMedia {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
  
          int totalNotas = 0;
          double somaNotas = 0.0;
  
          System.out.println("Calculadora de Média de Notas");
          System.out.print("Quantas notas você deseja inserir? ");
  
          try {
              totalNotas = scanner.nextInt();
              if (totalNotas <= 0) {
                  throw new IllegalArgumentException("O número de notas deve ser maior que zero.");
              }
  
              System.out.println("Digite as notas:");
  
              for (int i = 0; i < totalNotas; i++) {
                  double nota = scanner.nextDouble();
  
                  // Verificar se a nota está no intervalo válido (0 a 10)
                  if (nota < 0 || nota > 10) {
                      throw new IllegalArgumentException("Nota fora do intervalo válido (0 a 10).");
                  }
  
                  somaNotas += nota;
              }
  
              double media = somaNotas / totalNotas;
              System.out.println("A média das notas é: " + media);
          } catch (IllegalArgumentException e) {
              System.err.println("Erro: " + e.getMessage());
          } catch (java.util.InputMismatchException e) {
              System.err.println("Erro: Entrada inválida. Certifique-se de inserir números.");
          } finally {
              scanner.close();
          }
      }
  }
  ```

   - **Múltiplos catch:**
  
  - **Características:**
  Você pode ter vários blocos catch após um único bloco try. Cada bloco catch pode tratar um tipo específico de exceção.
   - **Quando Usar:** 
  Use múltiplos blocos catch quando seu código pode gerar diferentes tipos de exceções e você deseja lidar com cada tipo de exceção de maneira diferente.
  ```java
  try {
      // Código que pode gerar exceções
  } catch (ArithmeticException e) {
      // Tratamento para divisão por zero
  } catch (NullPointerException e) {
      // Tratamento para referência nula
  } catch (Exception e) {
      // Tratamento para outras exceções
  }
  ```
  
- **throws 📣** 
   - Às vezes, você pode querer que outra pessoa saiba que algo pode dar errado, assim como você avisa seus amigos que seu carro tem um problema.
   - Em Java, usamos a palavra-chave throws para sinalizar que um método pode lançar uma exceção.
 
   - **Características:** 
     - A palavra-chave throws é usada para declarar que um método pode lançar uma exceção específica.
     - Isso informa aos chamadores do método que eles devem estar preparados para lidar com essa exceção.

   - **Quando Usar:** 
      - Use throws quando você quer indicar que seu método pode gerar uma exceção específica, mas não deseja tratá-la dentro do próprio método.
      - Isso transfere a responsabilidade de tratamento de exceção para quem chama o método.

  - **Exemplo de uso de throws:**
  ```java
  public int dividir(int dividendo, int divisor) throws ArithmeticException {
      if (divisor == 0) {
          throw new ArithmeticException("Divisão por zero não é permitida.");
      }
      return dividendo / divisor;
  }
  ```

- **finally 🏁** 
   - Às vezes, você precisa garantir que algo seja feito, mesmo que ocorra um erro.
   - O bloco finally é como chegar ao seu destino, independentemente do que aconteça no caminho. 🏠
     
   - **Características:** 
     - O bloco finally é usado para conter código que sempre será executado, independentemente de ocorrer uma exceção ou não dentro do bloco try. 
     - Isso é útil para ações de limpeza ou liberação de recursos.

   - **Quando Usar:** 
      - Use finally quando você tem código que deve ser executado, como fechar um arquivo ou conexão com banco de dados, independentemente de ocorrer uma exceção ou não.

  - **Exemplo:**
  ```java
  FileInputStream arquivo = null;
  try {
      arquivo = new FileInputStream("arquivo.txt");
      // Código para ler o arquivo
  } catch (FileNotFoundException e) {
      // Tratamento da exceção
      System.out.println("Arquivo não encontrado.");
  } finally {
      // Fechamento do arquivo (mesmo se ocorrer uma exceção)
      if (arquivo != null) {
          arquivo.close();
      }
  }
  ```

  - **Exceções Personalizadas 🚀🪙**
    - É como criar sua própria moeda personalizada no mundo das exceções! 💰💼
     
    - **Características:** 
      - Você pode criar suas próprias classes de exceção personalizadas estendendo as classes de exceção existentes, como Exception ou RuntimeException. 
      - Permite que você defina exceções específicas para suas necessidades.

   - **Quando Usar:** 
      - Use exceções personalizadas quando você precisa sinalizar erros específicos em seu código que não podem ser tratados adequadamente pelas exceções padrão do Java. 🚧🚨

  - **Exemplo:**
  ```java
  class MinhaExcecaoPersonalizada extends Exception {
      public MinhaExcecaoPersonalizada(String mensagem) {
          super(mensagem);
      }
  }
  ```

  - **Um pouco mais de Exemplo:**
  - Cenário:
   Imagine que estamos construindo um jogo de aventura text-based, onde os jogadores exploram um labirinto misterioso 🎮. Em nosso jogo, queremos lidar com uma situação em que o jogador encontre uma porta trancada.🚪🗝️🔐
   
   Vamos criar uma exceção personalizada chamada PortaTrancadaException para representar a situação em que o jogador encontra uma porta trancada.
     ```java
   class PortaTrancadaException extends Exception {
       public PortaTrancadaException(String mensagem) {
           super(mensagem);
       }
   }
     ```
   
   Agora, no código do jogo, quando o jogador tenta abrir uma porta e ela está trancada, lançamos a exceção PortaTrancadaException.
  
     ```java
   public void tentarAbrirPorta() throws PortaTrancadaException {
       // Simulando a tentativa de abrir uma porta trancada
       boolean portaTrancada = true;
   
       if (portaTrancada) {
           throw new PortaTrancadaException("A porta está trancada! Encontre a chave para abri-la.");
       } else {
           System.out.println("A porta se abre, revelando um novo caminho!");
       }
   }
     ```
   
    Quando o jogador tenta abrir a porta, precisamos tratar a exceção PortaTrancadaException para dar ao jogador uma dica sobre como proceder.
  ```java
  public static void main(String[] args) {
       try {
           // Tentativa de abrir a porta
           tentarAbrirPorta();
       } catch (PortaTrancadaException e) {
           // Tratamento da exceção
           System.out.println("Você encontrou uma porta trancada. Procure a chave!");
           System.out.println("Mensagem de erro: " + e.getMessage());
       }
   }
  ```
