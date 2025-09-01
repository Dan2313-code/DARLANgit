package org.example.atividade5;

public class Professor extends Pessoa{

    private String matricula;

    public Professor(){}

    public Professor(String matricula,int id, String nome){

        super(id,nome);
        this.matricula = matricula;
    }

    public Professor(String matricula) {
        this.matricula = matricula;
    }

    public Professor(int id, String nome, String matricula) {
        super(id, nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "matricula='" + matricula + '\'' +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
