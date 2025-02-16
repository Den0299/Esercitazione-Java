package Enum;

public class Rettangolo extends Forma {

    public Rettangolo(double base, double altezza, EForma tipoForma) {
        super(base, altezza, EForma.RETTANGOLO);
    }

    @Override
    public void calcoloArea() {
        System.out.println("L'area del " +tipoForma + " è: "+ (base * altezza));
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }
}
