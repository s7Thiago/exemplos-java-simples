package org.example.outros.metodos;

public class Metodos1 {


    // Soma
    public static int soma(int numeroA, int numeroB) {

        return numeroA + numeroB;
    }

    // Subtração
    public static int sub(int numeroA, int numeroB) {

        return numeroA - numeroB;
    }

    // Divisão
    public static int div(int numeroA, int numeroB) {

        return numeroA / numeroB;
    }

    // Multiplicação
    public static int mult(int numeroA, int numeroB) {

        return numeroA * numeroB;
    }

    /**
     * Operação
     * 1: Soma
     * 2: Subtração
     * 3: Divisão
     * 4: Multiplicação
     * */
    public static int calc(int a, int b, int operacao) {

        switch (operacao) {
            case 1:
                return soma(a, b);
            case 2:
                return sub(a, b);
            case 3:
                return div(a, b);
            case 4:
                return mult(a, b);
            default:
                return 0;
        }
    }


    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int resultado = 0;

        resultado = calc(b, a, 2);

        System.out.printf("\nResultado: %s\n\n", resultado);

    }

}
