import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro de Circunferência ===");
        System.out.print("Digite o valor do raio: ");
        float raio = scanner.nextFloat();
        Circunferencia circ = new Circunferencia(raio);

        System.out.println("\n=== Cadastro de Retângulo ===");
        System.out.print("Digite o valor da base: ");
        float base = scanner.nextFloat();
        System.out.print("Digite o valor da altura: ");
        float altura = scanner.nextFloat();
        Retangulo ret = new Retangulo(base, altura);

        System.out.println("\n===========================");
        System.out.println("   RESULTADOS DOS OBJETOS  ");
        System.out.println("===========================\n");

        circ.mostra();
        System.out.println(); 
        ret.mostra();

        scanner.close();
    }
}