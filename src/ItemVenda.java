import java.math.BigDecimal;

public class ItemVenda {

    private Produto produto;
    private Double valor;
    private Double qtde;


    public ItemVenda(Produto produto, Double valor, Double qtde) {
        this.produto = produto;
        this.valor = valor;
        this.qtde = qtde;
    }


    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getQtde() {
        return qtde;
    }

    public void setQtde(Double qtde) {
        this.qtde = qtde;
    }
}
