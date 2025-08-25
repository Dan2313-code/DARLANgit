package org.example.atividade4;

public enum UnidadeFederativa {
    BAHIA("BA"),
    SAO_PAULO("SP"),
    RIO_DE_JANEIRO("RJ");

    private String texto;

    private UnidadeFederativa(String texto){
        this.texto = texto;
    }
    public String getTexto(){
        return texto;
    }
}
