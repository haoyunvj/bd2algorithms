package org.example;

public class Floresta {

    public int counter = 0;

    public String rio;
    public String bioma;
    public String animais;

    public Floresta(String rio, String bioma, String animais) {
        this.rio = rio;
        this.bioma = bioma;
        this.animais = animais;
    }

    public void contarArvores() {
        System.out.println("Já contei " + counter + " árvores\n");
    }

    public void setRio(String rio) {
        this.rio = rio;
    }

    public void tipoAnimal() {
        switch
            (animais) {
            case "Mamifero": System.out.println("Muito perigoso\n");
            break;
            case "Inseto": System.out.println("Pouco perigoso\n");
            break;
            case "Anfibio", "Anfíbio": System.out.println("Pouco perigoso\n");
            break;
            case "Réptil", "Reptil": System.out.println("Pouco perigoso\n");
        }
    }
}
