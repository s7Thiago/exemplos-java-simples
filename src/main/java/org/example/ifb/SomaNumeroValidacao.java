package org.example.ifb;

/*
* https://docentes.ifrn.edu.br/nickersonferreira/disciplinas/fundamentos-de-logica-e-algoritmos-1o-ano-info/lista-de-exercicios-repeticao/view
*
* 15) Escreva um algoritmo que leia uma sequência de números do usuário e realize a
soma desses números. Encerre a execução quando um número negativo for digitado.
* */

import java.util.Scanner;

public class SomaNumeroValidacao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resultado = 0;
        String texto = "Digite um número ( %d ):  ";

        System.out.printf(texto, resultado);
        int numeroAtual = sc.nextInt();

        for(int i = 0; numeroAtual >= 0; i++) {

            resultado += numeroAtual;

            System.out.printf(texto, resultado);
            numeroAtual = sc.nextInt();

        }

        System.out.println("\nResultado final: " + resultado);

    }

}
