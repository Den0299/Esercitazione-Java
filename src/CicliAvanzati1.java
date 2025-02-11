/*Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
e stampa tutti i numeri fino al valore immesso,
la stampa dovrà interrompersi se il valore è uguale a 5.
 */


import java.util.Scanner;

public class CicliAvanzati1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();

        valori(numero);

        scanner.close();
    }

    public static void valori(int numero) {

        for (int i = 0; i <= numero; i++) {
            System.out.println(i);
            if (i == 5)
                break;

        }
    }
}
