import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double result = 0;
        String operation = "";

        while (true) {
            System.out.println("\nPlease enter the first number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number: ");
                scanner.next();
            }
            num1 = scanner.nextDouble();

            System.out.println("Please enter the second number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number: ");
                scanner.next();
            }
            num2 = scanner.nextDouble();

            System.out.println("Please enter the operation (+, -, *, /): ");
            operation = scanner.next();

            if (operation.equals("+")) {
                result = num1 + num2;
            } else if (operation.equals("-")) {
                result = num1 - num2;
            } else if (operation.equals("*")) {
                result = num1 * num2;
            } else if (operation.equals("/")) {
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    continue;
                }
                result = num1 / num2;
            } else {
                System.out.println("Error: Invalid operation. Please enter +, -, *, or /.");
                continue;
            }

            System.out.println("The result: " + result);
        }
    }
}