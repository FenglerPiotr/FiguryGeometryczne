import java.util.List;

public class Squere extends Quadrangle {

    public Squere(List<Integer> sides) {
        super(sides, "Squere");
    }

    protected Double getArea() {
        int a = getSides().get(0) * getSides().get(0);
        return new Double(a);
    }

    @Override
    protected String getAreaStr() {
        return String.valueOf(getArea());
    }
}
