package org.example.becrowd;

public class Bee_2748 {

    public int altura = 6;

    public static void imprimirTracos(int qtdeTracos) {
        for(int i = 0; i < qtdeTracos; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void imprimirInfo(String info, int tamLinha) {
        System.out.print("|");

        for(int i = 0; i < 8; i++) {
            System.out.print(" ");
        }

        System.out.print(info);

        int qtdeEspacos = tamLinha - (2 + 8 + info.length());

        for(int i = 0; i < qtdeEspacos; i++) {
            System.out.print(" ");
        }

        System.out.println("|");
    }

    public static void main(String[] args) {

        int qtdeTracos = 39;

        imprimirTracos(qtdeTracos);
        imprimirInfo("Roberto", qtdeTracos);
        imprimirInfo("", qtdeTracos);
        imprimirInfo("5786", qtdeTracos);
        imprimirInfo("", qtdeTracos);
        imprimirInfo("UNIFEI", qtdeTracos);
        imprimirTracos(qtdeTracos);
    }
}
