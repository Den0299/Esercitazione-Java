/* Scrivi un programma che contenga un metodo che crea un array
e lo riempie con i numeri da 1 a 10
e che calcoli la somma dei numeri contenuti nell'array inizializzato e la stampi a video. */


import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] array = arrayNum();
        int somma = 0;


        System.out.println("Array: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) { //for (int numbers : array) {
            somma += array[i];                   //somma += numbers;
        }
        System.out.println();
        System.out.println("La somma degli elementi contenuti nell'array è uguale a " + somma);
    }

    public static int[] arrayNum() {
        int[] array = new int[10]; //crea un array di 10 elementi
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;

    }
}
