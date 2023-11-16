package org.example.outros.metodos;

public class Metodos4 {

    public static boolean senhaValida(String senha) {
        return senha.equals("147258");
    }

    public static void main(String[] args) {

        String senhaInformada = "147258";

        if(senhaValida(senhaInformada)) {
            System.out.printf("\nA senha %s está correta\n\n", senhaInformada);
        } else {
            System.out.printf("\nA senha %s NÃO está correta\n\n", senhaInformada);
        }
    }
}
