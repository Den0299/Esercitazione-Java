/* Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato */


import java.util.HashSet;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet<String> hashSet = riempiHashSet();
        String oggetto = "2";
        boolean contieneOggetto = hashSet.contains(oggetto);
        System.out.println("L'elemento " + oggetto + " è presente nel HashSet: " + contieneOggetto);

    }

    public static HashSet<String> riempiHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        return hashSet;
    }
}
