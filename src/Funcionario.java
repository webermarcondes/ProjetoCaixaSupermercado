import java.time.LocalDate;

public class Funcionario extends PessoaFisica{

    private Integer idFuncionario;

    private LocalDate dataAdmissao;
    private String numeroNis;

    public Funcionario(String nome, String telefone, String email, Endereco endereco, String cpf, LocalDate dataNascimento,
                       Integer idFuncionario ,LocalDate dataAdmissao, String numeroNis) {
        super(nome, telefone, email, endereco, cpf, dataNascimento);
        this.idFuncionario = idFuncionario;
        this.dataAdmissao = dataAdmissao;
        this.numeroNis = numeroNis;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }


    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getNumeroNis() {
        return numeroNis;
    }

    public void setNumeroNis(String numeroNis) {
        this.numeroNis = numeroNis;
    }
}
