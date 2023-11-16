package org.example.outros.objetos.bancos.models;

import java.util.List;

public class Conta {
    public String conta;
    public String agencia;
    public double saldo;
    public List<Movimentacao> extrato;
    public Cliente titular;

    public Conta(
            String conta,
            String agencia,
            double saldo,
            List<Movimentacao> extrato,
            Cliente titular) {

                this.conta = conta;
                this.agencia = agencia;
                this.saldo = saldo;
                this.extrato = extrato;
                this.titular = titular;

    }

}
