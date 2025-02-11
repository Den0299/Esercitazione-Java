public class LeFunzioni2 {
    public static void main(String[] args) {
        String testo = "Esercizio sulle funzioni";
        int lunghezza = lunghezzaTesto(testo);

        System.out.println("La frase è: " + testo);
        System.out.println("La lunghezza della stringa è: " + lunghezza);
    }

    // Funzione che restituisce la lunghezza della stringa
    public static int lunghezzaTesto(String testo) {
        return testo.length();
    }
}
