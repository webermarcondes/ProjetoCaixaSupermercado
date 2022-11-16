package Entidades;

import java.math.BigDecimal;

public class Desconto {

    private String descricao;
    private BigDecimal valor;

    public Desconto(String descricao, BigDecimal valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
