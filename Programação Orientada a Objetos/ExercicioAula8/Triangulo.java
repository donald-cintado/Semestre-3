public class Triangulo extends Forma {
    private float base;
    private float altura;

    public Triangulo(float b, float h) {
        this.base = b;
        this.altura = h;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float area() {
        return (this.base * this.altura) / 2;
    }

    @Override
    public float perimetro() {
        return 0;
    }

    @Override
    public void mostra() {
        System.out.println("--- Dados do Triângulo ---");
        System.out.println("Base: " + this.base);
        System.out.println("Altura: " + this.altura);
        System.out.println("Área: " + this.area());
    }
}
