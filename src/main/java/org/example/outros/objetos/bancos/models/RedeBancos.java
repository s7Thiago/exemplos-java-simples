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

    public int qtdeContas() {
        int qtde = 0;

        for(int i = 0; i < this.bancos.size(); i++) {
            qtde += bancos.get(i).qtdeContas();
        }

        return qtde;
    }

    public int qtdeContas2() {
        int qtde = 0;

        qtde = this.bancos.stream().map((banco) -> banco.qtdeContas()).reduce(qtde, Integer::sum);

        return qtde;
    }

    public double saldoTotal() {
        double saldo = 0;

        for(int i = 0; i < this.bancos.size(); i++) {
            saldo += bancos.get(i).saldoTotal();
        }

        return saldo;
    }

}
