/*Scrivi un programma che contenga un metodo che prende in ingresso un numero
e il massimo numero di risultati che vuoi avere
e stampi tutti i numeri naturali in ordine inverso
 (quindi se passo il punto di partenza a 6 e gli dico di restituirmi 3 risultati
 mi aspetto in uscita [6 5 4] stampati). */

import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");
        int numero= scanner.nextInt();

        System.out.print("Inserisci il numero di risultati che vuoi avere: ");
        int numResult= scanner.nextInt();

        results(numero, numResult);
    }


    public static void results (int numero, int numResult) {
        for (int i=0; i<numResult; i++ ) {
            System.out.println(numero - i);
        }
    }
}
