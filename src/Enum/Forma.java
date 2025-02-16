package Enum;

public abstract class Forma {
    protected double base;
    protected double altezza;
    protected EForma tipoForma;

    public Forma(double base, double altezza, EForma tipoForma) {
        this.base = base;
        this.altezza = altezza;
        this.tipoForma = tipoForma;
    }

    public abstract void calcoloArea();

    @Override
    public String toString() {
        return "Forma{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }
}
