package org.example.becrowd;

import java.util.Scanner;

public class Bee_1008 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        int numeroFuncionario = s.nextInt();
        int horasTranbalhadas = s.nextInt();
        double valorHora = s.nextDouble();
        double salario = horasTranbalhadas * valorHora;

        double valor = Math.PI;

        String saida = String.format("\n\nNUMBER = %d\nSALARY = U$ %.2f\n\n", numeroFuncionario, salario);

        System.out.println(saida);


    }
}
