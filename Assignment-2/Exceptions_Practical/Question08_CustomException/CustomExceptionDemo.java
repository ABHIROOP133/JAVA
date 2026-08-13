package Question08_CustomException;

import java.util.Scanner;

public class CustomExceptionDemo {
    
    // Method that throws the custom exception
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18. Not eligible.");
        } else {
            System.out.println("Age is valid. Eligible.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        if (scanner.hasNextInt()) {
            int userAge = scanner.nextInt();
            
            try {
                System.out.println("Validating age...");
                checkAge(userAge);
            } catch (InvalidAgeException e) {
                System.out.println("Exception Caught: " + e.getMessage());
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer for age.");
        }
        
        scanner.close();
        System.out.println("Program execution completed.");
    }
}
