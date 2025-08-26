package org.example.pc2;

public class dispositivoArmazenamento extends Produto {
    private String tipo;
    private String capacidade;

    public dispositivoArmazenamento(String marca, String modelo, String tipo, String capacidade) {
        super(marca, modelo);
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "dispositivoArmazenamento{" +
                "tipo='" + tipo + '\'' +
                ", capacidade='" + capacidade + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}