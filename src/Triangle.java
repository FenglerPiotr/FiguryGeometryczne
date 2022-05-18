import java.util.List;

public class Triangle extends Polygon {

    public Triangle(List<Integer> sides) {
        super(sides, "Triangle");
    }

    protected Triangle(List<Integer> sides, String name) {
        super(sides, name);
    }

    protected Double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - getSides().get(0)) * (s - getSides().get(1)) * (s - getSides().get(2)));
    }

    @Override
    protected String getAreaStr() {
        return String.valueOf(getArea());
    }
}
