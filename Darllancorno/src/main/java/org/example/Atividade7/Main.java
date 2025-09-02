package org.example.Atividade7;

public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtacao subtacao = new Subtacao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();
        System.out.println("Soma: " + soma.calcular(5, 3));
        System.out.println("Subtração: " + subtacao.calcular(5, 3));
        System.out.println("Multiplicação: " + multiplicacao.calcular(5, 3));
        System.out.println("Divisão: " + divisao.calcular(5, 2));
    }
}
