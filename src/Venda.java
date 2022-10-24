import java.time.LocalDate;
import java.util.List;

public class Venda {

    private Integer codigoVenda;
    private LocalDate dataVenda;
    private Desconto desconto;
    private List<ItemVenda> itensVenda;
    private Funcionario funcionario;
    private Cliente cliente;

    private FormaPagamento formaPagamento;


    public Venda(Integer codigoVenda, LocalDate dataVenda, Desconto desconto, List<ItemVenda> itensVenda,
                 Funcionario funcionario, Cliente cliente) {

        this.codigoVenda = codigoVenda;
        this.dataVenda = dataVenda;
        this.desconto = desconto;
        this.itensVenda = itensVenda;
        this.funcionario = funcionario;
        this.cliente = cliente;


    }

    public Venda() {

    }

    public Integer getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(Integer codigoVenda) {
        this.codigoVenda = codigoVenda;
    }


    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }


    public Desconto getDesconto() {
        return desconto;
    }

    public void setDesconto(Desconto desconto) {
        this.desconto = desconto;
    }


    public List<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(List<ItemVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }


    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Double calcularValorVenda() {
        Double valor = 0.0;

        for (ItemVenda item: itensVenda) {
            valor += item.getValor() * item.getQtde();
        }

        return valor;
    }


}
