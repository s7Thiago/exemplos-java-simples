package org.example.becrowd;

import java.util.Scanner;

public class Bee_1052 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int mes = s.nextInt();

        String[] meses = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println(meses[mes - 1]);

    }
}
