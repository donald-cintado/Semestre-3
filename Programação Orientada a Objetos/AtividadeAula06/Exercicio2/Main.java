package Exercicio2;

public class Main {
    public static void main(String[] args) {
        CarroAluguel carro = new CarroAluguel("Chevrolet Onix", "XYZ-9876", true);

        System.out.println("--- STATUS INICIAL ---");
        carro.exibirStatus();

        System.out.println("\n--- TESTANDO ALUGUEL ---");
        carro.alugarCarro();
        
        System.out.println("\n--- TENTANDO ALUGAR O MESMO CARRO NOVAMENTE ---");
        carro.alugarCarro();

        System.out.println("\n--- TESTANDO DEVOLUÇÃO ---");
        carro.devolverCarro();

        System.out.println("\n--- TENTANDO DEVOLVER O CARRO JÁ DEVOLVIDO ---");
        carro.devolverCarro();

        System.out.println("\n--- TESTANDO VERIFICAR DISPONIBILIDADE ---");
        boolean taDisponivel = carro.verificarDisponibilidade(carro);
        System.out.println("Retorno do método verificarDisponibilidade: " + taDisponivel);
    }
}