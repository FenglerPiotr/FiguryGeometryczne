import java.util.List;

public class Circle extends Shape {

    public Circle(List<Integer> sides) {
        super(sides, "Circle");
    }

    @Override
    protected Double getPerimeter() {
        return 3.14 * 2 * getSides().get(0);
    }

    protected Double getArea() {
        return 3.14 * getSides().get(0) * getSides().get(0);
    }

    @Override
    protected String getAreaStr() {
        return String.valueOf(getArea());
    }
}
