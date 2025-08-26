package org.example.herança;

public class Cliente extends Pessoa {
    private String dateDeCompra;

    private String formaDePagamento;;

    public Cliente(String nome, Integer idade, String dateDeCompra, String formaDePagamento) {
        super(nome, idade);
        this.dateDeCompra = dateDeCompra;
        this.formaDePagamento = formaDePagamento;
    }

    public String getDateDeCompra() {
        return dateDeCompra;
    }

    public void setDateDeCompra(String dateDeCompra) {
        this.dateDeCompra = dateDeCompra;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dateDeCompra='" + dateDeCompra + '\'' +
                ", formaDePagamento='" + formaDePagamento + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
