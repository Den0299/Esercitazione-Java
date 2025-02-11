/*Scrivi un programma che contiene un metodo che dati 2 interi in ingresso
 ed un valore di confronto verifichi se il numero di confronto è compreso tra due valori specifici
 e stampi il risultato dell'operazione comprensivo dei due limiti (inferiore e superiore) */

public class OperatoriLogici1 {
    public static void main(String[] args) {
        int limInf= 8;
        int limSup= 20;
        int valConfr= 15;

        //chiamata al metodo per il confronto dei numeri
        boolean risultConfr= verificaConfr(limInf, limSup, valConfr);

        System.out.println("Il numero 15 è compreso tra 8 e 20: " +risultConfr);
    }

    //metodo che restituisce il risultato del confronto
    public static boolean verificaConfr(int x, int y, int z) {
        return (x<=z && z<=y);
    }
}

