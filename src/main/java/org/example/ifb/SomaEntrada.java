package org.example.ifb;

/*
 * https://docentes.ifrn.edu.br/nickersonferreira/disciplinas/fundamentos-de-logica-e-algoritmos-1o-ano-info/lista-de-exercicios-repeticao/view
 *
 * 5) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.
 *
 * VERSÃO BOA PRÁTICA
 *
 * */

import java.util.Scanner;

public class SomaEntrada {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int resultado = 0;
            int quantidadeNumeros = 500;
            int[] numeros = new int[quantidadeNumeros];

            for(int numeroAtual = 0; numeroAtual < quantidadeNumeros; numeroAtual++) {
                System.out.printf("Digite o %d° número:  ", numeroAtual + 1);
                numeros[numeroAtual] = sc.nextInt();
                resultado += numeros[numeroAtual];
            }

            System.out.printf("Resultado: %d\n", resultado);

            sc.close();
    }
}
