package HotelTransilvania;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaHotel {
    private List<Quarto> listaDeQuartos;
    private List<Hospede> listaDeHospedes;

    public SistemaHotel() {
        listaDeQuartos = new ArrayList<>();
        listaDeHospedes = new ArrayList<>();
    }

    public void cadastrarQuarto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número do quarto: ");
        int numero = scanner.nextInt();
        System.out.print("Tipo do quarto (solteiro, casal, suíte): ");
        String tipo = scanner.next();
        System.out.print("Capacidade do quarto: ");
        int capacidade = scanner.nextInt();
        System.out.print("Preço da diária: ");
        double preco = scanner.nextDouble();

        Quarto quarto = new Quarto(numero, tipo, capacidade, preco);
        listaDeQuartos.add(quarto);
        System.out.println("Quarto cadastrado com sucesso.");
    }

    public void cadastrarHospede() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do hóspede: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Data de Nascimento: ");
        String dataNascimento = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Número de contato: ");
        String numeroContato = scanner.nextLine();

        Hospede hospede = new Hospede(nome, cpf, dataNascimento, endereco, numeroContato);
        listaDeHospedes.add(hospede);
        System.out.println("Hóspede adicionado com sucesso.");
    }

    public void criarReserva() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("CPF do hóspede: ");
        String cpf = scanner.nextLine();
        Hospede hospedeEncontrado = null;
        for (Hospede h : listaDeHospedes) {
            if (h.getCpf().equals(cpf)) {
                hospedeEncontrado = h;
                break;
            }
        }
        if (hospedeEncontrado == null) {
            System.out.println("Hóspede não encontrado.");
            return;
        }

        System.out.println("===== Quartos Disponíveis =====");
        for (Quarto quarto : listaDeQuartos) {
            if (quarto.isDisponivel()) {
                System.out.println("Quarto " + quarto.getNumero() + " (" + quarto.getTipo() + "), Capacidade: " + quarto.getCapacidade() + ", Preço: R$ " + quarto.getPreco());
            }
        }

        System.out.print("Número do quarto para reserva: ");
        int numeroQuarto = scanner.nextInt();
        System.out.print("Data de entrada (dd/mm/aaaa): ");
        String dataEntrada = scanner.next();
        System.out.print("Data de saída (dd/mm/aaaa): ");
        String dataSaida = scanner.next();

        Quarto quartoReservado = null;
        for (Quarto quarto : listaDeQuartos) {
            if (quarto.getNumero() == numeroQuarto && quarto.isDisponivel()) {
                quartoReservado = quarto;
                break;
            }
        }

        if (quartoReservado == null) {
            System.out.println("Quarto não disponível para reserva.");
            return;
        }

        Reserva reserva = new Reserva(hospedeEncontrado, quartoReservado, dataEntrada, dataSaida);
        quartoReservado.setStatus("Ocupado"); // Muda o status do quarto
        System.out.println("Reserva realizada com sucesso.");
    }

    public void realizarCheckIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número do quarto: ");
        int numeroQuarto = scanner.nextInt();

        Quarto quartoReservado = null;
        for (Quarto quarto : listaDeQuartos) {
            if (quarto.getNumero() == numeroQuarto && !quarto.isDisponivel()) {
                quartoReservado = quarto;
                break;
            }
        }

        if (quartoReservado == null) {
            System.out.println("Quarto não disponível para check-in.");
            return;
        }

        System.out.println("Check-in realizado com sucesso.");
    }

    public void realizarCheckOut() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número do quarto para check-out: ");
        int numeroQuarto = scanner.nextInt();

        Quarto quartoReservado = null;
        for (Quarto quarto : listaDeQuartos) {
            if (quarto.getNumero() == numeroQuarto && !quarto.isDisponivel()) {
                quartoReservado = quarto;
                break;
            }
        }

        if (quartoReservado == null) {
            System.out.println("Quarto não disponível para check-out.");
            return;
        }

        quartoReservado.setStatus("Disponível"); // Atualiza o status do quarto
        System.out.println("Check-out realizado com sucesso.");
    }

    public void listarQuartosDisponiveis() {
        System.out.println("===== Quartos Disponíveis =====");
        for (Quarto quarto : listaDeQuartos) {
            if (quarto.isDisponivel()) {
                System.out.println("Quarto " + quarto.getNumero() + " (" + quarto.getTipo() + "), Capacidade: " + quarto.getCapacidade() + ", Preço: R$ " + quarto.getPreco());
            }
        }
    }
    public static void main(String[] args) {
        SistemaHotel sistema = new SistemaHotel();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===== Sistema de Gerenciamento de Hotel =====");
            System.out.println("1. Cadastrar Quarto");
            System.out.println("2. Cadastrar Hóspede");
            System.out.println("3. Criar Reserva");
            System.out.println("4. Realizar Check-in");
            System.out.println("5. Realizar Check-out");
            System.out.println("6. Listar Quartos Disponíveis");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    sistema.cadastrarQuarto();
                    break;
                case 2:
                    sistema.cadastrarHospede();
                    break;
                case 3:
                    sistema.criarReserva();
                    break;
                case 4:
                    sistema.realizarCheckIn();
                    break;
                case 5:
                    sistema.realizarCheckOut();
                    break;
                case 6:
                    sistema.listarQuartosDisponiveis();
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 7);
    }
}

