public class ContaBancaria {
    private String titular;
    private float saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String titular, float s) {
        this.titular = titular;
        this.saldo = s;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        if (valor == 0) {
            System.out.println("Valor de depósito inválido.");
        } else if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        }
    }

    public void sacar(double valor) {
        if (valor == 0 || valor > this.saldo) {
            System.out.println("Saque não permitido. Valor inválido ou saldo insuficiente.");
        } else if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + this.titular + " | Saldo Atual: R$ " + this.saldo);
    }
}