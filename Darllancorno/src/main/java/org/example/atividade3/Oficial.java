package org.example.atividade3;

public class Oficial {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(10,"Dylan","21","10.000",Sexo.MASCULINO,Setor.Recursos);
        System.out.println(f1.toString());
    }
}
