package ClassiAstratte;

public abstract class Forma {
    double base;
    double altezza;

    public Forma(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public abstract double calcolaArea();

    @Override
    public abstract String toString();
}
