/* Scrivere una funzione che restituisca un hashset riempito
Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
Svuotare l'hashset, verificarlo e stampare il risultato */


import java.util.HashSet;

public class HashSet3 {
    public static void main(String[] args) {
        HashSet<String> hashSet = riempiHashSet();
        //Creare un oggeto dello stesso tipo inserito nell'HashSet e poolarlo
        String oggetto = "2";
        System.out.println("HashSet prima dell'eliminazione: " + hashSet);

        //Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
        for (String elemento : hashSet) {
            if (elemento.equals(oggetto)) {
                hashSet.remove(elemento);
                break;
            }
        }
        System.out.println("HashSet dopo l'eliminazione dell'elemento: " + hashSet);

        //svuotare l'hashset, verificarlo e stampare il risultato
        hashSet.clear();
        boolean vuoto = hashSet.isEmpty();
        System.out.println("L'HashSet è vuoto: " + vuoto);

    }

    public static HashSet<String> riempiHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        return hashSet;
    }
}
