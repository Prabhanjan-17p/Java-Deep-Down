package Set.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // ✅ SortedSet Interface Overview (Java 1.2):

        // 🟢 Definition:
        // ✔️ SortedSet is an interface that extends Set.
        // ✔️ It represents a set that maintains its elements in **ascending sorted order**.

        // 🟡 Purpose:
        // - Provides a foundation for sorted set implementations like TreeSet and ConcurrentSkipListSet.
        // - Adds methods like first(), last(), headSet(), tailSet(), subSet() for sorted operations.

        // 🔴 Note:
        // ❌ SortedSet is an interface — it cannot be instantiated directly.
        // ✔️ TreeSet and ConcurrentSkipListSet are concrete implementations.

        // ✅ Example using TreeSet (a SortedSet implementation):

        SortedSet<String> sortedSet = new TreeSet<>();

        sortedSet.add("Banana");
        sortedSet.add("Apple");
        sortedSet.add("Mango");

        // Elements are sorted in natural order (alphabetical for strings)
        System.out.println("SortedSet contents: " + sortedSet); // Output: [Apple, Banana, Mango]

        // Accessing first and last elements
        System.out.println("First element: " + sortedSet.first()); // Apple
        System.out.println("Last element: " + sortedSet.last());   // Mango

        // Getting a subset
        System.out.println("HeadSet (before Mango): " + sortedSet.headSet("Mango")); // [Apple, Banana]
    }
}
