package org.example.becrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bee_1051 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        /*
         *
         * R$ 0.00 - R$ 2000.00      - Isento
         * R$ 2000.01 - R$ 3000.00   - 8%
         * R$ 3000.01 - R$ 4500.00   - 18%
         * acimna de R$ 4500.00      - 28%
         *
         * */

        float renda = s.nextFloat();
        float imposto = 0;
        String mensagem = "";

        if (renda <= 2000) {
            mensagem = "Isento";

        } else if (renda > 2000 && renda <= 3000) {
            imposto = (renda - 2000) * 0.08f;

        } else if (renda > 3000 && renda <= 4500) {
            imposto = ((renda - 3000) * 0.18f) + 80;

        } else {
            imposto = ((renda - 4500) * 0.28f) + 350;
        }

        if(imposto > 0) {
            mensagem = String.format("R$ %.2f", imposto);
        }

        System.out.println(mensagem);

        s.close();

    }
}
