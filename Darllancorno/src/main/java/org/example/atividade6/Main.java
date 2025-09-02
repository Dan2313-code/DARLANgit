package org.example.atividade6;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal galo = new Galo();
        Animal pato = new Pato();

        System.out.println("Cachorro faz: "+ cachorro.emitirSom() + " e come " + cachorro.comer());
        System.out.println("\nGato faz: "+ gato.emitirSom() + "e come " + gato.comer());
        System.out.println("\nGalo faz: " + galo.emitirSom() + "e come " + galo.comer());
        System.out.println("\nPato faz: "+ pato.emitirSom() + " e come" + pato.comer());


    }
}
