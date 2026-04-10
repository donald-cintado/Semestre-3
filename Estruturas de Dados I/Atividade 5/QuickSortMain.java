import java.util.Scanner;
import java.util.Arrays;

public class QuickSortMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos números deseja inserir no vetor? ");
        int n = scanner.nextInt();
        int[] vetor = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }
        
        System.out.println("Vetor original: " + Arrays.toString(vetor));
        
        quickSort(vetor, 0, vetor.length - 1);
        
        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
        
        scanner.close();
    }

    public static void quickSort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particionar(arr, inicio, fim);
            quickSort(arr, inicio, indicePivo - 1);
            quickSort(arr, indicePivo + 1, fim);
        }
    }

    private static int particionar(int[] arr, int inicio, int fim) {
        int pivo = arr[fim];
        int i = (inicio - 1);
        
        for (int j = inicio; j < fim; j++) {
            if (arr[j] <= pivo) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[fim];
        arr[fim] = temp;
        
        return i + 1;
    }
}