package br.com.fiap.to;

import java.time.LocalDate;

public class ClienteTO {
    //atributos
    private Long codigo;
    private String nome;
    private String cpf;
    private String Email;
    private LocalDate dataDeNascimento;
    //construtores
    public ClienteTO() {
    }

    public ClienteTO(Long codigo, String nome, String cpf, String email, LocalDate dataDeNascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        Email = email;
        this.dataDeNascimento = dataDeNascimento;
    }
    //metodos getters and setters
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
