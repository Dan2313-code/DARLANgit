<<<<<<< HEAD
package org.example.Atividade7;

public class Divisao implements OperacaoMatematica{
    @Override
    public double calcular(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
=======
package org.example.Atividade7;

public class Divisao implements OperacaoMatematica{
    @Override
    public double calcular(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
>>>>>>> b408acf1e85ecc929508c2569b98dd981ce62bcd
