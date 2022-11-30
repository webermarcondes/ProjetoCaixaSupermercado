package Entidades;
import Enums.Situacao;
import Enums.StatusVenda;
import Enums.TipoPagamento;
import Exceptions.SaidaException;
import Repository.ProdutoDAO;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Venda {

    private List<ItemVenda> item = new ArrayList<>();
    private List<ItemVenda> itemDasVendas = new ArrayList<>();
    private Cliente cliente;
    private Situacao pago;
    private StatusVenda status;
    private TipoPagamento tipoPagamento;
    private Date now = new Date();
    private Integer Numero;
    private Integer Parcelas;
    private List<String> datas = new ArrayList<>();
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Venda(){

    }

    public List<ItemVenda> getItemDasVendas() {
        return itemDasVendas;
    }

    public Venda(Integer numero){
        Numero = numero;
    }


    public Double Total(){
        Double soma = 0.0;
        for (ItemVenda list: itemDasVendas){
            soma = soma + list.subTotal();
        }
        return soma;
    }

    public void validacao(){

    }

    public void validacaoTempo(){
        Calendar  cal = Calendar.getInstance();
        cal.setTime(now);
        for(int i=1; i<Parcelas; i++){
            cal.add(Calendar.MONTH, i);
            Date data = cal.getTime();
            String dataFormatada = sdf.format(data);
            datas.add(dataFormatada);
        }
    }

    public void adicionarItemNaVenda(ItemVenda itens){
        itemDasVendas.add(itens);
    }

    public void adicionarItem(ItemVenda itens){
        item.add(itens);
    }

    public void validaItem() throws SaidaException {

        boolean cadastrando = true;

                while (cadastrando == true) {
                    try {
                        Integer quantidadeProduto = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite aquantidade do produto: \n 0 - Subtotal", "Balcão", JOptionPane.QUESTION_MESSAGE));
                        if (quantidadeProduto == 0) {System.out.println("Total Venda: " + Total()); break;}
                        Integer codigoProduto = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o código do produto: \n 0 - Subtotal", "Balcão", JOptionPane.QUESTION_MESSAGE));
                        if(codigoProduto == 0){System.out.println("Total Venda: " + Total()); break;}

                        List<ItemVenda> itens = ProdutoDAO.buscarPorCodigo(codigoProduto);

                        for (ItemVenda itemAdicionar : itens) {

                            if (itemAdicionar.getQuantidade() >= quantidadeProduto){

                                ItemVenda produtosVenda = new ItemVenda(codigoProduto, itemAdicionar.getNomeProduto(), itemAdicionar.getValorUnitario(), quantidadeProduto);
                                itemAdicionar.setQuantidade(itemAdicionar.getQuantidade() - quantidadeProduto);

                                    System.out.println("Item Adicionado a venda: " + produtosVenda);

                                adicionarItemNaVenda(produtosVenda);
                                adicionarItem(itemAdicionar);

                            }else {
                                System.out.println("Produto não possui estoque suficiente!!");
                            }
                        }
                    }
                    catch (NumberFormatException b ){
                        Main.telaInicial();
                    }
                }
    }

    public void salvarItem(ItemVenda salvaItem){
        item.add(salvaItem);
    }

    public void removerItem(ItemVenda listaItens){
        item.add(listaItens);
    }

    public Double descontos(){
        if(cliente!= null && Total()> 130){
            return Total() - 20;
        }else{
            return Total();
        }
    }

    public String cupomFiscal(){
        StringBuilder bd = new StringBuilder();
        setStatus(StatusVenda.INICIANDO);
        setStatus(StatusVenda.PROCESSANDO);
        bd.append("\n");
        bd.append("====================================================\n");
        bd.append("                   CUPOM FISCAL \n");
        bd.append("====================================================\n");
        if(cliente!=null){
            bd.append("Cliente: " + cliente.getPessoa().getNome() + "\n");
            bd.append("CPF/CNPJ: " + cliente.getPessoa().getDocumentoPrincipal() + "\n");

        }else {
            bd.append("Cliente: Consumidor final\n");
        }
        Random numero = new Random();
        Numero = numero.nextInt(100);
        bd.append("Número do pedido:                         "+ Numero + "\n");
        bd.append("Data da Compra:                           " + sdf.format(now) + "\n");
        setStatus(StatusVenda.IMPRIMINDO);
        bd.append("Status:                                   " + getStatus() + "\n");
        bd.append("Forma de Pagamento:                       " + getTipoPagamento() + "\n");
        bd.append("\n");
        bd.append("====================================================\n");
        bd.append("                  ITENS DA VENDA " + "\n");
        bd.append("\n");

        for (ItemVenda list : itemDasVendas){
            bd.append(list + "\n");

        }
        bd.append("====================================================\n");
        bd.append("\n");
        bd.append("Situação: " + getPago() + "\n");
        setStatus((StatusVenda.FINALIZANDO));
        bd.append("Total da Venda:                            R$" + Total());
        return bd.toString();
    }

    public List<ItemVenda> getItem() {
        return item;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Situacao getPago() {
        return pago;
    }

    public void setPago(Situacao pago) {
        this.pago = pago;
    }

    public StatusVenda getStatus() {
        return status;
    }

    public void setStatus(StatusVenda status) {
        this.status = status;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Date getNow() {
        return now;
    }

    public Integer getNumber() {
        return Numero;
    }

    public void setNumber(Integer number) {
        this.Numero = number;
    }

    public Integer getParcelas() {
        return Parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.Parcelas = parcelas;
    }

}