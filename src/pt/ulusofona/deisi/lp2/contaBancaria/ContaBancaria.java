package pt.ulusofona.deisi.lp2.contaBancaria;

public class ContaBancaria {
    int saldo;

    public ContaBancaria(int saldo) {
        this.saldo = saldo;
    }

    void deposita(int valor) {
        saldo += valor;
    }

    boolean levanta(int valor) {
        if (saldo - valor < 0 || valor > saldo) {
            return false;
        } else {
            saldo -= valor;
            return true;
        }
    }

    String getSaldoComoString(){
        return " " + saldo;
    }
}
