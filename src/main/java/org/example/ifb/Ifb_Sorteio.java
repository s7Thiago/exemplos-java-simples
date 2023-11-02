package org.example.ifb;

import java.util.Random;
import java.util.Scanner;

/*
* 1. Faça um laço de repetição que solicite ao usuário digitarum número;
2.O laço encerra quando o usuário acertar o número;
3.Se o número do usuário for menor que o oculto, escrever: “MAIOR”, se o número do usuário for maior que o oculto, escrever: “MENOR”.
* */

public class Ifb_Sorteio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random(); //Inicia Aleatório
        int x = rnd.nextInt(100); // Gera um número aleatório (0 – 99)
        int input;

        do {
            System.out.print("Digite um número: ");
            input = sc.nextInt();

            if(input < x) System.out.println("MAIOR");
            else if(input > x) System.out.println("MENOR");
            else System.out.println("ACERTOU");

        } while (input != x);
    }
}
