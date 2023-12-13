# Exercicios de Java: Orientação a Objetos

### Não se esqueçam de salvarem esses códigos no repositório que criaram na aula 01.

### Exercício 01: Conta Bancária

Crie uma classe `ContaBancaria` com os atributos:

- `nome` (nome do titular da conta)
- `cpf` (número de CPF do titular)
- `identificadorConta` (número de identificação da conta)
- `banco` (nome do banco)
- `endereco` (endereço do titular)
- `saldo` (saldo disponível na conta)
- `horarioAtual` (um atributo para armazenar o horário atual)

Implemente os seguintes métodos na classe:

1. `saque(double valor)`: Realiza um saque da conta, desde que o saldo seja suficiente. Caso contrário, exibe uma mensagem de erro.

2. `deposito(double valor)`: Realiza um depósito na conta, atualizando o saldo.

3. `pix(double valor)`: Realiza uma transferência PIX. Caso contrário, exibe uma mensagem de erro.

4. `transferencia(ContaBancaria destino, double valor)`: Realiza uma transferência para outra conta bancária, verificando se o horário atual está dentro do intervalo permitido (8hrs às 19hrs) e se o saldo é suficiente. Caso contrário, exibe uma mensagem de erro.

5. `verificarSaldo()`: Exibe o saldo atual da conta.

6. `verificarHorario()`: Exibe o horário atual.

7. `verificarInformacoes()`: Exibe todas as informações da conta bancária, como nome, CPF, saldo, etc.

#### Tarefas adicionais:

8. Implemente uma validação no método `cpf` para garantir que o CPF seja um número válido.

9. Adicione um histórico de transações na conta bancária, registrando todas as operações de saque, depósito, PIX e transferência. Crie um método para exibir o histórico de transações.

10. Crie um construtor para a classe que permita inicializar os atributos iniciais da conta bancária.

11. Implemente um método `alterarEndereco(String novoEndereco)` para atualizar o endereço do titular da conta.

12. Adicione uma taxa de manutenção mensal à conta bancária, que seja deduzida automaticamente do saldo no primeiro dia de cada mês.

13. Crie um método `calcularJuros(double taxa)` que calcule juros sobre o saldo da conta e os adicione mensalmente.

14. Implemente um método `fecharConta()` que encerre a conta, zerando o saldo e não permitindo mais operações.
    
### Exercício 02: Círculo

Crie uma classe chamada `Circulo` com os seguintes atributos:

- `raio` (representando o raio do círculo)

Implemente os seguintes métodos na classe:

1. `calcularArea()`: Este método deve calcular a área do círculo com base no raio e retornar o resultado.

2. `calcularCircunferencia()`: Este método deve calcular a circunferência do círculo com base no raio e retornar o resultado.

Crie objetos da classe `Circulo` e utilize os métodos para calcular e exibir os resultados.

#### Tarefas adicionais:

3. Implemente um método `definirRaio(double novoRaio)` que permita alterar o raio do círculo.

4. Adicione validações nos métodos para garantir que o raio seja sempre um valor positivo.

5. Crie um construtor para a classe que permita inicializar o raio ao criar um objeto.

6. Implemente um método `toString()` que retorne uma representação em texto do círculo, incluindo o raio, a área e a circunferência.

7. Adicione um método para verificar se dois círculos são iguais, ou seja, se têm o mesmo raio.

8. Crie um método para calcular o diâmetro do círculo.

9. Implemente um método para calcular a área sombreada entre dois círculos concêntricos de diferentes raios.

10. Adicione a capacidade de criar um círculo a partir de um ponto no plano cartesiano (coordenadas x, y) e um raio.

### Exercício 03: Veículo

1. Crie uma classe abstrata chamada Veiculo com os seguintes atributos e métodos:

Atributos:
- marca (String)
- modelo (String)
- ano (int)

Métodos abstratos:
- calcularCustoViagem(int distancia): Este método deve ser abstrato e calcular o custo de uma viagem com bas e na distância fornecida.

2. Crie duas classes concretas que herdem de Veiculo: Carro e Moto. Implemente o método calcularCustoViagem(int distancia) em cada uma dessas classes:

- Carro deve ter um custo fixo de R$0.20 por quilômetro.
- Moto deve ter um custo fixo de R$0.15 por quilômetro.

### Exercício 04: Figuras geométricas

1. Crie uma classe abstrata chamada FormaGeometrica com um método abstrato calcularArea() -> Essa classe precisa ter, no minimo 2 atributos - cabem a vocês descobrirem :)

2. Crie três classes concretas que herdem de FormaGeometrica: Retangulo, Circulo, Triangulo, Quadrado e Losango. Implemente o método calcularArea() em cada uma dessas classes para calcular a área da forma específica.

3. Na classe Principal, crie uma lista de formas geométricas que inclua retângulos, círculos, triângulos, quadrados e losangos.

4. Use um loop para calcular e exibir a área de cada forma geométrica na lista, mesmo que sejam tipos diferentes, usando o polimorfismo.

### Exercício 05: Sistema de Tributação para Contas e Bens Financeiros

Nosso banco está empenhado em aplicar tributações aos bens financeiros de nossos clientes, e para alcançar esse objetivo, estamos criando um sistema que gerenciará essa tarefa. Aqui estão as etapas do exercício:

1. Criação da Interface Tributavel:
Primeiramente, crie uma interface chamada Tributavel que contenha o método calculaTributos(), responsável por calcular e retornar um valor em formato double.

2. Tributação de Diferentes Bens Financeiros:
Alguns bens são tributáveis, enquanto outros não o são. Para exemplificar:

- Conta Poupança não é tributável, portanto, seu método calculaTributos() retornará 0.
- Conta Corrente é tributável, com uma taxa de 1% sobre o saldo da conta.
Seguro de Vida tem uma tributação fixa de 42 reais.

3. Hierarquia de Classes de Contas Financeiras:
As classes ContaCorrente e ContaPoupanca herdarão de uma classe-base chamada Conta. A classe Conta conterá um saldo e os métodos sacar(double), depositar(double) e obterSaldo(), que retornarão o saldo da conta.

4. Teste do Sistema de Tributação:
Crie uma classe chamada TestaTributavel com um método main para testar o exemplo. Neste método, você pode instanciar diferentes objetos que implementam a interface Tributavel (como contas correntes e seguros de vida) e calcular seus tributos.

5. Gerenciador de Imposto de Renda:
Além disso, desenvolva uma classe GerenciadorDeImpostoDeRenda que receberá todos os objetos tributáveis de uma pessoa e somará seus valores tributários. Essa classe conterá um atributo para calcular a soma total dos tributos e um método adicionar(Tributavel) que aceita objetos tributáveis como parâmetro e adiciona seus tributos ao total.

Lembre-se de que somente objetos que implementam a interface Tributavel podem ser passados para o método adicionar, excluindo qualquer tipo de conta que não seja tributável.

Tip: Você pode reaproveitar o códigos entre os exercícios;

### Respostas:

- Todas as repostas se encontram no projeto chamado "lab02".
