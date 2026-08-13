@FunctionalInterface
interface Square {
    int calculate(int n);
}

public class MethodReferenceDemo {
    
    // Static method to calculate the square of an integer
    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        int number = 7;
        
        // Method reference connecting the functional interface with the static method
        Square obj = MethodReferenceDemo::square;
        
        // Calling the functional interface method
        int result = obj.calculate(number);
        
        System.out.println("Calculating square using Method Reference:");
        System.out.println("The square of " + number + " is: " + result);
    }
}
