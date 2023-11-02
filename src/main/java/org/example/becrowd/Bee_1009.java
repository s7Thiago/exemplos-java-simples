package org.example.becrowd;

import java.util.Scanner;

public class Bee_1009 {
    public static void main(String[] args) {

        // Variável que permite receber dados do terminal
        Scanner sc = new Scanner(System.in);

        // Variáveis principais do fluxo
        String nome;
        double salarioFixo;
        double montanteVendas;

        // Esperando o usuário do terminal digitar os valores
        nome = sc.next();
        salarioFixo = sc.nextDouble();
        montanteVendas = sc.nextDouble();

        // Como os valores já foram lidos, fecha o scanner para não ficar consumindo memória desnecessariamente
        sc.close();

        // Armazena o valor calculado da comissão do vendedor ( 15% do montante de vendas )
        double comissao = montanteVendas * 0.15;

        // Imprime o total do salário com a comissão no terminal, com 2 casas decimais de precisão
        System.out.printf("TOTAL = R$ %.2f\n", salarioFixo + comissao);

    }
}
