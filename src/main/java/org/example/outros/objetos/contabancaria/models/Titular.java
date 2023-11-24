package org.example.outros.objetos.contabancaria.models;

public class Titular {
    public String nome;
    public String cpf;
    public String senha;

    // construtor
    public Titular(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }
}
