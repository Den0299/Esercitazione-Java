/* Scrivere una funzione che provi a dividere un numero per 0
e catturi l'eccezione leggendone il messaggio. */


public class Exception3 {
    public static void main(String[] args) {
        try {
            divideByZero(10);
        } catch (ArithmeticException e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }

    public static void divideByZero(int number) {
        try {
            int result = number / 0;
            System.out.println("Il risultato è: " + result);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Impossibile dividere " + number + " per zero");
        }
    }
}
