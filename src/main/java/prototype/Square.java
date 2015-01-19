package prototype;


/**
 * Created by tomasz on 19.01.15.
 */
public class Square extends Shape {

    public Square() {
        type = ShapeType.SQUARE;
    }

    @Override
    void draw() {
        System.out.println("Square");
    }
}
