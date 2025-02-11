/*Scrivere un programma che contenga un metodo che sfrutti il while loop
e prenda in ingresso 1 valore intero come limite superiore
e calcoli la somma di tutti i valori prima del limite e la stampi a video.*/


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();

        int operazione = sommaValori(numero);
        System.out.println("La somma dei valori da 1 a " + numero +" (escluso)"  + " è: " +operazione);

    }

    public static int sommaValori(int numero) {
        int i = 1;
        int somma=0;

        while (i < numero) {
            somma += i;
            i++;

        }
        return somma;
    }
}