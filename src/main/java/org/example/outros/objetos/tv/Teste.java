package org.example.outros.objetos.tv;

public class Teste {
    public static void main(String[] args) {

        TV minhaTelevisao = new SmartTV();
        minhaTelevisao.ligar();

        TV outraTv = new TvTubo();

    }
}


abstract class TV {
    String tela;
    String marca;
    String modelo;
    String cor;
    String resolucao;

    void ligar() {
        System.out.println("Ligando a TV");
    }
}

class SmartTV extends TV {
    String sistema;
    String conexao;
    String aplicativos;

}

class TvTubo extends TV {
    String antena;
    String entrada;
    String saida;
}