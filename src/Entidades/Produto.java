package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private Integer idProduto;
    private String descricao;
    private Integer codigoBarras;
    private Double valor;
    private String tipoProduto;
    private String marcaProduto;
    private Integer cfop;
    private Integer cst;
    private Integer ncm;
    private Integer icms;
    private Integer quantidade;

    private Categoria categoria;

    private Desconto desconto;

    public Produto (){

    }

    public Produto(Integer idProduto, String descricao, Integer quantidade, Double valor){
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    @Override
    public String toString(){
        return idProduto + " - " +descricao +"       "+ quantidade+"UN X " + valor + "      Vl.Total. R$" /*+ subTotal()*/;
    }

    public Double getValor() {
        return valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public Integer getCst() {
        return cst;
    }

    public void setCst(Integer cst) {
        this.cst = cst;
    }

    public Integer getNcm() {
        return ncm;
    }

    public void setNcm(Integer ncm) {
        this.ncm = ncm;
    }

    public Integer getIcms() {
        return icms;
    }

    public void setIcms(Integer icms) {
        this.icms = icms;
    }

    public Integer getUnidade() {
        return quantidade;
    }

    public void setUnidade(Integer unidade) {
        this.quantidade = unidade;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(Integer codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    public Categoria getCategoria() {return categoria;}

    public void setCategoria(Categoria categoria) {this.categoria = categoria;}

    public Desconto getDesconto() {return desconto;}

    public void setDesconto(Desconto desconto) {this.desconto = desconto;}
}
