/* Creare una classe Studente che accenti nel costruttore il parametro name (String) e age (Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console */


import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        // Creare un ArrayList di Studente
        ArrayList<Studente> studenti = new ArrayList<>();

        // Aggiungere 3 elementi all'ArrayList
        studenti.add(new Studente("Alice", 20));
        studenti.add(new Studente("Bob", 22));
        studenti.add(new Studente("Charlie", 21));

        // Stampare la collezione iniziale
        System.out.println("Collezione iniziale:");
        for (Studente Studente : studenti) {
            System.out.println(Studente.getName() + ", " + Studente.getAge() + " anni");
        }

        // Aggiungere 4 elementi all'ArrayList
        studenti.add(new Studente("David", 23));
        studenti.add(new Studente("Eve", 24));
        studenti.add(new Studente("Frank", 25));
        studenti.add(new Studente("Grace", 26));

        // Stampare la collezione aggiornata
        System.out.println("\nCollezione aggiornata:");
        for (Studente Studente : studenti) {
            System.out.println(Studente.getName() + ", " + Studente.getAge() + " anni");
        }
    }

    public static class Studente {
        private String name;
        private int age;

        public Studente(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
