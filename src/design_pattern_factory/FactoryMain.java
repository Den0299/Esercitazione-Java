package design_pattern_factory;

/* Crea un'interfaccia Shape e un metodo draw, crea 2 o più classi che implementino Shape.
Crea una enum che abbia tutti i tipi di shape che hai creato ( cerchio, rettangolo etc etc)
Crea una factory class che abbia un metodo che ritorni la forma corretta (shape) in base all'enum in input.
Stampa a video il risultato della funzione draw di ogni shape */


public class FactoryMain {
    public static void main(String[] args) {
        Shape cerchio = ShapeFactory.getShape(EnumShape.CERCHIO);
        Shape quadrato = ShapeFactory.getShape(EnumShape.QUADRATO);
        Shape rettangolo = ShapeFactory.getShape(EnumShape.RETTANGOLO);

        cerchio.draw();
        quadrato.draw();
        rettangolo.draw();
    }
}
