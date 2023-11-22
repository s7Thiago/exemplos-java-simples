package org.example.outros.testeSstatic;

public class TesteStatic {

    public static void main(String[] args) {

        Animal a1 = new Animal("Cachorro", 2);
        Animal a2 = new Animal("Gato", 3);
        Animal a3 = new Animal("Cavalo", 4);

        a1.especie = "Macaco";
        a3.idade = 7;

        int a = 0;

    }
}


class Animal {
    static String especie;
    int idade;
    public Animal(String especie, int idade) {
        this.especie = especie;
        this.idade = idade;
    }
}