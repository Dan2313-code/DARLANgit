package org.example.atividade6;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        Pato pato = new Pato();
        Galo galo = new Galo();

        System.out.println("Cachorro: " + cachorro.emitirSom());
        System.out.println("Gato: " + gato.emitirSom());
        System.out.println("Pato: " + pato.emitirSom());
        System.out.println("Galo: " + galo.emitirSom());

    }
}
