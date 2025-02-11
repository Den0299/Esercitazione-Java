public class OperatoriAritmetici1 {
    public static void main(String[] args) {
        int x= 35;
        int y= 8;

        // chiamata al metodo resultMod
        int Mod= resultMod(x,y);

        System.out.println("x= " +x);
        System.out.println("y= " +y);
        System.out.println("Il resto della divisiona tra " +x +" e " +y +" è " + Mod);

    }

    // metodo che restituisce il resto della divisione tra x e y
    public static int resultMod (int x, int y){
        return x%y;
    }
}
