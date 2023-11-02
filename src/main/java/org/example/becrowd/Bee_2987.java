package org.example.becrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bee_2987 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next().codePointAt(0) - '@');

        sc.close();
    }
}
