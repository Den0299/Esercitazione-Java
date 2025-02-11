/*Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
e restituisca la tabellina aritmetica di quel numero che dovrà essere stampata a video.*/


import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();

        creaTabellina(numero);

        scanner.close();

    }

    public static void creaTabellina(int num) {
        System.out.println("La tabellina di " +num + " è:");

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " * " +i + " = " +num*i);
        }

    }
}