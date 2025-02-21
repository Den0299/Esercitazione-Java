/* Scrivere una funzione che accetti un array in input
e provi a dividere un numero dell'array per 0
e gestisca sia l'eccezione della divisione che quella di indice non presente nell'array,
leggendone il messaggio. Eseguire sempre un blocco di codice scrivendo un messaggio in console. */


public class Exception4 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
            arrayInInput(array1, 2);
            arrayInInput(array1, 10);
    }

    public static void arrayInInput(int[] array, int i) {
        try {
            int result = array[i] / 0;
            System.out.println("Il risultato è: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Errore: l'indice " + i + " non è presente nell'array");
        } catch (ArithmeticException e) {
            System.err.println("Errore: il numero " + array[i] + " non può essere diviso per zero");
        }
    }
}
 /*int[] array = {1, 2, 3, 4, 5};

        try {
            divideArrayElements(array, 2);
        } catch (ArithmeticException e) {
            System.err.println("Errore di divisione: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Errore di indice: " + e.getMessage());
        } finally {
            System.out.println("Blocco finally eseguito");
        }
    }

    public static void divideArrayElements(int[] array, int index) {
        try {
            int result = array[index] / 0;
            System.out.println("Il risultato è: " + result);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Impossibile dividere " + array[index] + " per zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Indice " + index + " non presente nell'array");
        } */