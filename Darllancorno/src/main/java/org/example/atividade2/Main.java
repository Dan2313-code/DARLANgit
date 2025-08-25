package org.example.atividade2;

public class Main{
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Dylan","21",Pedido.CONCLUIDO);

        System.out.println("Nome: "+cliente1.getNome());
        System.out.println("Idade: "+cliente1.getIdade());
        System.out.println("Pedido: "+cliente1.getPedido().getTexto());
    }
}
