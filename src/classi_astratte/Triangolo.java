package classi_astratte;

// Classe Triangolo che estende la classe Forma
public class Triangolo extends Forma {
    // Costruttore che riceve base e altezza e li passa al costruttore della superclasse Forma
    public Triangolo(double base, double altezza) {
        super(base, altezza);
    }

    @Override
    public double calcolaArea() {
        return (base * altezza) / 2;
    }

    @Override
    public String toString() {
        return "Triangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }
}
