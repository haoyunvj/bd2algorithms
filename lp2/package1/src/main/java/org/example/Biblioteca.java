package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<String> livros;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String livro) {
        livros.add(livro);
        System.out.println("O livro \"" + livro + "\" foi adicionado à biblioteca.");
    }

    public void removerLivro(String livro) {
        if (livros.contains(livro)) {
            livros.remove(livro);
            System.out.println("O livro \"" + livro + "\" foi removido da biblioteca.");
        } else {
            System.out.println("O livro \"" + livro + "\" não foi encontrado na biblioteca.");
        }
    }

    public void exibirLivros() {
        System.out.println("Biblioteca: " + nome);
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro disponível.");
        } else {
            System.out.println("Livros disponíveis: " + livros);
        }
    }
}