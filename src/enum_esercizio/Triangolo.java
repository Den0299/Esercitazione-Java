package enum_esercizio;

public class Triangolo extends Forma {

    public Triangolo(double base, double altezza, EForma tipoForma) {
        super(base, altezza, tipoForma);
    }

    @Override
    public void calcoloArea() {
        System.out.println("L'area del " +tipoForma + " è: " + (base * altezza) / 2);
    }

    @Override
    public String toString() {
        return "Triangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }

}
