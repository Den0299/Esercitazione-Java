package Ereditarieta2;

// Sottoclasse Rettangolo che estende Forma
public class Rettangolo extends Forma {

    private double base;
    private double altezza;

    // Costruttore per inizializzare base e altezza
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }


    // Override del metodo calcolaArea per calcolare l'area del rettangolo
    @Override
    public double calcolaArea() {
        return base * altezza;
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }
}
