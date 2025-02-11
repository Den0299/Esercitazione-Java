public class OperatoriAritmetici3 {
    public static void main(String[] args) {
        int x= 14;
        int y= 9;
        int z= 40;

        // chiamata al metodo resultMedia
        int mediaNumeri= resultMedia(x,y,z);

        System.out.println("x= " +x);
        System.out.println("y= " +y);
        System.out.println("z= " +z);
        System.out.println("La media tra " +x +", " +y +" e " +z +" è " + mediaNumeri);

    }

    // metodo che restituisce la media tra x, y, z.
    public static int resultMedia (int x, int y, int z){
        return (x+y+z)/3;
    }
}
