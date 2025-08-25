package org.example.atividade3;

import org.example.atividade4.UnidadeFederativa;

public class Endereco {
    private String logradouro;
    private String numerp;
    private String complemento;
    private String cep;
    private String cidade;
    private UnidadeFederativa unidadeFederativa;

    public Endereco(String logradouro, String numerp, String complemento, String cep, String cidade, UnidadeFederativa unidadeFederativa) {
        this.logradouro = logradouro;
        this.numerp = numerp;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.unidadeFederativa = unidadeFederativa;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumerp() {
        return numerp;
    }

    public void setNumerp(String numerp) {
        this.numerp = numerp;
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

    public UnidadeFederativa getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public void setUnidadeFederativa(UnidadeFederativa unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro='" + logradouro + '\'' +
                ", numerp='" + numerp + '\'' +
                ", complemento='" + complemento + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", unidadeFederativa=" + unidadeFederativa +
                '}';
    }
}
