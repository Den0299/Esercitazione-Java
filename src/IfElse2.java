/*Scrivi un programma che calcoli la lunghezza di una stringa,
sulla base di questa lunghezza stampi
"Lunghezza maggiore di 10", "Lunghezza minore di 10" o "Lunghezza pari a 10".*/


import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci frase: ");
        String testo= scanner.nextLine();
        int lunghezzaTesto= testo.length();

        if (lunghezzaTesto > 10) {
            System.out.println("Lunghezza maggiore di 10");
        } else if (lunghezzaTesto < 10) {
            System.out.println("Lunghezza minore di 10");
        } else System.out.println("Lunghezza pari a 10");

    }

}
