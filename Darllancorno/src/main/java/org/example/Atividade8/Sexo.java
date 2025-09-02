package org.example.Atividade8;

public enum Sexo {
    MASCULINO("MASCULINO"),
    FEMININO("FEMININO"),
    ;

    private final String descricao;

    Sexo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;

    }
}
