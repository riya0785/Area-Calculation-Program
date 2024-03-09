import java.util.Scanner;

// Pyramid class extending the Shape abstract class and implementing the Volume interface
class Pyramid extends Shape implements Volume {
    double baseLength; // Length of the pyramid's base
    double baseWidth;  // Width of the pyramid's base
    double height;     // Height of the pyramid

    // Default constructor initializing the shape name
    Pyramid() {
        super("Pyramid");
    }

    // Implementation of the abstract method to input the base length, base width, and height of the pyramid
    @Override
    void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base length of the pyramid: ");
        baseLength = scanner.nextDouble();
        System.out.print("Enter the base width of the pyramid: ");
        baseWidth = scanner.nextDouble();
        System.out.print("Enter the height of the pyramid: ");
        height = scanner.nextDouble();
    }

    // Implementation of the abstract method to state that a pyramid doesn't have a perimeter
    @Override
    void calculatePerimeter() {
        System.out.println("Pyramid doesn't have perimeter");
    }

    // Implementation of the interface method to calculate the volume of the pyramid
    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * baseLength * baseWidth * height;
    }
}

