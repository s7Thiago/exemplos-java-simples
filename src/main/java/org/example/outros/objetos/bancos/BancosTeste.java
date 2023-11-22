package org.example.outros.objetos.bancos;

import org.example.outros.objetos.bancos.models.Banco;
import org.example.outros.objetos.bancos.models.Cliente;
import org.example.outros.objetos.bancos.models.Conta;
import org.example.outros.objetos.bancos.models.Movimentacao;
import org.example.outros.objetos.bancos.models.RedeBancos;

import java.util.*;

public class BancosTeste {
    public static void main(String[] args) {

        List<Banco> bancos = new ArrayList<>();

        Cliente titular1 = new Cliente("Babi", "123456789");
        Cliente titular2 = new Cliente("Jassiara", "33215474");
        Cliente titular3 = new Cliente("Roberta", "4565132165");
        Cliente titular4 = new Cliente("Enemergina", "351313253");
        Cliente titular5 = new Cliente("Marinaldo", "784645132");

        Conta conta1 = new Conta("123456", "0001", 1000.00, new ArrayList<>(), titular1);
        Conta conta2 = new Conta("891012", "2300", 3000.00, new ArrayList<>(), titular2);

        // Preenchendo o meu extrato (conta2)
        Movimentacao m1 = new Movimentacao(1000.00, "Depósito");

        conta2.extrato.add(m1);

        Banco banco1 = new Banco("NuBanck", "56566546", new ArrayList<>());
        Banco banco2 = new Banco("BabiDi", "54586487", new ArrayList<>());

        banco1.contas.add(conta1);
        banco1.contas.add(conta2);

        banco2.contas.add(new Conta("2255220", "0001", 3570, new ArrayList<>(), titular3));
        banco2.contas.add(new Conta("2255221", "0001", 3570, new ArrayList<>(), titular4));
        banco2.contas.add(new Conta("2255222", "0001", 3570, new ArrayList<>(), titular5));

        bancos.add(banco1);
        bancos.add(banco2);

        RedeBancos rede = new RedeBancos("Meus Bancos", "789544", bancos);


        System.out.println("Quantas contas tem o banco1? " + banco1.qtdeContas());
        System.out.println("Quantas contas tem na rede? " + rede.qtdeContas2());
        System.out.println("Quanto de saldo tem somando o saldo de todas as contas do banco1? " + banco1.saldoTotal());
        System.out.println("Quanto de saldo tem na rede inteira? " + rede.saldoTotal());

    }
}
