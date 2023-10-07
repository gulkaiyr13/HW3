import java.util.Scanner;

class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select a shape type:");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Square");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 5) {
                System.out.println("POKA");
                break;
            }

            Shape shape = null;
            String shapeName = "";

            switch (choice) {
                case 1:
                    shapeName = "Rectangle";
                    System.out.print("Enter the width: ");
                    double width = scanner.nextDouble();
                    System.out.print("Enter the height: ");
                    double height = scanner.nextDouble();
                    shape = new Rectangle(shapeName, width, height);
                    break;
                case 2:
                    shapeName = "Circle";
                    System.out.print("Enter the radius: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(shapeName, radius);
                    break;
                case 3:
                    shapeName = "Triangle";
                    System.out.print("Enter the length of side 1: ");
                    double side1 = scanner.nextDouble();
                    System.out.print("Enter the length of side 2: ");
                    double side2 = scanner.nextDouble();
                    System.out.print("Enter the length of side 3: ");
                    double side3 = scanner.nextDouble();
                    shape = new Triangle(shapeName, side1, side2, side3);
                    break;
                case 4:
                    shapeName = "Square";
                    System.out.print("Enter the side length: ");
                    double sideLength = scanner.nextDouble();
                    shape = new Square(shapeName, sideLength);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            System.out.println("Selected " + shapeName + ":");
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
        }

        scanner.close();
    }
}
