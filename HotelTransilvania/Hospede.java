package HotelTransilvania;

public class Hospede {
    private String nome;
    private String cpf; // Atributo CPF
    private String dataNascimento;
    private String endereco;
    private String contato;

    // Construtor
    public Hospede(String nome, String cpf, String dataNascimento, String endereco, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.contato = contato;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf; // Método getter para CPF
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getContato() {
        return contato;
    }
}
