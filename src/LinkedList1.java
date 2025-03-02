/* Creare una classe Fruit che accenti nel costruttore il parametro name (String)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo
Stampare la collezione aggiornata */

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        // Creare una LinkedList di Fruit
        LinkedList<Fruit> fruits = new LinkedList<>();

        // Aggiungere alcuni elementi alla LinkedList
        fruits.add(new Fruit("Mela"));
        fruits.add(new Fruit("Banana"));
        fruits.add(new Fruit("Arancia"));

        // Stampare la LinkedList iniziale
        System.out.println("LinkedList iniziale:");
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }

        // Aggiungere un elemento al primo posto della LinkedList
        fruits.addFirst(new Fruit("Pera"));

        // Aggiungere un elemento all'ultimo posto della LinkedList
        fruits.addLast(new Fruit("Kiwi"));

        // Stampare la LinkedList aggiornata
        System.out.println("\nLinkedList aggiornata:");
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }

    //creazione classe Fruit
    public static class Fruit {
        private String name;

        //costruttore
        public Fruit(String name) {
            this.name = name;
        }

        //metodo getter
        public String getName() {
            return name;
        }

        //metodo toString
        @Override
        public String toString() {
            return "Fruit{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
