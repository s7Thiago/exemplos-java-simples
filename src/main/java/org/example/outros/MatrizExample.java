package org.example.outros;


/*
* LINK EXERCÍCIOS MATRIZES
*
* https://professor.pucgoias.edu.br/SiteDocente/admin/arquivosUpload/17510/material/Exercicios_Matrizes.pdf
*
* */

public class MatrizExample {

    public static void main(String[] args) {

        int[] vetor = {1, 2, 5, 7, 9};
        int a = 1;

        char[][] matriz = {
                {'*', '*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*', '*'}
        };

        System.out.println("\n\n");

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {

                if(((j - i) < 2) && ((j - i) != 1)) System.out.print("  " + matriz[i][j] + "  ");
                else System.out.print("  " + " " + "  ");
            }
            System.out.println();
        }

        System.out.println("\n\n");

    }
}
