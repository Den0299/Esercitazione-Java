package date2;

/* Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
Formatta la data ottenendo 01 marzo 2023
Stampa sulla console */


import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Date2 {
    public static void main(String[] args) {
        // La stringa di data e ora in formato ISO 8601
        String dateString = "2023-03-01T13:00:00Z";

        // Creazione dell'oggetto OffsetDateTime dalla stringa
        OffsetDateTime date = OffsetDateTime.parse(dateString);

        // Formatta la data ottenendo "01 marzo 2023"
        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN));

        // Stampa della data formattata sulla console
        System.out.println("Data formattata: " + formattedDate);
    }
}
