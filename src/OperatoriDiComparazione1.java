public class OperatoriDiComparazione1 {
    public static void main(String[] args) {
        int x=11;
        int y=19;

        // chiamata al metodo per comparare x & y
        boolean xyEquals= comparazione(x,y);

        System.out.println("x= " +x);
        System.out.println("y= " +y);
        System.out.println("x\u2260y: " +xyEquals);

    }

    // metodo che compara x & y
    public static boolean comparazione (int x, int y){
        return x!=y;
    }
}

