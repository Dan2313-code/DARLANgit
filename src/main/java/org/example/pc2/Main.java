package org.example.pc2;

import org.example.pc2.Memoria1;
import org.example.pc2.Processador1;

public class Main {
    public static void main(String[] args) {
        Processador1 processador = new Processador1("Intel", "i7-9700K", "3.6GHz");
        Memoria1 memoria = new Memoria1("Corsair", "Vengeance LPX", "16GB");
        dispositivoArmazenamento armazenamento1 = new dispositivoArmazenamento("Samsung", "EVO 860", "1TB", "SATA");
        placaMae placaMae1 = new placaMae("ASUS", "ROG STRIX Z390-E", "LGA1151");

        System.out.println('\n');
        System.out.println(processador.toString());
        System.out.println('\n');
        System.out.println(memoria.toString());
        System.out.println('\n');
        System.out.println(armazenamento1.toString());
        System.out.println('\n');
        System.out.println(placaMae1.toString());
    }
    //res
}
