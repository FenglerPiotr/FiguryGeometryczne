import java.util.List;

public class Pentagon extends Polygon{

    public Pentagon(List<Integer> sides) {
        super(sides, "Pentagon");
    }

    protected Pentagon(List<Integer> sides, String name) {
        super(sides, name);
    }
    @Override
    protected String getAreaStr() {
        return "Area unknown";
    }
}

