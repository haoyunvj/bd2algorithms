package org.example;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<String> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    public void contratar(String funcionario) {
        funcionarios.add(funcionario);
        System.out.println(funcionario + " foi contratado.");
    }

    public void layoff(String funcionario) {
        if (funcionarios.contains(funcionario)) {
            funcionarios.remove(funcionario);
            System.out.println(funcionario + " foi demitido.");
        } else {
            System.out.println(funcionario + " não encontrado na empresa.");
        }
    }

    public void listarFuncionarios() {
        System.out.println("Funcionários atuais: " + funcionarios);
    }
}
