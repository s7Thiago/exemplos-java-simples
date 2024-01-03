package org.example.outros.objetos.cod3r.composicao;

import java.util.List;

public class Cliente {
    String nome;
    List<Compra> compras;

    public Cliente(String nome, List<Compra> compras) {
        this.nome = nome;
        this.compras = compras;
    }

    public double obterValorTotal() {
        double total = 0;

        for (Compra compra : compras) {
            total += compra.obterValorTotal();
        }

        return total;
    }

}
