import java.util.Scanner;

// Circle class extending the Shape abstract class
class Circle extends Shape {
    double radius; // Radius of the circle

    // Default constructor initializing the shape name
    Circle() {
        super("Circle");
    }

    // Implementation of the abstract method to input the radius of the circle
    @Override
    void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
    }

    // Implementation of the abstract method to calculate the perimeter of the circle
    @Override
    void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of the circle: " + perimeter);
    }
}
