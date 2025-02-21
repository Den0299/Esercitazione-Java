/* Scrivere una funzione che controlli se un numero int è in un determinato range.
Se lo, è ritorna true ; se non lo è, lancia un'eccezione. */

public class Exceptions1 {
    public static boolean isNumberInRange(int number, int min, int max) {
        if (number > min && number < max) {
            return true;
        } else {
            throw new IllegalArgumentException("Il numero " + number + " non è nel range [" + min + ", " + max + "]");
        }
    }

    public static void main(String[] args) {
        try {
            boolean isInRange = isNumberInRange(10, 5, 20);
            System.out.println("Il numero è nel range: " + isInRange);

            isInRange = isNumberInRange(3, 5, 20); // Questo lancerà un'eccezione
            System.out.println("Il numero è nel range: " + isInRange); // Questa riga non verrà eseguita
        } catch (IllegalArgumentException e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }
}


