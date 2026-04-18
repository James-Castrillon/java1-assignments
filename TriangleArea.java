import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();

        // Read and set base and height for triangle1
        triangle1.setBase(scnr.nextDouble());
        triangle1.setHeight(scnr.nextDouble());

        // Read and set base and height for triangle2
        triangle2.setBase(scnr.nextDouble());
        triangle2.setHeight(scnr.nextDouble());

        System.out.println("Triangle with smaller area:");

        // Determine smaller triangle and print its info
        if (triangle1.getArea() <= triangle2.getArea()) {
            triangle1.printInfo();
        } else {
            triangle2.printInfo();
        }
    }
}
