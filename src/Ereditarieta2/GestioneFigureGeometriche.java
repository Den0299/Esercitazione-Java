/* Scrivere un programma che contenga una classe chiamata Forma
ed un metodo chiamato calcolaArea() che stampi l'area della forma.
Crea poi una sottoclasse chiamata Rettangolo
che fa override del metodo calcolaArea() per calcolare l'area del rettangolo. */


package Ereditarieta2;

public class GestioneFigureGeometriche {

    public static void main(String[] args) {
        Forma formaGenerica = new Forma();
        formaGenerica.calcolaArea();

        // Creazione di un oggetto di tipo Rettangolo
        Rettangolo rettangolo = new Rettangolo(5, 3);
        System.out.println(rettangolo);

        // Chiamata al metodo calcolaArea() della sottoclasse Rettangolo
        rettangolo.calcolaArea();
    }

}
