qpackage HotelTransilvania;

public class Quarto {
    private int numero;
    private String tipo; // solteiro, casal, suíte
    private int capacidade;
    private double preco;
    private String status; // "Disponível", "Ocupado", "Em Manutenção"

    // Construtor
    public Quarto(int numero, String tipo, int capacidade, double preco) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.preco = preco;
        this.status = "Disponível"; // Inicialmente, o quarto está disponível
    }

    // Getters e Setters
    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public double getPreco() {
        return preco;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Método para verificar se o quarto está disponível
    public boolean isDisponivel() {
        return "Disponível".equals(this.status);
    }
}