package org.example.outros.objetos.cod3r.composicao;

import java.util.List;

public class Teste {
    public static void main(String[] args) {

        Produto caneta = new Produto("Caneta", 0.5);
        Produto borracha = new Produto("Borracha", 1.5);
        Produto caderno = new Produto("Caderno", 15.0);
        Produto lapis = new Produto("Lapis", 0.75);
        Produto apontador = new Produto("Apontador", 2.0);


        List<Compra> lista1 = List.of(
                new Compra(List.of(new Item(10, caneta))),
                new Compra(List.of(new Item(5, borracha))),
                new Compra(List.of(new Item(8, caderno))),
                new Compra(List.of(new Item(4, lapis))),
                new Compra(List.of(new Item(3, apontador)))
        );

        List<Compra> lista2 = List.of(
                new Compra(List.of(new Item(7, caneta))),
                new Compra(List.of(new Item(3, borracha))),
                new Compra(List.of(new Item(4, caderno))),
                new Compra(List.of(new Item(2, lapis))),
                new Compra(List.of(new Item(1, apontador)))
        );

        Cliente cliente1 = new Cliente("Maria Julia", lista1);
        Cliente cliente2 = new Cliente("Rafael Junior", lista2);

        System.out.printf("\n\n%s gastou R$%.2f\n", cliente1.nome, cliente1.obterValorTotal());
        System.out.printf("%s gastou R$%.2f\n\n", cliente2.nome, cliente2.obterValorTotal());

    }
}
