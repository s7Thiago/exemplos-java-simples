package org.example.becrowd;

import java.util.Scanner;

public class Bee_1021 {

    public static double verificarNotasOuMoedas(double valor, double notaOuMoeda, int index) {
        int quantidadeNotas = (int) (valor / notaOuMoeda);
        valor -= quantidadeNotas * notaOuMoeda;

        if(index == 0) {
            System.out.println("\nNOTAS:");
        } else if(index == 6 && quantidadeNotas > 0) {
            System.out.println("\nMOEDAS:");
        }

        if(quantidadeNotas > 0) {
            if(notaOuMoeda > 1) {
                System.out.printf("%d nota(s) de R$ %.2f\n", quantidadeNotas, notaOuMoeda);
            } else {
                System.out.printf("%d moeda(s) de R$ %.2f\n", quantidadeNotas, notaOuMoeda);
            }
        }

        return valor;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double valor = 0;

        double[] notas = {100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.print("Digite o valor:  ");
        valor = s.nextDouble();

        for(int i = 0; i < notas.length; i++) {
            valor = Bee_1021.verificarNotasOuMoedas(valor, notas[i], i);
        }

        System.out.println("\n\n");

        /*// Notas de 100
        quantidadeNotas = (int) (valor / 100);
        valor -= quantidadeNotas * 100;
        System.out.println(quantidadeNotas + " nota(s) de R$ 100.00");

        // Notas de 50
        quantidadeNotas = (int) (valor / 50);
        valor -= quantidadeNotas * 50;
        System.out.println(quantidadeNotas + " nota(s) de R$ 50.00");

        // Notas de 20
        quantidadeNotas = (int) (valor / 20);
        valor -= quantidadeNotas * 20;
        System.out.println(quantidadeNotas + " nota(s) de R$ 20.00");

        // Notas de 10
        quantidadeNotas = (int) (valor / 10);
        valor -= quantidadeNotas * 10;
        System.out.println(quantidadeNotas + " nota(s) de R$ 10.00");

        // Notas de 5
        quantidadeNotas = (int) (valor / 5);
        valor -= quantidadeNotas * 5;
        System.out.println(quantidadeNotas + " nota(s) de R$ 5.00");

        // Notas de 2
        quantidadeNotas = (int) (valor / 2);
        valor -= quantidadeNotas * 2;
        System.out.println(quantidadeNotas + " nota(s) de R$ 2.00");*/

        /*// Moedas de 1
        quantidadeNotas = (int) (valor / 1);
        valor -= quantidadeNotas * 1;
        System.out.println(quantidadeNotas + " moeda(s) de R$ 1.00");

        // Moedas de 0.50
        quantidadeNotas = (int) (valor / 0.50);
        valor -= quantidadeNotas * 0.50;
        System.out.println(quantidadeNotas + " moeda(s) de R$ 0.50");

        // Moedas de 0.25
        quantidadeNotas = (int) (valor / 0.25);
        valor -= quantidadeNotas * 0.25;
        System.out.println(quantidadeNotas + " moeda(s) de R$ 0.25");

        // Moedas de 0.10
        quantidadeNotas = (int) (valor / 0.10);
        valor -= quantidadeNotas * 0.10;
        System.out.println(quantidadeNotas + " moeda(s) de R$ 0.10");

        // Moedas de 0.05
        quantidadeNotas = (int) (valor / 0.05);
        valor -= quantidadeNotas * 0.05;
        System.out.println(quantidadeNotas + " moeda(s) de R$ 0.05");

        // Moedas de 0.01
        quantidadeNotas = (int) (valor / 0.01);
        valor -= quantidadeNotas * 0.01;
        System.out.println(quantidadeNotas + " moeda(s) de R$ 0.01");*/

        s.close();


    }
}
