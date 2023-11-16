package org.example.outros.metodos;

public class Metodos2 {

    public static void verificaParImpar(int numero) {
        if(numero % 2 == 0) {
            System.out.printf("\nO numero %s é PAR\n", numero);
        } else {
            System.out.printf("\nO numero %s é IMPAR\n", numero);
        }
    }

    public static void main(String[] args) {

        int a = 10;

        verificaParImpar(a);
        verificaParImpar(17);
        verificaParImpar(5);
        verificaParImpar(45);
        verificaParImpar(74);
        verificaParImpar(11);
        verificaParImpar(12);
        verificaParImpar(18);

    }
}
