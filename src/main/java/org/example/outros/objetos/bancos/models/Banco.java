package org.example.outros.objetos.bancos.models;

import java.util.List;

public class Banco {
    public String nome;
    public String cnpj;
    public List<Conta> contas;

    // Construtor
    public Banco(String nome, String cnpj, List<Conta> contas) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.contas = contas;
    }
}
