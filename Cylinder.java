import java.util.Scanner;

// Cylinder class extending the Shape abstract class and implementing the Volume interface
class Cylinder extends Shape implements Volume {
    double radius; // Radius of the cylinder
    double height; // Height of the cylinder

    // Default constructor initializing the shape name
    Cylinder() {
        super("Cylinder");
    }

    // Implementation of the abstract method to input the radius and height of the cylinder
    @Override
    void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        height = scanner.nextDouble();
    }

    // Implementation of the abstract method to state that the cylinder doesn't have a perimeter
    @Override
    void calculatePerimeter() {
        System.out.println("Cylinder doesn't have perimeter");
    }

    // Implementation of the interface method to calculate the volume of the cylinder
    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
