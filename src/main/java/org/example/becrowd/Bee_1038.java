package org.example.becrowd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bee_1038 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /**
         * 1    Cachorro Quente    R$ 4,00
         * 2    X-Salada           R$ 4,50
         * 3    X-Bacon            R$ 5,00
         * 4    Torrada Simples    R$ 2,00
         * 5    Refrigerante       R$ 1,50
         **/

        List<Double> valores = new ArrayList<>();
        valores.add(4.0);
        valores.add(4.5);
        valores.add(5.0);
        valores.add(2.0);
        valores.add(1.5);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        String resultado = String.format("%.2f", (valores.get(codigo - 1)) * quantidade);

        System.out.println("Total: R$ " + resultado.replaceAll(",", "."));

    }
}