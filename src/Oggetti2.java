/* Scrivere un programma che contenga una classe che definisce un Auto
che abbia come proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto. */


public class Oggetti2 {
    public static void main(String[] args) {
        Auto auto1 = new Auto(2.0, "AB123CD", "Fiat", "Panda");

        System.out.println("Le caratteristiche di questa auto sono: " + auto1);

        auto1.setCilindrata(1.5);
        auto1.setTarga("EF456GH");
        auto1.setMarca("Ford");
        auto1.setModello("Focus");
        System.out.println("Le caratteristiche di questa auto sono: " + auto1);


    }
}

class Auto {
    private double cilindrata;
    private String targa;
    private String marca;
    private String modello;

    public Auto(double cilindrata, String targa, String marca, String modello) {
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
    }

    public double getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(double cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    @Override
    public String toString() {
        return "Cilindrata: " + cilindrata + " Targa: " + targa + " Marca: " + marca + " Modello: " + modello;
    }
}
