package org.example;
public enum Sexo {
    FEMININO("Feminino"),
    MASCULINO("Masculino");

    private String texto;

    private Sexo(String texto){
        this.texto = texto;
    }
    public String getTexto(){
        return texto;
    }
}