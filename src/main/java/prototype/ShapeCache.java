package prototype;

import java.util.Hashtable;

/**
 * Created by tomasz on 19.01.15.
 */
public class ShapeCache {

    private static Hashtable<Shape.ShapeType, Shape> shapeMap = new Hashtable<Shape.ShapeType, Shape>();

    public static Shape getShape(Shape.ShapeType shapeType) {
        return (Shape) shapeMap.get(shapeType).clone();
    }

    public static void loadCache() {
        Rectangle rectangle = new Rectangle();
        shapeMap.put(Shape.ShapeType.RECTANGLE, rectangle);

        Square square = new Square();
        shapeMap.put(Shape.ShapeType.SQUARE, square);
    }
}
