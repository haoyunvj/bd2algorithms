package org.example;

public class Operacoes {
    private int numerador;
    private int denominador;

    public Operacoes(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("O denominador não pode ser zero!");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    public Operacoes somar(Operacoes outra) {
        int novoNumerador = (this.numerador * outra.denominador) + (outra.numerador * this.denominador);
        int novoDenominador = this.denominador * outra.denominador;
        return new Operacoes(novoNumerador, novoDenominador);
    }

    public Operacoes subtrair(Operacoes outra) {
        int novoNumerador = (this.numerador * outra.denominador) - (outra.numerador * this.denominador);
        int novoDenominador = this.denominador * outra.denominador;
        return new Operacoes(novoNumerador, novoDenominador);
    }

    public Operacoes multiplicar(Operacoes outra) {
        int novoNumerador = this.numerador * outra.numerador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Operacoes(novoNumerador, novoDenominador);
    }

    public Operacoes dividir(Operacoes outra) {
        if (outra.numerador == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        int novoNumerador = this.numerador * outra.denominador;
        int novoDenominador = this.denominador * outra.numerador;
        return new Operacoes(novoNumerador, novoDenominador);
    }

    private void simplificar() {
        int mdc = calcularMDC(numerador, denominador);
        numerador /= mdc;
        denominador /= mdc;

        // Garantindo que o denominador não seja negativo
        if (denominador < 0) {
            numerador = -numerador;
            denominador = -denominador;
        }
    }

    private int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public void exibirFração() {
        System.out.println(numerador + "/" + denominador);
    }
}
