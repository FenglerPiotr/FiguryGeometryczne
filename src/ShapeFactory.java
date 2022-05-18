import sun.awt.image.PNGImageDecoder;

import java.util.HashSet;
import java.util.List;

public class ShapeFactory {
    public static Shape createShape(List<Integer> lengthList) {
        switch (lengthList.size()) {
            case 1: return new Circle(lengthList);
            case 2: throw new IllegalArgumentException("Z dwóch wartości nie powstanie wielokąt.");
            case 3: return createTringle(lengthList);
            case 4: return createQuadrangle(lengthList);
            case 5: return createPentagon(lengthList);
            case 6: return createHexagon(lengthList);
        }
        return null;
    }

    private static Shape createHexagon(List<Integer> lengthList) {
        if(new HashSet<Integer>(lengthList).size() == 1) {
            return new RegularHexagon(lengthList);
        }
        else return new Hexagon(lengthList);
    }

    private static Shape createPentagon(List<Integer> lengthList) {
        if(new HashSet<Integer>(lengthList).size() == 1) {
            return new RegularPentagon(lengthList);
        }
        else return new Pentagon(lengthList);
    }

    private static Shape createQuadrangle(List<Integer> lengthList) {
        if(new HashSet<Integer>(lengthList).size() == 1) {
            return new Squere(lengthList);
        }
        else if(lengthList.get(0).equals(lengthList.get(2))
                && lengthList.get(1).equals(lengthList.get(3))) {
            return new Rectangle(lengthList);
        }
        else return new Quadrangle(lengthList);
    }

    private static Shape createTringle(List<Integer> lengthList) {
        if(new HashSet<Integer>(lengthList).size() == 1) {
            return new EquilateralTriangle(lengthList);
        }
        else if(new HashSet<Integer>(lengthList).size() == 2) {
            return new IsoscelesTriangle(lengthList);
        }
        else return new Triangle(lengthList);
    }
}
