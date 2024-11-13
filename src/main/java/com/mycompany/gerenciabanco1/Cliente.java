package com.mycompany.gerenciabanco1;

public class Cliente {
    // Torne os campos finais, pois não devem ser alterados após a inicialização
    private final String nome;
    private final String sobrenome;
    private final String cpf;

    // Construtor
    public Cliente(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    // Método para exibir as informações do cliente
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("CPF: " + cpf);
    }
}
