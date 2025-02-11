/* Scrivi un programma che contenga un metodo che crea un array
e lo riempie con dei caratteri.
Questo metodo dovrà poi stampare tutte le occorrenze del carattere a o 0 in caso non ce ne siano. */

public class Array2 {
    public static void main(String[] args) {
        char[] chars = arrayChars();

        System.out.println("Array di caratteri:");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println(); // Aggiunto per andare a capo

        stampaOccorrenze(chars); // Chiamata corretta del metodo
    }

    public static char[] arrayChars() {
        char[] array = new char[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (char) ('a' + Math.random() * 26);
        }
        return array;
    }

    public static void stampaOccorrenze(char[] array) { // Definizione corretta del metodo
        boolean trovato = false;
        for (char c : array) {
            if (c == 'a' || c == '0') {
                System.out.println("Trovata occorrenza di: " + c);
                trovato = true;
            }
        }

        if (!trovato) {
            System.out.println("Nessuna occorrenza di 'a' o '0' trovata nell'array.");
        }
    }
}