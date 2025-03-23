package design_pattern_factory;

/* Crea una factory class
che abbia un metodo che ritorni la forma corretta (shape) in base all'enum in input. */

public class ShapeFactory {
    public static Shape getShape(EnumShape enumShape) {
        return switch (enumShape) {
            case CERCHIO -> new Cerchio();
            case QUADRATO -> new Quadrato();
            case RETTANGOLO -> new Rettangolo();
            default -> throw new IllegalArgumentException("Shape type not supported.");
        };
    }
}
