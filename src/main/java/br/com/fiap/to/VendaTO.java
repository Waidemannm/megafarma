package br.com.fiap.to;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public class VendaTO {
    //atributos
    private Long codigo;
    @PastOrPresent
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dataDaVenda;
    @NotNull
    private Long codCliente;

    //construtores
    public VendaTO() {
    }

    public VendaTO(Long codigo, LocalDate dataDaVenda, Long codCliente) {
        this.codigo = codigo;
        this.dataDaVenda = dataDaVenda;
        this.codCliente = codCliente;
    }

    //metodos getters and setters
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataDaVenda() {
        return dataDaVenda;
    }

    public void setDataDaVenda(LocalDate dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }

    public Long getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Long codCliente) {
        this.codCliente = codCliente;
    }
}
