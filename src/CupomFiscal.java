import java.math.BigDecimal;
import java.util.List;

public class CupomFiscal {

    private List<ItemVenda> itemVenda;

    public CupomFiscal(List<ItemVenda> itemVenda) {
        this.itemVenda = itemVenda;

    }

    @Override
    public String toString() {
        return "CupomFiscal{" +
                "itemVenda=" + itemVenda +
                '}';
    }
}