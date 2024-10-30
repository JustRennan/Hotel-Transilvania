package HotelTransilvania;

public class Funcionario implements Gerenciamento {
    private String nome;
    private String cpf;
    private String cargo;
    private double salario;
    private String turno;

    public Funcionario(String nome, String cpf, String cargo, double salario, String turno) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
        this.turno = turno;
    }

    @Override
    public void cadastrar() {
        System.out.println("Funcionário " + nome + " cadastrado com sucesso.");
    }

    @Override
    public void editar() {
        System.out.println("Informações do funcionário " + nome + " editadas com sucesso.");
    }

    @Override
    public void remover() {
        System.out.println("Funcionário " + nome + " removido com sucesso.");
    }

    public double calcularSalario(int horasTrabalhadas) {
        return horasTrabalhadas * (salario / 160);  // Assumindo 160 horas por mês
    }
}

