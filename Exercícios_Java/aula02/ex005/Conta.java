package JavaCaldeira.Exercícios_Java.aula02.ex005;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.time.LocalDateTime;
import java.text.DecimalFormat;



public abstract class Conta implements Tributavel{

    DecimalFormat formatador = new DecimalFormat("#.##");



    protected float saldo = 0;
    // Pega a hora atual para ver se está no funcionamento do banco


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



    public double obterSaldo(){
        return saldo ;


    }



}
