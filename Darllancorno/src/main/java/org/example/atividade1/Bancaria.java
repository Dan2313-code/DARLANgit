package org.example.atividade1;

public class Bancaria {
    private String banco;
    private String agencia;
    private int numeroConta;
    private String tipo;
    private double saldo;
    private double limite;

    public Bancaria(String banco, String agencia, int numeroConta, String tipo, double saldo, double limite) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.tipo = tipo;
        this.saldo = saldo;
        this.limite = limite;
    }

    public String getBanco() {
        return this.banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String toString() {
        return "Bancaria{banco='" + this.banco + "', agencia='" + this.agencia + "', numeroConta=" + this.numeroConta + ", tipo='" + this.tipo + "', saldo=" + this.saldo + ", limite=" + this.limite + "}";
    }
}
