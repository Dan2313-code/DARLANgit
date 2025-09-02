package org.example.Atividade8;

public class Motoboy extends Funcionario {
private String habilitacao;

    public Motoboy(String nome, String dataDeNascimento, Sexo sexo, Setor setor, String habilitacao) {
        super(nome, dataDeNascimento, sexo, setor);
        this.habilitacao = habilitacao;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "nome='" + nome + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", habilitacao='" + habilitacao + '\'' +
                '}';
    }
}
