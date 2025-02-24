/* Scrivere una funzione che restituisca un hashset riempito
Leggere l'hashSet e stampre grandezza ed elementi */


import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        System.out.println("Size: " + hashSet.size());
        System.out.println("Elements: " + hashSet);
        for (String element : hashSet) {
            System.out.println(element);
        }
    }
}
