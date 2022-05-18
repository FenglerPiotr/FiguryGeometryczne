import java.util.List;

public class Quadrangle extends Polygon {

    protected Quadrangle(List<Integer> sides, String name) {
        super(sides, name);
    }

    public Quadrangle(List<Integer> sides) {
        super(sides, "Quadrangle");
    }

    @Override
    protected String getAreaStr() {
        return "Area unknown";
    }
}
