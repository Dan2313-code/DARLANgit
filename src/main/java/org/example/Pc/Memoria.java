package org.example.Pc;

public class Memoria extends Processador{
    private String capacidadeArmazenamento;
    private String marca;
    private String modelo;

    public Memoria(String marca, String modelo, String frequencia, String capacidadeArmazenamento, String marca1, String modelo1) {
        super(marca, modelo, frequencia);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.marca = marca1;
        this.modelo = modelo1;
    }///aa

    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidadeArmazenamento='" + capacidadeArmazenamento + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
