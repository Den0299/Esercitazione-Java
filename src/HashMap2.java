/* Creare un hashmap, prendere tutti i valori, ordinarli e stamparli */


import java.util.*;

public class HashMap2 {
    public static void main(String[] args) {
        // Creazione di una HashMap
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Limone");
        map.put(2, "Uva");
        map.put(3, "Ciliegia");

        // Prendere tutti i valori dalla mappa
        Collection<String> values = map.values();
        System.out.println("Valori della mappa:\n" + values);

        //Ordinare i valori
        List<String> sortedValues = new ArrayList<>(values);
        Collections.sort(sortedValues);

        // Stampare i valori ordinati
        System.out.println("\nValori ordinati:\n" + sortedValues);
    }
}
