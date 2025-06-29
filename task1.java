import java.util.Scanner;

public class task1 {

    // Method for addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method for multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method for division
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to Java Console Calculator!");

        while (running) {
            System.out.println("\nEnter two integers:");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Quit");

            System.out.print("Enter option (1-5): ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("Result: " + divide(num1, num2));
                    break;
                case 5:
                    System.out.println("Exiting calculator. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please select between 1 to 5.");
            }
        }

        sc.close();
    }
}
