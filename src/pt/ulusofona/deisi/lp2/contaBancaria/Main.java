package pt.ulusofona.deisi.lp2.contaBancaria;

public class Main {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(100);
        conta.deposita(50);
        conta.levanta(70);
        System.out.println(conta.getSaldoComoString());
    }
}