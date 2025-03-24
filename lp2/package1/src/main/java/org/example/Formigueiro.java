package org.example;

import java.util.ArrayList;
import java.util.List;

public class Formigueiro {
    private String localizacao;
    private List<String> formigas;

    public Formigueiro(String localizacao) {
        this.localizacao = localizacao;
        this.formigas = new ArrayList<>();
    }

    public void adicionarFormiga(String tipo) {
        formigas.add(tipo);
        System.out.println("Uma formiga do tipo " + tipo + " foi adicionada ao formigueiro.");
    }

    public void removerFormiga(String tipo) {
        if (formigas.contains(tipo)) {
            formigas.remove(tipo);
            System.out.println("Uma formiga do tipo " + tipo + " foi removida do formigueiro.");
        } else {
            System.out.println("Nenhuma formiga do tipo " + tipo + " encontrada.");
        }
    }

    public void exibirFormigueiro() {
        System.out.println("Formigueiro localizado em: " + localizacao);
        System.out.println("Número de formigas: " + formigas.size());
        System.out.println("Tipos de formigas: " + formigas);
    }
}
