public class OperatoriDiAssegnazione {
    public static void main(String[] args) {
        int x=15;
        int y=7;

        // chiamata al metodo resultMulti per incrementare e moltiplicare x & y
        int multi= resultMulti(x,y);

        System.out.println("x= " +x);
        System.out.println("y= " +y);
        System.out.println("Il risultato della moltiplicazione dopo l'incremento è " +multi);

    }

    // metodo che restituisce la moltiplicazione tra x & y dopo averli incrementati
    public static int resultMulti (int x, int y){
        x +=5;
        y +=3;
        System.out.println("Valore di x dopo l'incremento= " +x);
        System.out.println("Valore di y dopo l'incremento= " +y);
        return x*y;
    }
}
