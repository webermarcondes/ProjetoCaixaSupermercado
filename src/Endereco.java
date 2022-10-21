public class Endereco {

    private String cep;
    private String complemento;
    private String bairro;
    private String cidade;

    private String municipio;

    private String uf;
    private Integer numero;

    public Endereco(String cep, String complemento, String bairro, String cidade, String municipio, String uf ,Integer numero) {
        this.cep = cep;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.municipio = municipio;
        this.uf = uf;
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }


    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", numero=" + numero +
                '}';
    }
}
