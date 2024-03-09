// Abstract class representing a geometric shape
abstract class Shape {
    String shapeName; // Name of the area.

    // Constructor to initialize the shape name
    Shape(String name) {
        shapeName = name;
    }

    // Method to display the selected shape
    void showShape() {
        System.out.println("Selected Shape: " + shapeName);
    }

    // Abstract method to calculate the shape (e.g., area or volume)
    abstract void calculateShape();

    // Abstract method to calculate the perimeter of the shape
    abstract void calculatePerimeter();
}
