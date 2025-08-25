package org.example.atividade1;

public class Cliente {
    private String nome;
    private int idade;
    private Pet pet;

    public Cliente(String nome, int idade, Pet pet) {
        this.nome = nome;
        this.idade = idade;
        this.pet = pet;
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

    public Pet getPet() {
        return this.pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String toString() {
        String var10000 = this.nome;
        return "Cliente{nome='" + var10000 + "', idade=" + this.idade + ", pet=" + String.valueOf(this.pet) + "}";
    }
}