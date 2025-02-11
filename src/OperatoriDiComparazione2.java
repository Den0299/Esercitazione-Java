public class OperatoriDiComparazione2 {
    public static void main(String[] args) {
        char a='A';
        char b='B';

        // chiamata al metodo per comparare a & b
        boolean abEquals= comparazione(a,b);

        System.out.println("Il primo carattere è: " +a);
        System.out.println("Il secondo carattere è: " +b);
        System.out.println("x=y: " +abEquals);

    }

    // metodo che compara a & b
    public static boolean comparazione (char a, char b){
        return a==b;
    }
}
