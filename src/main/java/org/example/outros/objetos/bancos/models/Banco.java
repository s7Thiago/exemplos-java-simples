package org.example.outros.objetos.bancos.models;

import java.math.BigDecimal;
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

    public int qtdeContas() {
        if(contas != null) {
            return this.contas.size();
        }

        return 0;
    }

    public double saldoTotal() {

        double saldo = 0;

        for(int i = 0; i < this.contas.size(); i++) {
            saldo += contas.get(i).saldo;
        }

        return saldo;

    }

}
