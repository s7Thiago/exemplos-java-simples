package org.example.ifb;

/*
* https://docentes.ifrn.edu.br/nickersonferreira/disciplinas/fundamentos-de-logica-e-algoritmos-1o-ano-info/lista-de-exercicios-repeticao/view
*
* 10) Crie um algoritmo leia um número do usuário e exiba a sua tabuada de multiplicação.
* */

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número:  ");
        int numero = sc.nextInt();

        for(int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }

        // Exemplo com while
        /*

        int i = 0;
        while(i < 10) {
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
            i++;

        }*/

        sc.close();
    }
}
