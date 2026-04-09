public class Recursividade3 {
    public static int contarDigitos(int numero) {
        // Lida com números negativos e a condição de parada (apenas 1 dígito restante)
        if (Math.abs(numero) < 10) {
            return 1;
        }
        return 1 + contarDigitos(numero / 10); // Remove o último dígito e chama recursivamente
    }

    public static void main(String[] args) {
        // Exemplo de entrada: 12345 [cite: 19]
        // Saída esperada: 5 [cite: 20]
        System.out.println("Quantidade de dígitos: " + contarDigitos(12345)); 
    }
}