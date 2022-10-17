public class PessoaJuridica extends Pessoa {

    private String razaoSocial;
    private String cnpj;

    public PessoaJuridica(String nome, String telefone, String email, Endereco endereco ,String razaoSocial, String cnpj) {
        super(nome, telefone, email, endereco);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getDocumentoPrincipal() {
        return cnpj;
    }
}
