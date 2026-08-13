package Question07_ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- try-catch Demonstration ---");
        try {
            System.out.print("Enter numerator: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int num2 = scanner.nextInt();
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error (try-catch): Cannot divide by zero! " + e.getMessage());
        }
        
        System.out.println("\n--- try-catch-finally Demonstration ---");
        try {
            System.out.print("Enter another numerator: ");
            int num3 = scanner.nextInt();
            System.out.print("Enter another denominator: ");
            int num4 = scanner.nextInt();
            int result2 = num3 / num4;
            System.out.println("Result: " + result2);
        } catch (ArithmeticException e) {
            System.out.println("Error (try-catch-finally): Cannot divide by zero! " + e.getMessage());
        } finally {
            System.out.println("Finally block executed. This block always runs regardless of exceptions.");
        }
        
        scanner.close();
        System.out.println("\nProgram completed.");
    }
}
