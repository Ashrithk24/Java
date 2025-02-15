import java.util.Scanner;

public class TriangleGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to choose the type of triangle
        System.out.println("Choose the type of triangle to generate:");
        System.out.println("1. Right-Angled Triangle");
        System.out.println("2. Isosceles Triangle");
        System.out.println("3. Equilateral Triangle");
        int choice = scanner.nextInt();

        // Prompt user to enter the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();

        switch (choice) {
            case 1:
                generateRightAngledTriangle(height);
                break;
            case 2:
                generateIsoscelesTriangle(height);
                break;
            case 3:
                generateEquilateralTriangle(height);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    // Generate Right-Angled Triangle
    public static void generateRightAngledTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Generate Isosceles Triangle
    public static void generateIsoscelesTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = height - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Generate Equilateral Triangle
    public static void generateEquilateralTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
