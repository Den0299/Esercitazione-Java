/*Scrivi un programma che contenga un metodo che prende in ingresso un carattere
e ne identifica il tipo per un operazione di algebra (+ addizione - sottrazione * moltiplicazione / divisione).
Nel caso non riesca ad identificare il tipo di operazione dovrà restituire una stringa di errore.*/


import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Inserisci un carattere tra quelli indicati (+, -, *, /): ");
        char tipo= scanner.next().charAt(0);

        String operazione= algebra(tipo);
        System.out.println(operazione);


    }

    public static String algebra (char tipo) {
        switch (tipo) {
            case '+' : return "Addizione";
            case '-' : return "Sottrazione";
            case '*' : return "Moltiplicazione";
            case '/' : return "Divisione";
            default: return "Errore: non hai scelto uno tra i caratteri indicati";
        }
    }
}
