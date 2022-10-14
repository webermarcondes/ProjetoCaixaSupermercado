public class Pessoa {

    private String nome;
    private String telefone;
    private String email;

    //Atributos fiscais:
    private String finalidade;
    private String consumidorFinal;
    private String contribuinteIcms;

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

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    public String getConsumidorFinal() {
        return consumidorFinal;
    }

    public void setConsumidorFinal(String consumidorFinal) {
        this.consumidorFinal = consumidorFinal;
    }

    public String getContribuinteIcms() {
        return contribuinteIcms;
    }

    public void setContribuinteIcms(String contribuinteIcms) {
        this.contribuinteIcms = contribuinteIcms;
    }
}
