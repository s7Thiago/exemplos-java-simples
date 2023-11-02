package org.example.becrowd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bee_1009_Rodrigo {
    public static void main(String[] args) {

        Scanner Div = new Scanner(System.in);

        double pagamento1 = 500.00;
        double vendas1 = 1230.30;
        double comissão1 = 0.15 * 1230.30;
        double João = pagamento1 + comissão1;

        double pagamento2 = 1700.00;
        double vendas2 = 1230.50;
        double comissão2 = 0.15 * 1230.50;
        double Pedro = pagamento2 + comissão2;

        double pagamento3 = 700.00;
        double vendas3 = 0;
        double comissão3 = 0.15 * 0;
        double Gustavo = pagamento3 + comissão3;

        /**
         *   João R$ 684.54
         *   Pedro R$ 700.00
         *   Gustavo R$ 1884.56
         **/


        List<Double> Nomes = new ArrayList<Double>();
        Nomes.add(684.54);
        Nomes.add(700.00);
        Nomes.add(1884.58);

        int salario = Div.nextInt();
        int Salario = Div.nextInt();
        String resultado = String.format("%.2f", (Nomes.get(salario -1)) * Salario);

        System.out.println("salario : R$" + resultado);

    }
}
