package org.example;

public class Orgaos {
    private String nome;
    private String funcao;

    public Orgaos(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    public void exibirInformacoes() {
        System.out.println("Órgão: " + nome + " | Função: " + funcao);
    }

    public void alterarFuncao(String novaFuncao) {
        this.funcao = novaFuncao;
        System.out.println("Nova função do " + nome + ": " + funcao);
    }
}