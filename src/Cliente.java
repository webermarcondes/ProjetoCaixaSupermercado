public class Cliente {

    private Pessoa pessoa;

    //Atributos fiscais:
    private String finalidade;
    private String consumidorFinal;
    private String contribuinteIcms;


    public Cliente(Pessoa pessoa, String finalidade, String consumidorFinal, String contribuinteIcms) {
        this.pessoa = pessoa;
        this.finalidade = finalidade;
        this.consumidorFinal = consumidorFinal;
        this.contribuinteIcms = contribuinteIcms;

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



    public String getDocumentoPrincipalCliente() {
        return pessoa.getDocumentoPrincipal();
    }

    public Endereco getEnderecoCliente() {
        return pessoa.getEndereco();
    }
}
