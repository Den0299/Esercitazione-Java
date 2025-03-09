/* Scrivere un programma che contenga una classe chiamata Forma
ed un metodo chiamato calcolaArea() che stampi l'area della forma.
Crea poi una sottoclasse chiamata Rettangolo
che fa override del metodo calcolaArea() per calcolare l'area del rettangolo. */

/* A partire dal programma creato precedentemente in cui si richiedeva il calcolo dell'area,
aggiungere una ulteriore classe chiamata Triangolo
supportando poi il calcolo dell'area per quest'ultima figura. */


package ereditarieta2;

public class GestioneFigureGeometriche {

    public static void main(String[] args) {
        // Creazione di un oggetto di tipo Rettangolo
        Rettangolo rettangolo = new Rettangolo(5, 3);
        System.out.println(rettangolo);

        // Chiamata al metodo calcolaArea() della sottoclasse Rettangolo nella stampa
        System.out.println("L'area del rettangolo è: " + rettangolo.calcolaArea());

        // Creazione di un oggetto di tipo Triangolo
        Triangolo triangolo = new Triangolo(4, 6);
        System.out.println(triangolo);

        // Chiamata al metodo calcolaArea() della sottoclasse Triangolo nella stampa
        System.out.println("L'area del triangolo è: " + triangolo.calcolaArea());


    }

}
