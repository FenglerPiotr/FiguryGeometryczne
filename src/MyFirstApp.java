import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MyFirstApp {

    public static void main(String[] args) {
        List<Shape> shapes = inputShapes();
        printShapes(shapes);
    }

    private static List<Shape> inputShapes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź liczbę obiektów: ");
        int numberOfShapes = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(numberOfShapes);
        List<Shape> shapes = new ArrayList<>();

        for(int i = 0; i < numberOfShapes; i++) {
            System.out.print("Wprowadź kolejno następujące długości boków odzielone spacją lub promień okręgu: ");
            String line = scanner.nextLine();
            String[] stringArray = line.split( "\\s+");
            List<String> stringList = Arrays.asList(stringArray);
            List<Integer> lengthList = stringList.stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            try {
                shapes.add(ShapeFactory.createShape(lengthList));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return shapes;
    }

    private static void printShapes(List<Shape> shapes) {
        System.out.println("Z wprowadzonych danych powstały: ");
        for (Shape s : shapes) {
            System.out.println(s.getDescription());
        }
    }

}
