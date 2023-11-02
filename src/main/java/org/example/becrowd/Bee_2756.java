package org.example.becrowd;

public class Bee_2756 {

    public static void printEspaco(int quantidadeEspacos) {
        for (int i = 0; i < quantidadeEspacos; i++) {
            System.out.print(" ");
        }
    }

    public static String retornaEspaco(int quantidadeEspacos) {
        String resultado = "";
        for (int i = 0; i < quantidadeEspacos; i++) {
            resultado += " ";
        }

        return resultado;
    }

    public static void main(String[] args) {

        char start = 'A';
        int aux = 0;

        for (int i = 0; i < 5; i++) {
            char c = (char) (start + i);

            printEspaco(7 - i);

            if (c > 'A') {
                aux++;
                System.out.println(c + retornaEspaco(aux) + c);
                aux++;
            } else {
                System.out.println(c);
            }
        }

        char end = 'D';
        int aux2 = 7;
        int qtdeEspacos = 4;

        for (int i = end; i >= 'A'; i--) {
            char c = (char) (i);

            printEspaco(qtdeEspacos++);

            if (c > 'A') {
                aux2--;
                System.out.println(c + retornaEspaco(aux2 - 1) + c);
                aux2--;
            } else {
                System.out.println(c);
            }
        }

        System.out.println();

    }
}
