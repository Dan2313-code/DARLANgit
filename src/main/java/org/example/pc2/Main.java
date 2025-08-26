package org.example.pc2;

import org.example.pc2.Memoria1;
import org.example.pc2.Processador1;

public class Main {
    public static void main(String[] args) {
        Processador1 processador = new Processador1("Intel", "i7-9700K", "3.6GHz");
        Memoria1 memoria = new Memoria1("Corsair", "Vengeance LPX", "16GB");

        System.out.println(processador.toString());
        System.out.println(memoria.toString());
    }
}
