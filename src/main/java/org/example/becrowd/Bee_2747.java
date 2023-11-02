package org.example.becrowd;

public class Bee_2747 {

    public static void imprimirTracos(int qtdeTracos) {
        for(int i = 0; i < qtdeTracos; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void imprimirInfo(int tamLinha) {
        System.out.print("|");

        int qtdeEspacos = tamLinha - (2);

        for(int i = 0; i < qtdeEspacos; i++) {
            System.out.print(" ");
        }

        System.out.println("|");
    }

    public static void main(String[] args) {

        int qtdeTracos = 39;

        imprimirTracos(qtdeTracos);
        imprimirInfo(qtdeTracos);
        imprimirInfo(qtdeTracos);
        imprimirInfo(qtdeTracos);
        imprimirInfo(qtdeTracos);
        imprimirInfo(qtdeTracos);
        imprimirTracos(qtdeTracos);


    }
}
