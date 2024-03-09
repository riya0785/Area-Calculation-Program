import java.util.Scanner;

// Sphere class extending the Shape abstract class and implementing the Volume interface
class Sphere extends Shape implements Volume {
    double radius; // Radius of the sphere

    // Default constructor initializing the shape name
    Sphere() {
        super("Sphere");
    }

    // Implementation of the abstract method to input the radius of the sphere
    @Override
    void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        radius = scanner.nextDouble();
    }

    // Implementation of the abstract method to state that sphere doesn't have a perimeter
    @Override
    void calculatePerimeter() {
        System.out.println("Sphere doesn't have perimeter");
    }

    // Implementation of the interface method to calculate the volume of the sphere
    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
