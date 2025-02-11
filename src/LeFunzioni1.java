public class LeFunzioni1 {
    public static void main(String[] args) {
        int x= 12;
        int y= 28;
        int risultato= sumOf (x,y);

        System.out.println("La somma di " +x +" e " +y +" è: " + risultato);

    }

    // funzione che restituisce la somma di x e y
    public static int sumOf (int x, int y){
        return x+y;

    }
}
