package org.example.outros.objetos.contabancaria.models;

import java.util.List;
import java.util.Scanner;

public class Programa {

    public static final List<String> OPCOES_MENU_HOME = List.of("Login", "Encerrar programa");

    /**
     * Exemplo de menu que este método imprime:
     * <p>
     * 1 - Login<p>
     * 2 - Encerrar programa
     * <p>
     */
    public static void imprimirMenuHome() {

        System.out.println("\n");
        for (String opcao : OPCOES_MENU_HOME) {
            System.out.println((OPCOES_MENU_HOME.indexOf(opcao) + 1) + " - " + opcao);
        }
    }

    public static void executar() {
        Scanner scannerPrograma = new Scanner(System.in);
        Login login = new Login(false);
        int opcaoEscolhida = -1;


        do {

            if (login.temContaLogada()) {
                Login.sessaoAtiva();
            }

            imprimirMenuHome();
            System.out.print("\nDigite a opção desejada: ");
            opcaoEscolhida = scannerPrograma.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    login = new Login(true);
                    break;
                case 2:
                    // System.out.println("\nPrograma finalizado!\n\n");
                    break;
                case 3:

                    System.out.println("==== TESTE ====\n tem alguém logado? " + login.temContaLogada());
                    break;
                default:
                    System.out.println("\nOpção inválida!\n\n");
                    break;
            }

        } while (opcaoEscolhida != 2);

        scannerPrograma.close();
    }

}
