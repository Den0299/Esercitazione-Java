package Date1;/* Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni */


import java.time.OffsetDateTime;
import java.util.Locale;

public class Date1 {
    public static void main(String[] args) {
        // La stringa di data e ora in formato ISO 8601
        String dateString = "2002-03-01T13:00:00Z";

        // Creazione dell'oggetto OffsetDateTime dalla stringa
        // "Z" indica che la data è in UTC (fuso orario zero)
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);

        // Creazione di una versione formattata della data in formato FULL
        // Mostra il giorno della settimana, mese, giorno, anno
        String fullDate = offsetDateTime.format(java.time.format.DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy", Locale.ITALY));

        // Creazione di una versione formattata della data in formato MEDIUM
        // Mostra il mese abbreviato, giorno e anno
        String mediumDate = offsetDateTime.format(java.time.format.DateTimeFormatter.ofPattern("MMM d, yyyy", Locale.ITALY));

        // Creazione di una versione formattata della data in formato SHORT
        // Mostra la data con mese e anno abbreviati
        String shortDate = offsetDateTime.format(java.time.format.DateTimeFormatter.ofPattern("M/d/yy", Locale.ITALY));

        // Stampa dei vari formati di data
        System.out.println("Formato data FULL: " + fullDate);
        System.out.println("Formato data MEDIUM: " + mediumDate);
        System.out.println("Formato data SHORT: " + shortDate);
    }
}

