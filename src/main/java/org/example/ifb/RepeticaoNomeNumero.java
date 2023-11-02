package org.example.ifb;

/*
 * https://docentes.ifrn.edu.br/nickersonferreira/disciplinas/fundamentos-de-logica-e-algoritmos-1o-ano-info/lista-de-exercicios-repeticao/view
 *
 * 4) Leia o nome do usuário e um número N. Depois, escreva o nome dele na tela N vezes.
 * */

import java.util.Scanner;

public class RepeticaoNomeNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o nome?   ");
        String nome = sc.next();

        System.out.print("Quantas repetições?  ");
        int n = sc.nextInt();

        System.out.println();

        for (int start = 0; start < n; start++) {
            System.out.printf("%d - %s\n", start + 1, nome);
        }

        sc.close();
    }
}
