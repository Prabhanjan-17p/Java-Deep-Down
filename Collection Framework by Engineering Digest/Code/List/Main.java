package List;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // ✅ What is List in Java?
        // - List is an interface from java.util package.
        // - It is a part of Java Collections Framework.
        // - It allows ordered collection of elements (duplicates allowed).
        // - Elements can be accessed via zero-based index.
        // - Common implementations: ArrayList, LinkedList, Vector, Stack

        // Example using ArrayList (most common List implementation)
        List<String> fruits = new ArrayList<>();

        // ✅ Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // duplicates allowed

        // ✅ Access elements
        System.out.println("First fruit: " + fruits.get(0));

        // ✅ Iterate
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // ✅ Remove element
        fruits.remove("Banana");

        // ✅ Contains check
        System.out.println("Contains Orange? " + fruits.contains("Orange"));

        // ✅ Size of list
        System.out.println("Size of list: " + fruits.size());

        // ✅ Clear list
        // fruits.clear();

        // ✅ Benefits of List:
        // - Maintains insertion order
        // - Allows duplicate elements
        // - Provides indexed access
        // - Easy iteration using enhanced for-loop, iterator, or forEach
        // - Dynamic resizing (especially with ArrayList)

        // ✅ Issues / Limitations:
        // - ArrayList is not synchronized → Not thread-safe by default
        // - Performance issues with insert/remove in the middle (ArrayList)
        // - Random access is slower in LinkedList
        // - Fixed size in case of List.of(...) or Arrays.asList(...)

        // ✅ When to use List:
        // - You need ordered collection
        // - You may need duplicates
        // - You want dynamic resizing

        // ✅ Alternatives:
        // - Set: For unique elements
        // - Map: For key-value pairs
        // - Queue: For FIFO order

    }
}