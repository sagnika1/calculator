import java.util.Scanner;

public class Calculator {

    // Method to add two numbers
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two numbers
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide two numbers
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Not a Number
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation: + (Add), - (Subtract), * (Multiply), / (Divide)");
        char operation = scanner.next().charAt(0);

        double result;

        switch (operation) {
            case '+':
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case '-':
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case '*':
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case '/':
                result = divide(num1, num2);
                if (!Double.isNaN(result)) {
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
        }

        scanner.close();
    }
}
