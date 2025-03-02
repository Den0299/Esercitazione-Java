package Record;
//Definisci un oggetto Record che rappresenti un Punto con le coordinate x & y


public class RecordExe {
    public static void main(String[] args) {
        Punto punto = new Punto(10, 20);
        // Accesso ai valori delle coordinate
        System.out.println(punto);
        System.out.println("Coordinata x: " + punto.x());
        System.out.println("Coordinata y: " + punto.y());
    }
}
