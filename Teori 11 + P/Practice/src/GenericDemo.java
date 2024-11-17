import java.util.ArrayList;
import java.util.Collections;

// Generic Class implementing Generic Interface

// Main Class
public class GenericDemo {
    public static void main(String[] args) {
        // Example 1: Using Generic Class with MinMax
        Integer nums[] = {3, 5, 1, 8, 4};
        MyClass<Integer> obj = new MyClass<>(nums);
        System.out.println("Min: " + obj.min());
        System.out.println("Max: " + obj.max());

        // Example 2: Using Generic Method with Collections
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Apple", "Orange", "Banana", "Grape");
        System.out.println("\nCollection Items:");
        Utility.printCollection(list);

        // Example 3: Checking if Array is Sorted
        Integer sortedArray[] = {1, 2, 3, 4, 5};
        System.out.println("\nIs array sorted? " + Utility.isSorted(sortedArray));

        Integer unsortedArray[] = {5, 3, 1, 4, 2};
        System.out.println("Is array sorted? " + Utility.isSorted(unsortedArray));
    }
}
