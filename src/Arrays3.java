/* Scrivere un programma che contenga un metodo
che permetta di sostituire gli elementi duplicati in un array di interi con il valore -1.
L'array ottenuto dovrà essere stampato a video. */

public class Arrays3 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 1, 6, 3}; // Esempio di array con duplicati

        sostituisciDuplicati(array);

        System.out.println("Array con duplicati sostituiti:");
        stampaArray(array);
    }

    public static void sostituisciDuplicati(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = -1; // Sostituisce l'elemento duplicato con -1
                }
            }
        }
    }

    public static void stampaArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Va a capo dopo aver stampato l'array
    }
}

