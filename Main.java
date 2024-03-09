import java.util.Scanner;

// Main class to execute the shape calculation program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Infinite loop for the user to choose shapes until they decide to exit
        while (true) {
            System.out.println("\nChoose a shape to calculate its area, perimeter, and volume:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Pyramid");
            System.out.println("7. Exit");

            System.out.print("Enter your choice (1-7): ");
            int choice = scanner.nextInt();

            // Check if the user wants to exit the program
            if (choice == 7) {
                System.out.println("Exiting program. Goodbye!");
                break; // Exit the loop if the user chooses to exit
            }

            Shape shape = null;

            // Create an instance of the selected shape based on user input
            switch (choice) {
                case 1:
                    shape = new Circle();
                    break;
                case 2:
                    shape = new Rectangle();
                    break;
                case 3:
                    shape = new Square();
                    break;
                case 4:
                    shape = new Sphere();
                    break;
                case 5:
                    shape = new Cylinder();
                    break;
                case 6:
                    shape = new Pyramid();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                    continue; // Skip the rest of the loop and ask for input again
            }

            // Display the selected shape and calculate its area and perimeter
            shape.showShape();
            shape.calculateShape();
            shape.calculatePerimeter();

            // Check if the shape implements the Volume interface to calculate and display its volume
            if (shape instanceof Volume) {
                Volume volumeShape = (Volume) shape;
                System.out.println("Volume of the shape: " + volumeShape.calculateVolume());
            }
        }
    }
}
