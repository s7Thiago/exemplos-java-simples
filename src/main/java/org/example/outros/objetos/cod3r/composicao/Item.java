package org.example.outros.objetos.cod3r.composicao;

public class Item {

    public int quantidade;
    public Produto produto;

    public Item(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public double obterValorTotal() {
        return quantidade * produto.preco;
    }

}
