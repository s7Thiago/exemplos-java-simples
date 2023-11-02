package org.example.becrowd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bee_1016 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        int horas = 2;
        int distancia = x.nextInt() * horas;
        String saida = String.format("%d", distancia);

        System.out.println(saida + " minutos");

    }
}