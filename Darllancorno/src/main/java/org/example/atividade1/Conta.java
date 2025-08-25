package org.example.atividade1;

public class Conta {
    public Conta() {
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(1, "Dylan", "Cosme de Farias", "(71) 999835130", "freitasdarlan5@gmail.com", new Bancaria("BB", "Correio", 12, "A", 1000.0, 200000.0));
        System.out.println(funcionario.toString());
    }
}
