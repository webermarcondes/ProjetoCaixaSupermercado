import java.math.BigDecimal;
import java.time.LocalDate;

public class NotaFiscal {


    private Integer inscricaoEstadual;
    private Integer chaveAcesso;
    private LocalDate dataAutorizacao;
    private LocalDate emissao;
    private LocalDate entrada;
    private LocalDate saida;
    private String dadosAdicionais;
    private Integer serie;

    private Produto produto;

    //Atributos transportador
    private String razaoSocialTransportador;
    private String tipoFrete;
    private String placaVeiculo;
    private String uf;
    private String cnpjTransportador;
    private String inscricaoEstadualTransp;
    private String endereco;
    private String municipio;
    private BigDecimal pesoBruto;

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(Integer inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public Integer getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(Integer chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    public LocalDate getDataAutorizacao() {
        return dataAutorizacao;
    }

    public void setDataAutorizacao(LocalDate dataAutorizacao) {
        this.dataAutorizacao = dataAutorizacao;
    }

    public LocalDate getEmissao() {
        return emissao;
    }

    public void setEmissao(LocalDate emissao) {
        this.emissao = emissao;
    }

    public LocalDate getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }

    public LocalDate getSaida() {
        return saida;
    }

    public void setSaida(LocalDate saida) {
        this.saida = saida;
    }

    public String getDadosAdicionais() {
        return dadosAdicionais;
    }

    public void setDadosAdicionais(String dadosAdicionais) {
        this.dadosAdicionais = dadosAdicionais;
    }

    public String getRazaoSocialTransportador() {
        return razaoSocialTransportador;
    }

    public void setRazaoSocialTransportador(String razaoSocialTransportador) {
        this.razaoSocialTransportador = razaoSocialTransportador;
    }

    public String getTipoFrete() {
        return tipoFrete;
    }

    public void setTipoFrete(String tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCnpjTransportador() {
        return cnpjTransportador;
    }

    public void setCnpjTransportador(String cnpjTransportador) {
        this.cnpjTransportador = cnpjTransportador;
    }

    public String getInscricaoEstadualTransp() {
        return inscricaoEstadualTransp;
    }

    public void setInscricaoEstadualTransp(String inscricaoEstadualTransp) {
        this.inscricaoEstadualTransp = inscricaoEstadualTransp;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public BigDecimal getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(BigDecimal pesoBruto) {
        this.pesoBruto = pesoBruto;
    }
}
