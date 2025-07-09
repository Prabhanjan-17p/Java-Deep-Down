package Set;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ConcurrentSkipListSet;

public class Main {

    // Enum for demonstrating EnumSet
    enum Color { RED, GREEN, BLUE }

    public static void main(String[] args) {

        // ✅ What is Set?
        // ✔️ Set is an interface in Java Collection Framework (introduced in Java 1.2).
        // ✔️ It represents a collection of **unique elements** — no duplicates allowed.
        // ✔️ All Set implementations are based on the mathematical set abstraction.

        // 🟢 Why was Set introduced?
        // - To handle collections where **duplicate values are not allowed**.
        // - Provides specialized implementations like HashSet, TreeSet, LinkedHashSet for different use cases.

        // 🛠️ Common Methods of Set Interface:
        // - add(E e): Adds an element to the set.
        // - remove(Object o): Removes the specified element if present.
        // - contains(Object o): Returns true if the set contains the specified element.
        // - isEmpty(): Checks if the set is empty.
        // - size(): Returns the number of elements in the set.
        // - clear(): Removes all elements from the set.
        // - iterator(): Returns an iterator for the set.

        // ✅ Different Implementations of Set:

        // 1. 🔹 HashSet – Unordered, allows one null, fast access
        System.out.println("HashSet Example:");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); // Duplicate
        System.out.println("HashSet: " + hashSet); // Unordered
        System.out.println();

        // 2. 🔹 LinkedHashSet – Maintains insertion order
        System.out.println("LinkedHashSet Example:");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        System.out.println("LinkedHashSet: " + linkedHashSet); // [Apple, Banana, Cherry]
        System.out.println();

        // 3. 🔹 TreeSet – Sorted, no nulls allowed
        System.out.println("TreeSet Example:");
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Mango");
        System.out.println("TreeSet (sorted): " + treeSet); // [Apple, Banana, Mango]
        System.out.println();

        // 4. 🔹 EnumSet – Optimized for enum types
        System.out.println("EnumSet Example:");
        Set<Color> enumSet = EnumSet.of(Color.RED, Color.GREEN);
        System.out.println("EnumSet: " + enumSet); // [RED, GREEN]
        System.out.println();

        // 5. 🔹 ConcurrentSkipListSet – Thread-safe + sorted
        System.out.println("ConcurrentSkipListSet Example:");
        Set<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();
        concurrentSkipListSet.add(10);
        concurrentSkipListSet.add(5);
        concurrentSkipListSet.add(15);
        System.out.println("ConcurrentSkipListSet: " + concurrentSkipListSet); // [5, 10, 15]
        System.out.println();

        // 6. 🔹 CopyOnWriteArraySet – Thread-safe, insertion order, optimized for read-mostly
        System.out.println("CopyOnWriteArraySet Example:");
        Set<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        copyOnWriteArraySet.add("Java");
        copyOnWriteArraySet.add("Python");
        copyOnWriteArraySet.add("Java"); // Duplicate ignored
        System.out.println("CopyOnWriteArraySet: " + copyOnWriteArraySet); // [Java, Python]
        System.out.println();
    }
}
