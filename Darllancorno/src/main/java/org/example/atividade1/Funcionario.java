package org.example.atividade1;

public class Funcionario {
    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private Bancaria bancaria;

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Bancaria getBancaria() {
        return this.bancaria;
    }

    public void setBancaria(Bancaria bancaria) {
        this.bancaria = bancaria;
    }

    public String toString() {
        int var10000 = this.codigo;
        return "Funcionario{codigo=" + var10000 + ", nome='" + this.nome + "', endereco='" + this.endereco + "', telefone='" + this.telefone + "', email='" + this.email + "', bancaria=" + String.valueOf(this.bancaria) + "}";
    }

    public Funcionario(int codigo, String nome, String endereco, String telefone, String email, Bancaria bancaria) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.bancaria = bancaria;
    }
}