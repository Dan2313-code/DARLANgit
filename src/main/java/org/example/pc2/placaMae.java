package org.example.pc2;

public class placaMae extends Produto {
    private String socket;
    public placaMae(String marca, String modelo, String socket) {
        super(marca, modelo);
        this.socket = socket;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    @Override
    public String toString() {
        return "placaMae{" +
                "socket='" + socket + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
