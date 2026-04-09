public class Recursividade2 {
    public static int somarVetor(int[] v, int indice) {
        if (indice == v.length) {
            return 0; // Condição de parada: chegou ao final do vetor
        }
        return v[indice] + somarVetor(v, indice + 1); // Chamada recursiva
    }

    public static void main(String[] args) {
        int[] v = {1, 2, 3, 4, 5}; // Exemplo do material 
        System.out.println("Soma: " + somarVetor(v, 0)); // Saída: 15
    }
}