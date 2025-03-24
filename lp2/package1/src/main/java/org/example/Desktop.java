package org.example;

public class Desktop {

        String computador;
        String teclado;
        String mouse;

        public Desktop(String computador, String teclado, String mouse) {
            this.computador = computador;
            this.teclado = teclado;
            this.mouse = mouse;
        }

        public void ligarComputador() {
            System.out.println("\nLigando computador...\n");
        }

        public String getModeloTeclado() {
            return teclado;
        }

        public void setModeloTeclado(String teclado) {
            this.teclado = teclado;
        }

        public String getModeloMouse() {
            return mouse;
        }

        public void setModeloMouse(String mouse) {
            this.mouse = mouse;
        }

        public void exibirDetalhes() {
            System.out.println("Computador: " + computador);
            System.out.println("Teclado: " + teclado);
            System.out.println("Mouse: " + mouse + "\n");
        }

}
