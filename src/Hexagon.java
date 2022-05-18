import java.util.List;

public class Hexagon extends Polygon {

    public Hexagon(List<Integer> sides) {
        super(sides, "Hexagon");
    }

    protected Hexagon(List<Integer> sides, String name) {
        super(sides, name);
    }

    @Override
    protected String getAreaStr() {
        return "Area unknown";
    }
}
