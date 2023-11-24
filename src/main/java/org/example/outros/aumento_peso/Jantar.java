package org.example.outros.aumento_peso;

import org.example.outros.objetos.contabancaria.models.Conta;

import java.util.List;
import java.util.Scanner;

public class Jantar {

    public static final List<String> OPCOES_MENU_INICIAL = List.of("comer", "exercitar", "encerrar");

    public static void imprimirMenu() {
        for (String opcao : OPCOES_MENU_INICIAL) {
            System.out.println((OPCOES_MENU_INICIAL.indexOf(opcao) + 1) + " - " + opcao);
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcao = -1;

        Pessoa pessoa = new Pessoa("João", 90);

        List<Comida> comidas = List.of(
                new Comida("Arroz", 0.2),
                new Comida("Feijão", 0.3),
                new Comida("Batata", 0.4)
        );


        do {

            imprimirMenu();
            System.out.print("Escolha: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:

                    // Lista as comidas na tela
                    for (Comida comida : comidas) {
                        System.out.println((comidas.indexOf(comida) + 1) + " - " + comida.nome);
                    }

                    System.out.print("\nEscolha uma comida:");
                    int opcaoComida = entrada.nextInt();
                    Comida comidaEscolhida = comidas.get(opcaoComida - 1);

                    System.out.println("Comendo...");
                    pessoa.comer(comidaEscolhida);

                    System.out.println(pessoa);


                    break;
                case 2:
                    System.out.println("Exercitando...");
                    pessoa.exercitar();
                    System.out.println(pessoa);
                    break;
                case 3:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }


        } while (opcao != 3);

        System.out.println("Fim do programa!");

    }
}
