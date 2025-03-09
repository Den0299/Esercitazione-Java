/* Scrivere un programma che contenga una interfaccia Forma
ed un metodo chiamato calcolaArea().
Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma
ed implementano il metodo per il calcolo dell'area.
 */



package interfacce;

public class GestioneFigureGeometriche {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(7, 14);
        Triangolo triangolo = new Triangolo(3, 9);

        System.out.println(rettangolo + "\nArea del rettangolo: " + rettangolo.calcolaArea() );
        System.out.println(triangolo + "\nArea del triangolo: " + triangolo.calcolaArea() );





    }
}
