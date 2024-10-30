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