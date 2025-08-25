package org.example.atividade2;

public enum Pedido {
    ABERTO ("Aberto"),
    CANCELADO ("Cancelado"),
    CONCLUIDO ("Concluido");

    private String texto;

    private Pedido(String texto){
        this.texto = texto;
    }
    public String getTexto(){
        return  texto;
    }
}
