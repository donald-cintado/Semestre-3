public class Main {
    public static void main(String[] args) {
        ContaBancaria contaKaique = new ContaBancaria("Kaique", 1000.0f);

        System.out.println("--- STATUS INICIAL ---");
        contaKaique.exibirSaldo();

        System.out.println("\n--- TESTANDO DEPÓSITO ---");
        contaKaique.depositar(250.50f);
        contaKaique.exibirSaldo();
        
        contaKaique.depositar(0f); 

        System.out.println("\n--- TESTANDO SAQUE ---");
        contaKaique.sacar(150.00);
        contaKaique.exibirSaldo();

        contaKaique.sacar(2000.00);
    }
}