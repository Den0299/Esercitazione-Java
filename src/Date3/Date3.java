package Date3;

/* Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console */


import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Date3 {
    public static void main(String[] args) {
        // La stringa di data e ora in formato ISO 8601
        String dateString = "2023-03-01T13:00:00Z";

        // Creazione dell'oggetto OffsetDateTime dalla stringa
        OffsetDateTime date = OffsetDateTime.parse(dateString);

        // Formatta la data con la funziona FULL
        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN));
        System.out.println("Data formattata in full: " + formattedDate);


        // Ottieni l'anno, il mese, il giorno, il giorno della settimana
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        // Ottieni il giorno della settimana in italiano
        String dayOfWeek = date.format(DateTimeFormatter.ofPattern("EEEE", Locale.ITALIAN));

        // Stampa i risultati sulla console
        System.out.println("Anno: " + year);
        System.out.println("Mese: " + month);
        System.out.println("Giorno: " + day);
        System.out.println("Giorno della settimana: " + dayOfWeek);
    }
}
