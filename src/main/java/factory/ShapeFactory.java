package factory;

/**
 * Created by tomasz on 19.01.15.
 */
public class ShapeFactory {

    public enum ShapeType {
        CIRCLE, SQUARE
    }

    public static Shape create(ShapeType shapeType) {
        if (shapeType.equals(ShapeType.CIRCLE)) {
            return new Circle();
        }
        if (shapeType.equals(ShapeType.SQUARE)) {
            return new Square();
        }
        return null;
    }
}
