package org.example.outros.objetos.contabancaria.models;

public class Conta {
    public Titular titular;
    public double saldo;

    // construtor
    public Conta(Titular titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Depositar
    public void depositar(double valor) {
        this.saldo += valor;
    }

    // Scacar
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    // Transferir
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

}
