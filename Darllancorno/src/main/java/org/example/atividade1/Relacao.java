package org.example.atividade1;

public class Relacao {
    public Relacao() {
    }

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Darlan", 21, new Pet("Preto", 8, "Gato"));
        System.out.println(cliente1.toString());
    }
}
