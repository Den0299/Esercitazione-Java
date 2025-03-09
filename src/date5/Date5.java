package date5;

/* Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
Verificare che la prima data è precedente alla seconda
Verificare che la seconda data è successiva alla prima
Verificare che le due date sono uguali ad ora
Stampa il risultato */

import java.time.OffsetDateTime;

public class Date5 {
    public static void main(String[] args) {
        // Creazione delle due date
        String dateString1 = "2023-03-01T13:00:00Z";
        String dateString2 = "2024-03-01T13:00:00Z";

        // Creazione degli oggetti OffsetDateTime dalle stringhe
        OffsetDateTime date1 = OffsetDateTime.parse(dateString1);
        OffsetDateTime date2 = OffsetDateTime.parse(dateString2);

        // Verifica se la prima data è precedente alla seconda
        boolean isBefore = date1.isBefore(date2);
        System.out.println("La prima data è precedente alla seconda: " + isBefore);

        // Verifica se la seconda data è successiva alla prima
        boolean isAfter = date2.isAfter(date1);
        System.out.println("La seconda data è successiva alla prima: " + isAfter);

        // Verifica se le due date sono uguali ad ora
        boolean isEqual = date1.isEqual(date2);
        System.out.println("Le due date sono uguali ad ora: " + isEqual);
    }
}
