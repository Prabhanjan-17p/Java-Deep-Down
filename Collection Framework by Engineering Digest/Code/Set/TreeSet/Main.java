package Set.TreeSet;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // ✅ TreeSet Overview:

        // 🟢 What is TreeSet?
        // ✔️ Implements the NavigableSet interface.
        // ✔️ Internally uses a Red-Black Tree (self-balancing binary search tree).
        // ✔️ Maintains elements in **ascending sorted order** (natural or via comparator).

        // 🟡 Purpose:
        // - When you need a sorted Set without duplicates.

        // 🟡 Characteristics:
        // ✔️ No duplicate elements allowed.
        // ❌ No null elements allowed (throws NullPointerException).
        // ❌ Not thread-safe (use Collections.synchronizedSet if needed).
        // ⚠️ Slower than HashSet due to sorting overhead.

        // ✅ Example Usage:

        System.out.println("TreeSet Example:");

        Set<String> treeSet = new TreeSet<>();

        // Adding elements
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Mango");

        // Output: Elements in sorted order
        System.out.println("TreeSet contents (sorted): " + treeSet); // Output: [Apple, Banana, Mango]

        // treeSet.add(null); // ❌ Uncommenting this will throw NullPointerException
    }
}