package org.example.outros.objetos.bancos.models;

import java.util.List;

public class RedeBancos {
    public String nome;
    public String cnpj;
    public List<Banco> bancos;

    // Construtor
    public RedeBancos(String nome, String cnpj, List<Banco> bancos) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.bancos = bancos;
    }
}
