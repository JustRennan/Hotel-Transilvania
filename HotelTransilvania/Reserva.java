package HotelTransilvania;

public class Reserva {
    private Hospede hospede;
    private Quarto quarto;
    private String dataEntrada;
    private String dataSaida;

    // Construtor que recebe os parâmetros mencionados
    public Reserva(Hospede hospede, Quarto quarto, String dataEntrada, String dataSaida) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    // Métodos getters
    public Hospede getHospede() {
        return hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }


    // Método para exibir os detalhes da reserva
    public void exibirReserva() {
        System.out.println("Hóspede: " + hospede.getNome());
        System.out.println("Quarto: " + quarto.getNumero());
        System.out.println("Data de Entrada: " + dataEntrada);
        System.out.println("Data de Saída: " + dataSaida);
    }
}