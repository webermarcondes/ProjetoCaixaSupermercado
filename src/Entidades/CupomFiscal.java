package Entidades;

import java.math.BigDecimal;
import java.util.List;

public class CupomFiscal {

    private List<ItemVenda> itemVenda;

    public CupomFiscal(List<ItemVenda> itemVenda) {
        this.itemVenda = itemVenda;

    }

    public CupomFiscal() {

    }

    public List<ItemVenda> getItemVenda() {
        return itemVenda;
    }

    public void setItemVenda(List<ItemVenda> itemVenda) {
        this.itemVenda = itemVenda;
    }

    @Override
    public String toString() {
        return

                itemVenda.toString();
    }
}