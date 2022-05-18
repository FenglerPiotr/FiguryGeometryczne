import java.util.List;

public abstract class Polygon extends Shape {

    protected Polygon(List<Integer> sides, String name) {

        super(sides, name);

        int max = sides.stream().max(Integer::compareTo).get();
        int sum = sides.stream().reduce(0, Integer::sum);
        if (max > (sum - max)) {
            throw new IllegalArgumentException("Z podanych boków nie jest możliwe utworzenie wielokąta. ");
        }

    }

    @Override
    protected Double getPerimeter() {
        int sum = 0;
        for (Integer side : getSides()) {
            sum = sum + side;
        }
        return new Double(sum);
    }
}
