package org.example.ifb;

/*
* Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.
* */
public class Ifb_Repeticao {

    public static void main(String[] args) {

        int inicio = 1000;

        while (inicio < 1999) {

            if(inicio % 11 == 5) System.out.println(inicio);

            inicio++;
        }
    }

}
