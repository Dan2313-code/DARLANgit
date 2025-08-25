package org.example.atividade2;

public class Cliente {
    private String nome;
    private  String idade;
    private Pedido pedido;


    public Cliente(String nome,String idade, Pedido pedido) {
        this.nome = nome;
        this.idade = idade;
        this.pedido = pedido;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }



    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", pedido=" + pedido +
                '}';
    }
}
