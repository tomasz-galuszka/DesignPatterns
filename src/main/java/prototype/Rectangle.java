package prototype;

/**
 * Created by tomasz on 19.01.15.
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = ShapeType.RECTANGLE;
    }

    @Override
    void draw() {
        System.out.println("Rectangle");
    }
}
