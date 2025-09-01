package org.example.atividade5;

public class Aluno extends Pessoa {
    private String disciplina;
    private double nota;

    public Aluno(){}

    public Aluno(String disciplina, double nota, int id, String nome){

        super(id, nome);
        this.disciplina = disciplina;
        this.nota = nota;
    }

    public Aluno(String disciplina, double nota) {
        this.disciplina = disciplina;
        this.nota = nota;
    }

    public Aluno(int id, String nome, String disciplina, double nota) {
        super(id, nome);
        this.disciplina = disciplina;
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "disciplina='" + disciplina + '\'' +
                ", nota=" + nota +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
