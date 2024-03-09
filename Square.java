import java.util.Scanner;

// Square class extending the Shape abstract class
class Square extends Shape {
    double side; // Side length of the square

    // Default constructor initializing the shape name
    Square() {
        super("Square");
    }

    // Implementation of the abstract method to calculate the shape
    @Override
    void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        side = scanner.nextDouble();
    }

    // Implementation of the abstract method to calculate the perimeter of the square
    @Override
    void calculatePerimeter() {
        double perimeter = 4 * side;
        System.out.println("Perimeter of the square: " + perimeter);
    }
}
