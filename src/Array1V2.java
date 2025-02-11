import java.util.Arrays;

public class Array1V2 {
    public static void main(String[] args) {
        int[] array= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int somma= 0;

        for (int i=0; i < array.length; i++) {
            array[i]= i+1;
        }
        System.out.println("Array: " + Arrays.toString(array));


        for (int i = 0; i < array.length; i++) {
            somma += array[i];
        }
        System.out.println();
        System.out.println("La somma degli elementi contenuti nell'array è uguale a " +somma);
    }

}