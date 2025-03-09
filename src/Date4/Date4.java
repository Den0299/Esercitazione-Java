package Date4;

/* Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
aggiungi un anno
sottrai un mese
aggiungi 7 giorni
Stampa il risultato localizzata per l'Italia */


import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Date4 {
    public static void main(String[] args) {
        // La stringa di data e ora in formato ISO 8601
        String dateString = "2023-03-01T13:00:00Z";

        // Creazione dell'oggetto OffsetDateTime dalla stringa
        OffsetDateTime date = OffsetDateTime.parse(dateString);

        // Formatta la data per l'Italia
        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println("Data iniziale: " + formattedDate);

        // Aggiungi un anno, sottrai un mese e aggiungi 7 giorni
        OffsetDateTime modifiedDate = date.plusYears(1).minusMonths(1).plusDays(7);
        String formattedModifiedDate = modifiedDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));

        // Stampa il risultato
        System.out.println("Data modificata: " + formattedModifiedDate);
    }
}
