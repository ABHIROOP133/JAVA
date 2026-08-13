import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("--- ArrayList Demonstration ---");
        System.out.println("Enter 3 integers:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        System.out.println("\nYou entered the following numbers in the ArrayList:");
        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}
