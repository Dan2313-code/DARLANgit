package org.example.atividade5;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1, "Darlan", "Engenharia de Software");
        Professor professor = new Professor(1, "João", "Matemática");

        System.out.println(aluno.toString());
        System.out.println(professor.toString());
    }
}
