package org.example;

import java.util.ArrayList;
import java.util.List;

class ParqueAquatico {

    private String nome;
    private List<String> atracoes;

    // Construtor
    public ParqueAquatico(String nome) {
        this.nome = nome;
        this.atracoes = new ArrayList<>();
    }

    public void adicionarAtracao(String atracao) {
        atracoes.add(atracao);
        System.out.println("A atração \"" + atracao + "\" foi adicionada ao parque aquático.");
    }

    public void removerAtracao(String atracao) {
        if (atracoes.contains(atracao)) {
            atracoes.remove(atracao);
            System.out.println("A atração \"" + atracao + "\" foi removida do parque aquático.");
        } else {
            System.out.println("A atração \"" + atracao + "\" não foi encontrada no parque aquático.");
        }
    }

    public void exibirAtracoes() {
        System.out.println("Parque Aquático: " + nome);
        if (atracoes.isEmpty()) {
            System.out.println("Nenhuma atração disponível.");
        } else {
            System.out.println("Atrações disponíveis: " + atracoes);
        }
    }
}