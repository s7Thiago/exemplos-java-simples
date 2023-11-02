package org.example.outros;

import java.util.Arrays;

public class WhileExample {

    public static void main(String[] args) {

        // Array
        Byte[] x = new Byte[25];
        x[0] = 14;
        // x[1] = -2;
        x[2] = 127;
        x[3] = -100;
        // x[4] = 81;
        x[17] = 28;

        int a = 0;
        do {
            System.out.println(x[a]);
            a++;
        } while (a < x.length);

    }

}
