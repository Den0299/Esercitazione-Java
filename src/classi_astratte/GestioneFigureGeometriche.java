/* Scrivere un programma che contenga una classe astratta chiamata Forma
ed un metodo astratto chiamato calcolaArea().
Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma
ed implementano il metodo per il calcolo dell'area in maniera specifica. */



package classi_astratte;

public class GestioneFigureGeometriche {
    public static void main(String[] args) {
        // Creazione di un oggetto di tipo Rettangolo
        Rettangolo rettangolo = new Rettangolo(5, 10);

        // Creazione di un oggetto di tipo Triangolo
        Triangolo triangolo = new Triangolo(7, 12);

        System.out.println(rettangolo + "\nArea del rettangolo: " + rettangolo.calcolaArea() );
        System.out.println(triangolo + "\nArea del triangolo: " + triangolo.calcolaArea() );

    }
}
