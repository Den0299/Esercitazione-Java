/*Scrivere un programma che dato un valore inserito dall'utente o dichiarato in una variabile,
utilizzi un metodo che per i multipli di 3 stampi "Fizz" al posto del numero
e per i multipli di 5 stampi "Buzz".
Nel caso in cui un numero sia multiplo di entrambi stampi "FizzBuzz".*/

import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int numero= scanner.nextInt();

        if ((numero % 3 == 0) && (numero % 5 == 0)) {
            System.out.println("FizzBuzz");
        } else if (numero % 3 == 0) {
            System.out.println("Fizz");
        } else if (numero % 5 == 0) {
            System.out.println("Buzz");
        } else System.out.println(numero);

        scanner.close();


    }
}
