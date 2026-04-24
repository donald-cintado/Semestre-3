public class Retangulo extends Triangulo {

    public Retangulo(float b, float a) {
        super(b, a);
    }

    @Override
    public float area() {
        return getBase() * getAltura();
    }

    @Override
    public float perimetro() {
        return (getBase() + getAltura()) * 2;
    }

    @Override
    public void mostra() {
        System.out.println("--- Dados do Retângulo ---");
        System.out.println("Base: " + getBase());
        System.out.println("Altura: " + getAltura());
        System.out.println("Área: " + this.area());
        System.out.println("Perímetro: " + this.perimetro());
    }
}