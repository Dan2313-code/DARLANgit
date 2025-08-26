package org.example.herança;

public class Funcionario extends Pessoa{
    private String matricula;
    private String cargo;
    private String salario;

    public Funcionario(String nome, Integer idade, String matricula, String cargo, String salario) {
        super(nome, idade);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }
    //kkkkk

}
