package org.example.outros.objetos.contabancaria.models;

import java.util.List;
import java.util.Scanner;

public class Login {
    public static final List<String> OPCOES_MENU_LOGADO = List.of("Depositar", "Sacar", "Transferir", "Logout");
    public static Conta contaLogada;
    private static final List<Conta> CONTAS = List.of( // Contas disponíveis para login
            new Conta(new Titular("João", "11111111111", "1122"), 1000),
            new Conta(new Titular("Maria", "22222222222", "2233"), 1500),
            new Conta(new Titular("José", "33333333333", "3344"), 100)
    );

    /**
     * Exemplo de menu que este método imprime:
     * <p>
     * 1 - Depositar<p>
     * 2 - Sacar<p>
     * 3 - Transferir<p>
     * 4 - Logout
     * <p>
     */
    public static void imprimirMenuLogado(Conta contaLogada) {

        System.out.println("\nBem-vindo(a), " + contaLogada.titular.nome);
        System.out.println("Saldo: " + contaLogada.saldo + "\n");
        for (String opcao : OPCOES_MENU_LOGADO) {
            System.out.println((OPCOES_MENU_LOGADO.indexOf(opcao) + 1) + " - " + opcao);
        }
    }

    private static Conta escolherConta() {
        Scanner scannerPrograma = new Scanner(System.in);

        // Lista as contas disponíveis para transferência
        for (Conta conta : CONTAS) {
            System.out.println(CONTAS.indexOf(conta) + " - " + conta.titular.nome);
        }

        System.out.print("\nPara quem? ");
        int opcaoEscolhida = scannerPrograma.nextInt();

        return CONTAS.get(opcaoEscolhida);
    }

    // construtor
    public Login(boolean logar) {
        if (logar) {
            Scanner scannerLogin = new Scanner(System.in);
            String cpf;
            String senha;

            imprimirMensagem("Login");
            System.out.print("Digite o CPF: ");
            cpf = scannerLogin.next();

            System.out.print("Digite a senha: ");
            senha = scannerLogin.next();

            for (Conta conta : CONTAS) {
                if (conta.titular.cpf.equals(cpf) && conta.titular.senha.equals(senha)) {
                    this.contaLogada = conta;
                    break;
                }

                // Se credenciais incorretas forem digitada
                if (conta.equals(CONTAS.get(CONTAS.size() - 1))) {
                    System.out.println("\nCPF ou senha incorretos!\n\n");
                }
            }

            // scannerLogin.close();
        }
    }

    public static void imprimirMensagem(String mensagem) {

        System.out.println();
        for (int i = 0; i < mensagem.length(); i++) {
            System.out.print("=");
        }

        System.out.printf("\n%s\n", mensagem);

        for (int i = 0; i < mensagem.length(); i++) {
            System.out.print("=");
        }
        System.out.println("\n");
    }

    public static void logout() {
        contaLogada = null;
    }

    public boolean temContaLogada() {
        return this.contaLogada != null;
    }

    public static void sessaoAtiva() {
        Scanner scannerPrograma = new Scanner(System.in);
        int opcaoEscolhida;

        do {
            imprimirMenuLogado(contaLogada);

            System.out.print("\nO que você quer fazer? ");
            opcaoEscolhida = scannerPrograma.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    imprimirMensagem("Depositar");
                    System.out.print("Digite o valor: ");
                    contaLogada.depositar(scannerPrograma.nextDouble());
                    break;
                case 2:
                    imprimirMensagem("Sacar");
                    System.out.print("Digite o valor: ");
                    contaLogada.sacar(scannerPrograma.nextDouble());
                    break;
                case 3:
                    imprimirMensagem("Transferir");
                    Conta contaDestino = escolherConta();

                    System.out.printf("(Transferindo para \"%s\") Digite o valor: ", contaDestino.titular.nome);
                    double valor = scannerPrograma.nextDouble();

                    contaLogada.transferir(valor, contaDestino);
                    break;
                case 4:
                    imprimirMensagem("Logout...");
                    logout();
                    break;
                default:
                    imprimirMensagem("Opção inválida!");
                    break;
            }

            System.out.print("\nDigite a opção desejada: ");
        } while (opcaoEscolhida != 4);


    }

}
