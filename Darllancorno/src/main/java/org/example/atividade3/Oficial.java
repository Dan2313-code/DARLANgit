package org.example.atividade3;

public class Oficial {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(10,"Dylan","21","10.000",Sexo.MASCULINO,Setor.Financeioro);
        Funcionario f2 = new Funcionario(32, "Lucy","23","12.000",Sexo.FEMININO,Setor.Recursos);
        Funcionario f3 = new Funcionario(49, "Doulgas","21","10.320",Sexo.MASCULINO,Setor.Financeioro);
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());
    }
}
