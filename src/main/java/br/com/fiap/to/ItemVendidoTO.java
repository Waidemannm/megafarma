package br.com.fiap.to;

import jakarta.validation.constraints.NotNull;

public class ItemVendidoTO {
    //atributos
    @NotNull
    private Long codVenda;
    @NotNull
    private Long codRemedio;
    @NotNull
    private int quantidade;

    //construtores
    public ItemVendidoTO() {
    }

    public ItemVendidoTO(Long codVenda, Long codRemedio, int quantidade) {
        this.codVenda = codVenda;
        this.codRemedio = codRemedio;
        this.quantidade = quantidade;
    }

    //metodos getters and setters
    public Long getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(Long codVenda) {
        this.codVenda = codVenda;
    }

    public Long getCodRemedio() {
        return codRemedio;
    }

    public void setCodRemedio(Long codRemedio) {
        this.codRemedio = codRemedio;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
