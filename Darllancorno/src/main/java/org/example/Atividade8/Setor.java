package org.example.Atividade8;

public enum Setor {
    Recursos_Humanos("Recursos Humanos"),
    Financeiro("Financeiro"),
    Operacoes("Operações");

    private final String descricao;
    Setor(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

}
