/*Scrivi un programma che permetta di capire,
tramite l'implementazione di due metodi, se un numero è pari o dispari.*/

public class OperatoriLogici2 {
    public static void main(String[] args) {
        int numero= 16;

        //chiamata ai due metodi per verificare se il numero è pari o dispari
        boolean isPari= numPari (numero);
        boolean isDispari= numDispari (numero);

        System.out.println("Numero da verificare: " +numero);
        System.out.println("16 è un numero pari: " +isPari);
        System.out.println("16 è un numero dispari: " +isDispari);


    }

    //metodo per verificare se il numero è pari
    public static boolean numPari (int x) {
        return (x % 2 == 0);
    }

    //metodo per verificare se il numero è dispari
    public static boolean numDispari (int x) {
        return (!numPari(x));
    }
}
