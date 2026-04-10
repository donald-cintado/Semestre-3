package Exercicio2;

public class CarroAluguel {
    private String modelo;
    private String placa;
    private boolean disponivel;

    public CarroAluguel(String m, String p, boolean d) {
        this.modelo = m;
        this.placa = p;
        this.disponivel = d;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setPlaca(String p) {
        this.placa = p;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setDisponivel(boolean d) {
        this.disponivel = d;
    }

    public boolean getDisponivel() {
        return this.disponivel;
    }


    public void alugarCarro() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("Carro alugado: " + this.modelo + " - Placa: " + this.placa);
        } else {
            System.out.println("Carro indisponível: " + this.modelo + " - Placa: " + this.placa);
        }
    }

    public void devolverCarro() {
        if (!this.disponivel) {
            this.disponivel = true; 
            System.out.println("Carro devolvido: " + this.modelo + " - Placa: " + this.placa);
        } else {
            System.out.println("O carro " + this.modelo + " - Placa: " + this.placa + " já estava disponível.");
        }
    }

    public void exibirStatus() {
        String statusTexto = this.disponivel ? "Disponível" : "Alugado/Indisponível";
        System.out.println("Modelo: " + this.modelo + " | Placa: " + this.placa + " | Status: " + statusTexto);
    }

    public boolean verificarDisponibilidade(CarroAluguel carro) {
        return carro.getDisponivel();
    }
}