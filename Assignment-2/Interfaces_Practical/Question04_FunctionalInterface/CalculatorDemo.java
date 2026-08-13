@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}

public class CalculatorDemo {
    public static void main(String[] args) {
        // Lambda expressions providing implementations for the functional interface
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;

        int num1 = 10;
        int num2 = 5;

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("-----------------");
        
        // Calling the compute method for each operation
        System.out.println("Addition: " + addition.compute(num1, num2));
        System.out.println("Subtraction: " + subtraction.compute(num1, num2));
        System.out.println("Multiplication: " + multiplication.compute(num1, num2));
    }
}
