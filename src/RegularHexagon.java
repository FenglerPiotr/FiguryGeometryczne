import java.util.List;

public class RegularHexagon extends Hexagon{

    public RegularHexagon(List<Integer> sides) {
        super(sides, "Regular Hexagon");
    }

    protected Double getArea() {
        double a = ((3 * Math.sqrt(3) *
                (getSides().get(0) * getSides().get(0))) / 2);
        return a;
    }
    @Override
    protected String getAreaStr() {
        return String.valueOf(getArea());
    }
}
