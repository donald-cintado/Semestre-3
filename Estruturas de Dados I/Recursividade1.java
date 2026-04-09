public class Recursividade1 {
    public static void imprimirAteZero(int n) {
        if (n < 0) {
            return; // Condição de parada
        }
        System.out.print(n + " ");
        imprimirAteZero(n - 1); // Chamada recursiva
    }

    public static void main(String[] args) {
        // Exemplo de entrada: 5 [cite: 11]
        // Saída esperada: 5 4 3 2 1 0 [cite: 12]
        imprimirAteZero(5); 
    }
}