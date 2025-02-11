public class OperatoriAritmetici2 {
    public static void main(String[] args) {
        int x= 56;
        int y= 7;

        // chiamata al metodo resultDiv
        int Div= resultDiv(x,y);

        System.out.println("x= " +x);
        System.out.println("y= " +y);
        System.out.println("Il risultato della divisiona tra " +x +" e " +y +" è " + Div);

    }

    // metodo che restituisce il risultato della divisione tra x e y
    public static int resultDiv (int x, int y){
        return x/y;
    }
}
