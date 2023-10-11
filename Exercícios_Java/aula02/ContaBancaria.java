package JavaCaldeira.Exercícios_Java.aula02;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.time.LocalDateTime;
import java.text.DecimalFormat;


// 1 - Criar metódos: Saque, deposito, pix, transferencia,
// verificarSaldo, verificarHorario, verificarInformacoes
public class ContaBancaria {

    DecimalFormat formatador = new DecimalFormat("#.##");
    Random random = new Random();
    LocalDateTime horarioAtual = LocalDateTime.now();
    DateTimeFormatter formatoHorario = DateTimeFormatter.ofPattern("H");


    private String nome;
    private String cpf;

    // Sortea um número aleátorio para a conta
    private int indentificadorConta = random.nextInt(100);

    private String banco = "PicPay";

    private String endereco;

    private float saldo = 0;
    // Pega a hora atual para ver se está no funcionamento do banco
    private int horario = Integer.parseInt(horarioAtual.format(formatoHorario));

    public ContaBancaria(String nome, String cpf, String  endereco){

        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;

    }

    public void saque(double valor){

        if(valor >= this.saldo){
            System.out.println("Não foi possível realizar a ação, sua conta está sem dinheiro suficiente!");
        } else {
            this.saldo -= valor;
        }


    }

    public void deposito (double valor){

        this.saldo += valor;


    }

    public void pix (ContaBancaria destino, double valor){

        if(valor >= this.saldo) {
            System.out.println("Não foi possível realizar a ação, sua conta está sem dinheiro suficiente!");
        } else {

            this.saldo -= valor;
            destino.saldo += valor;

        }

    }

    public void transferencia (ContaBancaria destino, double valor){

        if(horario < 8 || horario > 19){
            System.out.println("Não foi realizar a ação, estamos fora do horário de funcionamento");
        }
        else if (valor >= this.saldo) {
            System.out.println("Não foi possível realizar a ação, sua conta está sem dinheiro suficiente!");

        } else {
            this.saldo -= valor;
            pix(destino, valor);

        }

    }

    public String verificaSaldo(){

        return formatador.format(this.saldo);


    }


    public int verificaHorario() {
        return this.horario;

    }

    public void verificaInformacoes() {

        System.out.println(String.format("Nome: %s", nome));
        System.out.println(String.format("CPF: %s", cpf));
        System.out.println(String.format("Número da conta: %s", indentificadorConta));
        System.out.println(String.format("Banco: %s", banco));
        System.out.println(String.format("Endereço: %s", endereco));
        System.out.println(String.format("Saldo: %s", formatador.format(saldo)));
        System.out.println(String.format("Horário Atual: %d Horas", horario));
    }

}
