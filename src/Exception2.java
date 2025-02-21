/*Scrivere una funzione che controlli se un carattere è un numero,
altrimenti lanciare una eccezione.*/

public class Exception2 {
    public static void main(String[] args) {
        try {
            isNumber('1');
            isNumber('a');
        } catch (IllegalArgumentException e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }

    public static void isNumber(char c) {
        if (c >= '0' && c <= '9') {
            System.out.println("Il carattere \"" + c + "\"" + " è un numero");
        } else {
            throw new IllegalArgumentException("Il carattere \"" + c + "\"" + " non è un numero");
        }
    }
}
