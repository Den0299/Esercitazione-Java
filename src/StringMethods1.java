/* Scrivi un programma Java che abbia un metodo che prenda due stringhe
e le compari lessico-graficamente.
Il metodo dovrà restituire "Le due stringhe sono uguali"
o "Le due stringhe sono differenti" basandosi sul risultato del confronto.
Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder. */

public class StringMethods1 {
    public static void main(String[] args) {
        String stringa1 = "Ciao";
        String stringa2 = "Ciao";
        stringComparison(stringa1, stringa2);
    }

    public static void stringComparison(String stringa1, String stringa2) {
        StringBuilder result = new StringBuilder();
        if (stringa1.equals(stringa2)) {
            result.append("Le due stringhe sono uguali");
        } else {
            result.append("Le due stringhe sono differenti");
        }
        System.out.println(result);
    }
}
