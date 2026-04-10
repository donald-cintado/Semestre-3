package Exercicio3;

public class MovimentacaoBancaria {
    private String titular;
    private double saldo;
    private String extrato;

    public MovimentacaoBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.extrato = "--- Início do Extrato ---\n";
        
        if (saldoInicial > 0) {
            this.extrato += "Saldo Inicial: " + formatarValor(saldoInicial) + "\n";
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            this.extrato += "Depósito efetuado: + " + formatarValor(valor) + "\n";
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            this.extrato += "Saque efetuado: - " + formatarValor(valor) + "\n";
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo Atual de " + this.titular + ": " + formatarValor(this.saldo));
    }

    public void exibirExtrato() {
        System.out.println("\nExtrato da conta de " + this.titular + ":");
        System.out.println(this.extrato);
        System.out.println("Saldo Final: " + formatarValor(this.saldo));
        System.out.println("-------------------------");
    }

    public static String formatarValor(double valor) {
        return String.format("R$ %.2f", valor);
    }
}