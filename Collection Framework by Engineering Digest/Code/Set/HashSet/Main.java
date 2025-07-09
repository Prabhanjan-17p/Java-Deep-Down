package Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Main {

    enum Color { RED, GREEN, BLUE }

    public static void main(String[] args) {

        // ✅ HashSet Overview:

        // 🟢 What is HashSet?
        // ✔️ Implements the Set interface.
        // ✔️ Internally backed by a HashMap.
        // ✔️ Stores **unique** elements only.
        // ✔️ Provides constant-time performance for add, remove, contains (on average).

        // 🟡 Characteristics:
        // - Does NOT maintain insertion or sorted order.
        // - Allows one null element.
        // - Not thread-safe (use synchronizedSet if needed).

        // 🟡 Purpose:
        // - Use when you need a fast-performing set with no concern for order.

        // 🟠 Issue:
        // - Output is unordered — depends on hash codes.

        // ✅ Example Usage:

        System.out.println("HashSet Example:");

        Set<String> hashSet = new HashSet<>();

        // Adding elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); // Duplicate, will be ignored

        // Displaying the set
        System.out.println("HashSet contents: " + hashSet); // Output is unordered

        // Checking size and contains
        System.out.println("Contains 'Banana': " + hashSet.contains("Banana"));
        System.out.println("Set size: " + hashSet.size());

        // Removing an element
        hashSet.remove("Banana");
        System.out.println("After removal: " + hashSet);
    }
}
