import java.math.BigDecimal;
import java.util.List;

public class ItemVenda {

    private List<Produto> produto;
    private Double valor;
    private Double qtde;

    public ItemVenda(List<Produto> produto) {
        this.produto = produto;
    }

    public ItemVenda(List<Produto> produto, Double valor, Double qtde) {
        this.produto = produto;
        this.valor = valor;
        this.qtde = qtde;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
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

    @Override
    public String toString() {
        return "ItemVenda{" +
                "produto=" + produto +
                ", valor=" + valor +
                ", qtde=" + qtde +
                '}';
    }
}
