package org.example.atividade1;

public class Pet {
    private String nome;
    private int idade;
    private String raca;

    public Pet(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return this.raca;
    }

    public String toString() {
        return "Pet{nome='" + this.nome + "', idade=" + this.idade + ", raca='" + this.raca + "'}";
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
