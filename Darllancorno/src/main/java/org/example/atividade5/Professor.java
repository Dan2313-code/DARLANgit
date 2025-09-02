package org.example.atividade5;

public class Professor extends Pessoa{
    private String disciplina;

    public Professor(int id, String nome, String disciplina) {
        super(id, nome);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }


}