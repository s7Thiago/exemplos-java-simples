package org.example.becrowd;

import java.util.Scanner;

public class Bee_2763 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cpf = sc.next();

        String[] cpfArray = cpf.split("\\.");

        for(int i =0; i < cpfArray.length; i++) {

            if(i == cpfArray.length - 1) {
                System.out.println(cpfArray[i].split("-")[0]);
                System.out.println(cpfArray[i].split("-")[1]);
            } else {
                System.out.println(cpfArray[i]);
            }
        }

        System.out.println("\n");
        sc.close();
    }
}
