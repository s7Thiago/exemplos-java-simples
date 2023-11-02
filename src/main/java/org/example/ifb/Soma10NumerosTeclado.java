package org.example.ifb;

import java.util.Scanner;

public class Soma10NumerosTeclado {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int resultado = 0;

        for(int i = 0; i < 10; i++) {
            String mensagem = String.format("Digite o %d° número:  ", i + 1);
            System.out.print(mensagem);

            resultado += s.nextInt();
        }

        System.out.println("\nResultado: " + resultado);

    }
}
