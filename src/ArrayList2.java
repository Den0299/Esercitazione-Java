/* Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con 12 elementi e stamparlo in console.
Mettere in ordine la collezione e stampare il risultato */


import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        // Creare un ArrayList di Student
        ArrayList<Studente> studenti = new ArrayList<>();

        // Aggiungere 12 elementi all'ArrayList
        studenti.add(new Studente("David", 23));
        studenti.add(new Studente("Eve", 21));
        studenti.add(new Studente("Ivy", 28));
        studenti.add(new Studente("Jack", 35));
        studenti.add(new Studente("Kate", 42));
        studenti.add(new Studente("Liam", 27));
        studenti.add(new Studente("Alice", 20));
        studenti.add(new Studente("Bob", 31));
        studenti.add(new Studente("Charlie", 33));
        studenti.add(new Studente("Frank", 25));
        studenti.add(new Studente("Grace", 40));
        studenti.add(new Studente("Henry", 39));

        // Stampare la collezione iniziale
        System.out.println("Collezione iniziale:");
        for (Studente studente : studenti) {
            System.out.println(studente.getName() + ", " + studente.getAge() + " anni");
        }

        // Ordinare la collezione in ordine alfabetico
        studenti.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));

        // Stampare la collezione ordinata
        System.out.println("\nCollezione ordinata:");
        for (Studente Studente : studenti) {
            System.out.println(Studente.getName() + ", " + Studente.getAge() + " anni");
        }
    }

    //crazione classe Studente
    public static class Studente {
        private String name;
        private int age;

        //costruttore
        public Studente(String name, int age) {
            this.name = name;
            this.age = age;
        }

        //metodi getter
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
