package prototype;

/**
 * Created by tomasz on 19.01.15.
 */
public abstract class Shape implements Cloneable {

    public enum ShapeType {
        RECTANGLE, SQUARE
    }

    private String id;
    protected ShapeType type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShapeType getType() {
        return type;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
