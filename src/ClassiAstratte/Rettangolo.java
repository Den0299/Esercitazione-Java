package ClassiAstratte;

// Classe Rettangolo che estende la classe Forma
public class Rettangolo extends Forma {
    // Costruttore che riceve base e altezza e li passa al costruttore della superclasse Forma
    public Rettangolo(double base, double altezza) {
        super(base, altezza);
    }

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
