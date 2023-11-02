package org.example.ifb;

/*
* https://docentes.ifrn.edu.br/nickersonferreira/disciplinas/fundamentos-de-logica-e-algoritmos-1o-ano-info/lista-de-exercicios-repeticao/view
*
* 2) Escreva um algoritmo que calcule a soma dos números de 1 a 15.
*
* SOLUÇÃO COM FOR
**/

public class SomaRepeticao {

    public static void main(String[] args) {
        int resultado = 0;

        for (int i = 0; i <= 15; i++) {
            resultado += i;
        }
        
        System.out.println("Resultado: " + resultado);
    }
}
