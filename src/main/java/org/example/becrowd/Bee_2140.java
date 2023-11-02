package org.example.becrowd;

import java.util.Scanner;

public class Bee_2140 {
    public static void isPossible(int troco) {
        int[] notas = {2, 5, 10, 20, 50, 100};

        for (int i = 0; i < notas.length; i++) {
            int nota1 = notas[i];

            for (int j = 0; j < notas.length; j++) {
                int nota2 = notas[j];
                int soma = nota1 + nota2;

                if (soma == troco) {
                    System.out.println("possible");
                    return;
                }
            }
        }

        System.out.println("impossible");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int valorCompra = 2;
        int pagamentoCliente = 4;
        int troco = 0;

        do {
            valorCompra = s.nextInt();
            pagamentoCliente = s.nextInt();
            troco = pagamentoCliente - valorCompra;

            if (valorCompra != 0 && pagamentoCliente != 0) {
                Bee_2140.isPossible(troco);
            }
        } while (valorCompra != 0 && pagamentoCliente != 0);


        s.close();
    }
}
