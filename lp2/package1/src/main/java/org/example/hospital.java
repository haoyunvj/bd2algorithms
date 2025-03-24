package org.example;

import java.util.ArrayList;
import java.util.List;

class Hospital {
    private String nome;
    private List<String> pacientes;

    public Hospital(String nome) {
        this.nome = nome;
        this.pacientes = new ArrayList<>();
    }

    public void admitirPaciente(String paciente) {
        pacientes.add(paciente);
        System.out.println("O paciente \"" + paciente + "\" foi admitido no hospital.");
    }

    public void darAltaPaciente(String paciente) {
        if (pacientes.contains(paciente)) {
            pacientes.remove(paciente);
            System.out.println("O paciente \"" + paciente + "\" recebeu alta do hospital.");
        } else {
            System.out.println("O paciente \"" + paciente + "\" não foi encontrado no hospital.");
        }
    }

    public void listarPacientes() {
        System.out.println("Hospital: " + nome);
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente internado.");
        } else {
            System.out.println("Pacientes internados: " + pacientes);
        }
    }
}
