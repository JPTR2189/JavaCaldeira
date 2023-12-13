package com.github.javacaldeiraonline.contabancaria;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {

    /**
     * Crie uma classe ContaBancaria com os atributos:
     * nome (nome do titular da conta)
     * cpf (número de CPF do titular)
     * identificadorConta (número de identificação da conta)
     * banco (nome do banco)
     * endereco (endereço do titular)
     * saldo (saldo disponível na conta)
     * horarioAtual (um atributo para armazenar o horário atual)
     */
    private String nome;
    private String cpf;
    private String identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    private LocalDateTime horarioAtual;
    private List<String> historicoTransacoes;
    private boolean contaAtiva;
    private double taxaManutencaoMensal;

    /**
     * Crie um construtor para a classe que permita inicializar os atributos iniciais da conta bancária.
     */
    public ContaBancaria(String nome, String cpf, String identificadorConta, String banco, String endereco) {
        this.nome = nome;
        this.cpf = validarCPF(cpf) ? cpf : null;
        this.identificadorConta = identificadorConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = 0.0;
        this.horarioAtual = LocalDateTime.now();
        this.historicoTransacoes = new ArrayList<>();
        this.contaAtiva = true;
        this.taxaManutencaoMensal = 10.0;
    }

    /**
     * saque(double valor): Realiza um saque da conta, desde que o saldo seja suficiente.
     * Caso contrário, exibe uma mensagem de erro.
     */
    public void saque(double valor) {
        if (contaEstaAtiva()) {
            if (valor > 0 && saldo >= valor) {
                saldo -= valor;
                registrarTransacao("Saque de R$" + valor);
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Erro: Saldo insuficiente para o saque.");
            }
        }
    }

    /**
     * deposito(double valor): Realiza um depósito na conta, atualizando o saldo.
     */
    public void deposito(double valor) {
        if (contaEstaAtiva()) {
            if (valor > 0) {
                saldo += valor;
                registrarTransacao("Depósito de R$" + valor);
                System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Erro: Valor de depósito inválido.");
            }
        }
    }

    /**
     * pix(double valor): Realiza uma transferência PIX
     */
    public void pix(double valor) {
        if (contaEstaAtiva()) {
            saldo -= valor;
            registrarTransacao("Transferência PIX de R$" + valor);
            System.out.println("Transferência PIX de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Erro: Saldo insuficiente, horário inválido ou valor de transferência inválido.");
        }
    }

    /**
     * transferencia(ContaBancaria destino, double valor): Realiza uma transferência para outra conta bancária,
     * verificando se o horário atual está dentro do intervalo permitido (8hrs às 19hrs) e se o saldo é suficiente.
     * Caso contrário, exibe uma mensagem de erro.
     * (Tem hadouken de if para poder exibir mensagens de erro diferentes.
     */
    public void transferencia(ContaBancaria destino, double valor) {
        if (contaEstaAtiva()) {
            if (LocalDateTime.now().getHour() >= 8 && LocalDateTime.now().getHour() <= 18) {
                if (valor <= saldo) {
                    saldo -= valor;
                    destino.deposito(valor);
                    registrarTransacao("Transferência de R$" + valor + " para a conta de " + destino.getNome());
                    System.out.println("Transferência de R$" + valor + " realizada para a conta de " + destino.getNome() + ".");
                } else {
                    System.out.println("Erro: Saldo insuficiente.");
                }
            } else {
                System.out.println("Erro: Nesse horário não pode realizar transferência.");
            }
        }
    }

    /**
     * verificarSaldo(): Exibe o saldo atual da conta.
     */
    public void verificarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    /**
     * verificarHorario(): Exibe o horário atual.
     */
    public void verificarHorario() {
        System.out.println("Horário atual: " + LocalDateTime.now().getHour() + " : " + LocalDateTime.now().getMinute());
    }

    /**
     * verificarInformacoes(): Exibe todas as informações da conta bancária, como nome, CPF, saldo, etc.
     */
    public void verificarInformacoes() {
        System.out.println("Nome do titular: " + nome);
        System.out.println("CPF do titular: " + cpf);
        System.out.println("Número de identificação da conta: " + identificadorConta);
        System.out.println("Banco: " + banco);
        System.out.println("Endereço do titular: " + endereco);
        verificarSaldo();
        verificarHorario();
    }

    /**
     * Implemente um método alterarEndereco(String novoEndereco) para atualizar o endereço do titular da conta.
     */
    public void alterarEndereco(String novoEndereco) {
        if (contaAtiva) {
            this.endereco = novoEndereco;
            System.out.println("Endereço atualizado com sucesso.");
        } else {
            System.out.println("Erro: A conta está encerrada e não é possível atualizar o endereço.");
        }
    }

    /**
     * Crie um método calcularJuros(double taxa) que calcule juros sobre o saldo da conta e os adicione mensalmente.
     */

    public void calcularJuros(double taxa) {
        if (contaAtiva) {
            double juros = saldo * taxa / 100;
            saldo += juros;
            registrarTransacao("Juros calculados: R$" + juros);
            System.out.println("Juros calculados e adicionados ao saldo.");
        } else {
            System.out.println("Erro: A conta está encerrada e não é possível calcular juros.");
        }
    }

    /**
     * Adicione uma taxa de manutenção mensal à conta bancária, que seja deduzida automaticamente do saldo no
     * primeiro dia de cada mês.
     */
    public void deduzirTaxaManutencaoMensal() {
        if (contaAtiva && LocalDateTime.now().getDayOfMonth() == 1) {
            if (saldo >= taxaManutencaoMensal) {
                saldo -= taxaManutencaoMensal;
                registrarTransacao("Taxa de manutenção mensal deduzida: R$" + taxaManutencaoMensal);
                System.out.println("Taxa de manutenção mensal deduzida: R$" + taxaManutencaoMensal);
            } else {
                saldo = 0.0;
                contaAtiva = false;
                registrarTransacao("Conta encerrada devido à falta de saldo para a taxa de manutenção mensal.");
                System.out.println("Conta encerrada devido à falta de saldo para a taxa de manutenção mensal.");
            }
        }
    }

    /**
     * Implemente um método fecharConta() que encerre a conta, zerando o saldo e não permitindo mais operações.
     */
    public void encerrarConta() {
        if (contaAtiva) {
            saldo = 0.0;
            contaAtiva = false;
            registrarTransacao("Conta encerrada.");
            System.out.println("Conta encerrada com sucesso.");
        } else {
            System.out.println("Erro: A conta já está encerrada.");
        }
    }

    /**
     * Adicione um histórico de transações na conta bancária, registrando todas as operações de saque, depósito,
     * PIX e transferência. Crie um método para exibir o histórico de transações.]
     */
    public void registrarTransacao(String transacao) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dataHora = String.valueOf(LocalDateTime.now());
        historicoTransacoes.add(dataHora + " - " + transacao);
    }

    public void exibirHistoricoTransacoes() {
        if (historicoTransacoes.isEmpty()) {
            System.out.println("Não há transações registradas.");
        } else {
            System.out.println("Histórico de Transações:");
            for (String transacao : historicoTransacoes) {
                System.out.println(transacao);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    //Desta vez o chatgpt acertou ooooo mizeravi ;)
    public boolean validarCPF(String cpf) {
        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifica se o CPF possui 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Integer.parseInt(String.valueOf(cpf.charAt(i))) * (10 - i);
        }
        int resto = 11 - (soma % 11);
        int digito1 = (resto == 10 || resto == 11) ? 0 : resto;

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Integer.parseInt(String.valueOf(cpf.charAt(i))) * (11 - i);
        }
        resto = 11 - (soma % 11);
        int digito2 = (resto == 10 || resto == 11) ? 0 : resto;

        // Verifica se os dígitos verificadores são iguais aos dígitos do CPF
        return digito1 == Integer.parseInt(String.valueOf(cpf.charAt(9))) && digito2 == Integer.parseInt(String.valueOf(cpf.charAt(10)));
    }

    private boolean contaEstaAtiva() {
        if (!contaAtiva) {
            System.out.println("Erro: A conta está encerrada e não é possível realizar operações.");
            return false;
        }
        return true;
    }

}