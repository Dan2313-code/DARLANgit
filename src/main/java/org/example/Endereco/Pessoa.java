package org.example.Endereco;

import org.example.Endereco.Endereco;
import org.example.Sexo;

public class Pessoa {
    private Integer id;
    private String nome;
    private int idade;
    private String telefone;
    private Sexo sexo;
    private Endereco endereco;

    private String email;

    public Pessoa(Integer id, String nome, int idade, String telefone, Sexo sexo, Endereco endereco, String email) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.sexo = sexo;
        this.endereco = endereco;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", telefone='" + telefone + '\'' +
                ", sexo=" + sexo +
                ", endereco=" + endereco +
                ", email='" + email + '\'' +
                '}';
    }
}