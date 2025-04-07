package com.mycompany.gerenciabanco1;

public class Conta {
    private double saldo;

    // Construtor
    public Conta() {
        this.saldo = 0.0; 
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para o saque.");
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }
}
