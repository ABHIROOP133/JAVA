import java.util.ArrayList;
import java.util.List;

public class LambdaStringSort {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("Original List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Sorting the list in descending (reverse alphabetical) order using a lambda expression
        fruits.sort((a, b) -> b.compareTo(a));

        System.out.println("\nSorted List (Descending Order):");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
