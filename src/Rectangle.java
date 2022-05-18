import java.util.List;

public class Rectangle extends Quadrangle {

    public Rectangle(List<Integer> sides) {
        super(sides, "Rectangle");
    }

    protected Double getArea() {
        int a = getSides().get(0) * getSides().get(1);
        return new Double(a);
    }
    @Override
    protected String getAreaStr() {
        return String.valueOf(getArea());
    }
}
