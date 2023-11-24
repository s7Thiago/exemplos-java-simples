package org.example.outros.aumento_peso;

public class Pessoa {
    public String nome;
    public double peso;

    // construtor
    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(Comida comida) {
        this.peso += comida.peso;
    }

    public void exercitar() {
        this.peso -= 0.5;
    }

    @Override
    public String toString() {
        return "\n" + this.nome + " agora pesa " + this.peso + "kg";
    }
}

class Comida {
    public String nome;
    public double peso;

    // construtor
    public Comida(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }
}