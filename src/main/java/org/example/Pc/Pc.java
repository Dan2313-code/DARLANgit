package org.example.Pc;

public class Pc {
    public static void main(String[] args) {
        Memoria memoria = new Memoria("Intel", "i7", "3.6GHz", "16GB", "Kingston", "HyperX");
        System.out.println(memoria.toString());

        Processador processador = new Processador("AMD", "Ryzen 5", "3.8GHz") {
        };

        System.out.println(processador.toString());

    }
}
