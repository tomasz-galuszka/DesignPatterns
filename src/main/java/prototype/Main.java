package prototype;

/**
 * Created by tomasz on 19.01.15.
 */
public class Main {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        ShapeCache.getShape(Shape.ShapeType.RECTANGLE).draw();
        ShapeCache.getShape(Shape.ShapeType.SQUARE).draw();
    }
}

