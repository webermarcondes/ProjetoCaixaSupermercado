public class Pessoa {

    private String nome;
    private String telefone;
    private String email;

    private Endereco endereco;

    //private String tipo;


    public Pessoa(String nome, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        //this.tipo = tipo;

    }


    public Pessoa() {}


    //Atributos fiscais:
//    private String finalidade;
//    private String consumidorFinal;
//    private String contribuinteIcms;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getDocumentoPrincipal() {
        return "";
    }

//    public String getTipo() {
//        return tipo;
//    }

//    public String getFinalidade() {
//        return finalidade;
//    }
//
//    public void setFinalidade(String finalidade) {
//        this.finalidade = finalidade;
//    }
//
//    public String getConsumidorFinal() {
//        return consumidorFinal;
//    }
//
//    public void setConsumidorFinal(String consumidorFinal) {
//        this.consumidorFinal = consumidorFinal;
//    }
//
//    public String getContribuinteIcms() {
//        return contribuinteIcms;
//    }
//
//    public void setContribuinteIcms(String contribuinteIcms) {
//        this.contribuinteIcms = contribuinteIcms;
//    }
}
