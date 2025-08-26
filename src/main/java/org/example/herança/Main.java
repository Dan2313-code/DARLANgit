package org.example.herança;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Cliente("Maria", 30,
                "2023-10-01", "Cartão de Crédito");

        Funcionario funcionario1 = new Funcionario("João", 40,
                "12345", "Gerente", "5000.0");

        System.out.println(pessoa1.toString());
        System.out.println(funcionario1.toString());
    }
}
