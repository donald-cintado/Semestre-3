package Exercicio3;

public class Main {
    public static void main(String[] args) { 
        MovimentacaoBancaria contaEmpresa = new MovimentacaoBancaria("Loja 90+", 1000.00);

        contaEmpresa.depositar(350.00);
        contaEmpresa.sacar(150.00);
        contaEmpresa.sacar(2000.00);

        contaEmpresa.exibirExtrato();
    }
}