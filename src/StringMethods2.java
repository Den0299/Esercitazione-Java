/* Scrivi un programma Java che abbia un metodo
che prenda il carattere in Unicode in un indice specifico all'interno di una stringa e lo stampi.
 Il metodo dovrà avere nel costruttore una stringa ed una posizione
 e dovrà resituire il carattere in unicode o una stringa di errore.
Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder */


public class StringMethods2 {
    public static void main(String[] args) {
        String stringa = "Ciao";
        int indice = 1;
        String result = getUnicode(stringa, indice);  // Cambia da char a String per restituire un messaggio completo
        System.out.println(result);  // Stampa il risultato
    }

    public static String getUnicode(String stringa, int indice) {
        StringBuilder result = new StringBuilder();  // Usa StringBuilder per costruire il risultato

        if (indice >= 0 && indice < stringa.length()) {
            char unicodeChar = stringa.charAt(indice);  // Ottieni il carattere
            int unicodeValue = (int) unicodeChar;  // Ottieni il valore Unicode (valore intero del carattere)
            result.append("Il carattere '").append(unicodeChar).append("' ha il codice Unicode: ").append(unicodeValue);
        } else {
            result.append("Errore: indice non valido");
        }

        return result.toString();  // Restituisci la stringa costruita
    }
}

