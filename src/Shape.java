import java.util.List;
import java.util.stream.Collectors;

public abstract class Shape {
    private final List<Integer> sides;

    private final String name;
    protected Shape(List<Integer> sides, String name) {
        for (Integer side : sides) {
            if (side <=0) {
                throw new IllegalArgumentException("Niepoprawna długość boku: " + side.toString());
            }
        }
        this.sides = sides;
        this.name = name;
    }

    public List<Integer> getSides() {
        return sides;
    }

    public String getDescription() {
       return getName() + " has sides: " +
               getSidesStr() + ", perimeter: " +
               getPerimeter() + " and area: " +
               getAreaStr();
    }

    protected abstract String getAreaStr();

    protected abstract Double getPerimeter();

    protected String getName() {
        return name;
    }

    private String getSidesStr() {
        return String.join(", ", sides.stream()
                .map(Integer :: toUnsignedString)
                .collect(Collectors.toList()));
    }

}
