package HotelTransilvania;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Quarto> quartos;
    private List<Hospede> hospedes;
    private List<Reserva> reservas;

    public Hotel() {
        this.quartos = new ArrayList<>();
        this.hospedes = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    // Gerenciamento de Quartos
    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
        System.out.println("Quarto adicionado com sucesso.");
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void listarQuartosDisponiveis() {
        System.out.println("===== Quartos Disponíveis =====");
        for (Quarto quarto : quartos) {
            if (quarto.isDisponivel()) {
                System.out.println(quarto);
            }
        }
    }

    // Gerenciamento de Hóspedes
    public void adicionarHospede(Hospede hospede) {
        hospedes.add(hospede);
        System.out.println("Hóspede adicionado com sucesso.");
    }

    public List<Hospede> getHospedes() {
        return hospedes;
    }

    // Gerenciamento de Reservas
    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
        System.out.println("Reserva realizada com sucesso.");
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}
