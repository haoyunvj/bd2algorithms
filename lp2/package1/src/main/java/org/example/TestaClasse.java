package org.example;

import java.util.Scanner;

public class TestaClasse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n======= MENU =======");
            System.out.println("1 - Testar Computador");
            System.out.println("2 - Testar Olhos");
            System.out.println("3 - Testar Floresta");
            System.out.println("4 - Testar Empresa");
            System.out.println("5 - Testar Órgãos");
            System.out.println("6 - Testar Operações Matemáticas");
            System.out.println("7 - Testar Formigueiro");
            System.out.println("8 - Testar Biblioteca");
            System.out.println("9 - Testar Parque Aquático");
            System.out.println("10 - Testar Hospital");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1 -> testarComputador();
                case 2 -> testarOlhos();
                case 3 -> testarFloresta();
                case 4 -> testarEmpresa();
                case 5 -> testarOrgaos();
                case 6 -> testarOperacoes();
                case 7 -> testarFormigueiro();
                case 8 -> testarBiblioteca();
                case 9 -> testarParqueAquatico();
                case 10 -> testarHospital();
                case 0 -> System.out.println("Saindo do programa...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    // Métodos de teste (mantidos do seu código original)

    public static void testarComputador() {
        Desktop meudesktop = new Desktop("Aspiron 15", "Teclado Magnético", "Mouse G502 Hero");
        meudesktop.ligarComputador();
        meudesktop.exibirDetalhes();
        meudesktop.setModeloTeclado("Teclado Mecânico");
        meudesktop.exibirDetalhes();
    }

    public static void testarOlhos() {
        Olhos perfil = new Olhos("Castanhos", "Brancos");
        perfil.setCorDosDentes("Amarelos");
        perfil.setCorDosOlhos("Verdes");
        perfil.chorar();
        perfil.chorar();
    }

    public static void testarFloresta() {
        Floresta amazonica = new Floresta("Amazonas", "Tropical", "Selvagens");
        amazonica.contarArvores();
        amazonica.tipoAnimal();
    }

    public static void testarEmpresa() {
        Empresa embraer = new Empresa();
        embraer.contratar("Carlos");
        embraer.contratar("Ana");
        embraer.listarFuncionarios();
        embraer.layoff("Ana");
        embraer.listarFuncionarios();
    }

    public static void testarOrgaos() {
        Orgaos coracao = new Orgaos("Coração", "Bombear sangue");
        Orgaos pulmao = new Orgaos("Pulmão", "Troca gasosa");
        coracao.exibirInformacoes();
        pulmao.exibirInformacoes();
    }

    public static void testarOperacoes() {
        Operacoes f1 = new Operacoes(3, 4);
        Operacoes f2 = new Operacoes(2, 6);
        System.out.print("Soma: ");
        f1.somar(f2).exibirFração();
        System.out.print("Subtração: ");
        f1.subtrair(f2).exibirFração();
    }

    public static void testarFormigueiro() {
        Formigueiro formigueiro = new Formigueiro("Floresta Amazônica");
        formigueiro.adicionarFormiga("Soldado");
        formigueiro.adicionarFormiga("Rainha");
        formigueiro.exibirFormigueiro();
    }

    public static void testarBiblioteca() {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        biblioteca.adicionarLivro("Dom Casmurro");
        biblioteca.adicionarLivro("O Pequeno Príncipe");
        biblioteca.exibirLivros();
    }

    public static void testarParqueAquatico() {
        ParqueAquatico parque = new ParqueAquatico("AquaWorld");
        parque.adicionarAtracao("Toboágua Gigante");
        parque.adicionarAtracao("Piscina de Ondas");
        parque.exibirAtracoes();
    }

    public static void testarHospital() {
        Hospital hospital = new Hospital("Santa Cruz");
        hospital.admitirPaciente("João Silva");
        hospital.admitirPaciente("Maria Oliveira");
        hospital.listarPacientes();
    }
}
