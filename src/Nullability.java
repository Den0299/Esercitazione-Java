/*Scrivere una funzione che accetti in input un numeratore e un denominatore
Controlli che il numeratore e il denominatore non siano null
Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione. */


public class Nullability {
    public static void main(String[] args) {
        Integer numeratore = 10;
        Integer denominatore = null;
        try {
            checkNullability(numeratore, denominatore);
        } catch (NullPointerException e) {
            System.err.println("Errore: " + e.getMessage());
        }

    }

    public static void checkNullability(Integer numeratore, Integer denominatore) {
        if (numeratore == null && denominatore == null) {
            throw new NullPointerException("Sia il numeratore che il denominatore sono null");
        } else if (numeratore == null) {
            throw new NullPointerException("Il numeratore è null");
        } else if (denominatore == null) {
            throw new NullPointerException("Il denominatore è null");
        } else {
            System.out.println("Il numeratore e il denominatore hanno valori validi");
        }
    }
}



 /*Integer numeratore = 10;
        Integer denominatore = null;

        try {
            checkNullability(numeratore, denominatore);
        } catch (NullPointerException e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }

    public static void checkNullability(Integer numeratore, Integer denominatore) {
        if (numeratore == null || denominatore == null) {
            throw new NullPointerException("Il numeratore o il denominatore è null");
        } else {
            System.out.println("Il numeratore e il denominatore non sono null");
        } */