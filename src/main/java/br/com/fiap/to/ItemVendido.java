package br.com.fiap.to;

public class ItemVendido {
    //atributos
    private Long codVenda;
    private Long codRemedio;
    private int quantidade;

    //construtores
    public ItemVendido() {
    }

    public ItemVendido(Long codVenda, Long codRemedio, int quantidade) {
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
