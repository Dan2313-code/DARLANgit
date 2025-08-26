package org.example.Endereco;

import org.example.UnidadeFederativa;

public class Endereco {

    private String logradrouro;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;
    private UnidadeFederativa Uf;

    public Endereco(String logradrouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        this.logradrouro = logradrouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        Uf = uf;
    }

    public String getLogradrouro() {
        return logradrouro;
    }

    public void setLogradrouro(String logradrouro) {
        this.logradrouro = logradrouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederativa getUf() {
        return Uf;
    }

    public void setUf(UnidadeFederativa uf) {
        Uf = uf;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logradrouro='" + logradrouro + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", Uf=" + Uf +
                '}';
    }
}