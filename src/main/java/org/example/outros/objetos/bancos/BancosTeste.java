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

        Conta conta1 = new Conta("123456", "0001", 1000.00, new ArrayList<>(), titular1);
        Conta conta2 = new Conta("891012", "2300", 3000.00, new ArrayList<>(), titular2);

        // Preenchendo o meu extrato (conta2)
        Movimentacao m1 = new Movimentacao(1000.00, "Depósito");

        conta2.extrato.add(m1);

        Banco banco1 = new Banco("NuBanck", "56566546", new ArrayList<>());
        Banco banco2 = new Banco("BabiDi", "54586487", null);

        banco1.contas.add(conta1);
        banco1.contas.add(conta2);

        bancos.add(banco1);
        bancos.add(banco2);

        RedeBancos rede = new RedeBancos("Meus Bancos", "789544", bancos);
    }
}
