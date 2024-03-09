import java.util.Scanner;

// Rectangle class extending the Shape abstract class
class Rectangle extends Shape {
    double length; // Length of the rectangle
    double width;  // Width of the rectangle

    // Default constructor initializing the shape name
    Rectangle() {
        super("Rectangle");
    }

    // Implementation of the abstract method to input the length and width of the rectangle
    @Override
    void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();
    }

    // Implementation of the abstract method to calculate the perimeter of the rectangle
    @Override
    void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
