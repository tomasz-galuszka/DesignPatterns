package factory;

/**
 * Created by tomasz on 19.01.15.
 */
public class Main {

    public static void main(String[] args) {
        ShapeFactory.create(ShapeFactory.ShapeType.CIRCLE).draw();
        ShapeFactory.create(ShapeFactory.ShapeType.SQUARE).draw();
    }
}
