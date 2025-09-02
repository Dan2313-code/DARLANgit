package org.example.Atividade8;

public class Diretor extends Funcionario {
 private String premio;

    public Diretor(String nome, String dataDeNascimento, Sexo sexo, Setor setor, String premio) {
        super(nome, dataDeNascimento, sexo, setor);
        this.premio = premio;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "nome='" + nome + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", premio='" + premio + '\'' +
                '}';
    }
}
