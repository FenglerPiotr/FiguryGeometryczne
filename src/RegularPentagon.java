import java.util.List;

public class RegularPentagon extends Pentagon {

    public RegularPentagon(List<Integer> sides) {
        super(sides, "Regular Pentagon");
    }

    protected Double getArea() {
        double a = Math.sqrt((5 * (5 + 2 * (Math.sqrt(5)))) * getSides().get(0) * getSides().get(0)) / 4;
        return a;
    }
    @Override
    protected String getAreaStr() {
        return String.valueOf(getArea());
    }
}
