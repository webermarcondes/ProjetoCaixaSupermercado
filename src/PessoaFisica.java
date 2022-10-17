import java.time.LocalDate;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private LocalDate dataNascimento;

    public PessoaFisica(String nome, String telefone, String email, Endereco endereco, String cpf, LocalDate dataNascimento) {
        super(nome, telefone, email, endereco);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String getDocumentoPrincipal() {
        return cpf;
    }
}
