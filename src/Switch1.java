/*Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
e restituisca il nome del giorno della settimana come stringa
o una stringa di errore nel caso di valore maggiore di 7 o minore di 1.*/



public class Switch1 {
    public static void main(String[] args) {
        int x= 3;
        String result= giornoSettimana (x);
        System.out.println(result);

    }

    public static String giornoSettimana (int x) {
        switch (x) {
            case 1: return "Lunedì";
            case 2: return "Martedì";
            case 3: return "Mercoledì";
            case 4: return "Giovedì";
            case 5: return "Venerdì";
            case 6: return "Sabato";
            case 7: return "Domenica";
            default: return "Errore";

        }

    }
}
