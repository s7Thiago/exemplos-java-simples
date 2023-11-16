package org.example.outros.metodos;

public class Metodos3 {

    public static double converterCF(double temperaturaC) {

        return (temperaturaC * 1.8) + 32;
    }

    public static double converterFC(double temperaturaF) {

        return (temperaturaF - 32) / 1.8;
    }

    public static void main(String[] args) {

        double temperaturaC = 37;

        double temperaturaF = converterCF(temperaturaC);
        double temperaturaC2 = converterFC(temperaturaF);

        System.out.printf("\nTemperatura: %.2f\n\n", converterCF(37)    );

    }
}
