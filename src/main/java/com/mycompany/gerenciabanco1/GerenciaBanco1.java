package com.mycompany.gerenciabanco1;

import java.util.Scanner;

public class GerenciaBanco1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Informe seu nome: ");
            String nome = scanner.nextLine();
            System.out.print("Informe seu sobrenome: ");
            String sobrenome = scanner.nextLine();
            System.out.print("Informe seu CPF: ");
            String cpf = scanner.nextLine();
            
            Cliente cliente = new Cliente(nome, sobrenome, cpf);
            Conta conta = new Conta();

            int opcao;
            do {
                System.out.println("\n--- Menu ---");
                System.out.println("1. Exibir informações do cliente");
                System.out.println("2. Consultar saldo");
                System.out.println("3. Depositar");
                System.out.println("4. Sacar");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1 -> cliente.exibirInformacoes();
                    case 2 -> conta.exibirSaldo();
                    case 3 -> {
                        System.out.print("Informe o valor para depósito: ");
                        double valorDeposito = scanner.nextDouble();
                        conta.depositar(valorDeposito);
                    }
                    case 4 -> {
                        System.out.print("Informe o valor para saque: ");
                        double valorSaque = scanner.nextDouble();
                        conta.sacar(valorSaque);
                    }
                    case 5 -> System.out.println("Obrigado por usar o sistema. Até logo!");
                    default -> System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 5);

        }
    }
}
