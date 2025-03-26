package AULA25032005;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        }else {
            System.out.println("Saldo inicial invalido!");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de r$ " + valor+" realizado com sucesso!");
        }else {
            System.out.println("Deposito invalido");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de r$ " + valor+" realizado com sucesso!");
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void eixibirDados() {
        System.out.println("Titular: " + titular + ", Saldo: " + saldo);
    }
}
