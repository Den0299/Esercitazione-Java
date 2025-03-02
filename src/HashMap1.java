/* Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto. */


import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        // Metodo 1: Inizializzazione vuota e aggiunta manuale
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Ciliegia");
        map.put(2, "Mela");
        map.put(3, "Uva");
        System.out.println("HashMap1: " + map);

        // Metodo 2: Inizializzazione con Map.of()
        // Mappa immutabile, non puoi aggiungere/modificare elementi dopo la creazione
        Map<Integer, String> map2 = Map.of(1, "Arancia", 2, "Kiwi", 3, "Ananas");
        System.out.println("Mappa con Map.of(): " + map2);

        // Creazione di una HashMap utilizzando Map.ofEntries()
        // Mappa immutabile, non puoi aggiungere/modificare elementi dopo la creazione
        Map<Integer, String> map3 = Map.ofEntries(
                Map.entry(1, "Limone"),
                Map.entry(2, "Pera"),
                Map.entry(3, "Pompelmo")
        );
        System.out.println("Mappa con Map.ofEntries(): " + map3);
    }
}
