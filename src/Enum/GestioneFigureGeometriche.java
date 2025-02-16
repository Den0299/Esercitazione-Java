/* Scrivere un programma che contenga una classe chiamata Forma
ed un metodo chiamato calcolaArea() che stampi l'area della forma specifica.
Crea poi due sottoclassi Triangolo e Rettangolo che estendono Forma
e che abbiano un tipo che ne identifichi la Forma in maniera univoca usando una enum. */



package Enum;

public class GestioneFigureGeometriche {
    public static void main(String[] args) {
        Triangolo triangolo = new Triangolo(5, 10, EForma.TRIANGOLO);
        Rettangolo rettangolo = new Rettangolo(7, 12, EForma.RETTANGOLO);

        System.out.println(triangolo);
        triangolo.calcoloArea();

        System.out.println();

        System.out.println(rettangolo);
        rettangolo.calcoloArea();
    }
}
