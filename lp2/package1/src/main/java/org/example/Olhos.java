package org.example;

public class Olhos {

    public int count = 0;
    public String corDosOlhos;
    public String corDosDentes;

    public Olhos(String corDosOlhos, String corDosDentes) {
        this.corDosOlhos = corDosOlhos;
        this.corDosDentes = corDosDentes;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    public void setCorDosDentes(String corDosDentes) {
        this.corDosDentes = corDosDentes;
    }

    public void chorar() {
        count+=1;
        System.out.println("Saíram " + count + " lágrimas\n");
    }

}
