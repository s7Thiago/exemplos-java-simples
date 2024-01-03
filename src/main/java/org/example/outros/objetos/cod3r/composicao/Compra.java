package org.example.outros.objetos.cod3r.composicao;

import java.util.List;

public class Compra {

    List<Item> itens;

    public Compra(List<Item> itens) {
        this.itens = itens;
    }

    public double obterValorTotal() {
        double total = 0;

        for(Item item: itens) {
            total += item.obterValorTotal();
        }

        return total;
    }
}
