public class Circunferencia extends Forma {
    private float raio;

    public Circunferencia(float r) {
        this.raio = r;
    }

    public void setCircunferencia(float r) {
        this.raio = r;
    }

    public float getCircunferencia() {
        return this.raio;
    }

    @Override
    public float area() {
        return (float) (Math.PI * (this.raio * this.raio)); 
    }

    @Override
    public float perimetro() {
        return (float) (2 * Math.PI * this.raio);
    }

    @Override
    public void mostra() {
        System.out.println("--- Dados da Circunferência ---");
        System.out.println("Raio: " + this.raio);
        System.out.println("Área: " + this.area());
        System.out.println("Perímetro: " + this.perimetro());
    }
}