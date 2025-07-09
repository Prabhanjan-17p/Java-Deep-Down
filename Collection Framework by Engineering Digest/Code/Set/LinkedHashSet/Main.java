package Set.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // ✅ LinkedHashSet Overview:

        // 🟢 What is LinkedHashSet?
        // ✔️ A subclass of HashSet.
        // ✔️ Maintains **insertion order** of elements.
        // ✔️ Internally uses a combination of HashMap + doubly linked list.

        // 🟡 Purpose:
        // - Use when you want a Set that ensures **no duplicates** and also **preserves insertion order**.

        // 🟡 Overcomes:
        // - The unordered nature of HashSet.

        // ⚠️ Not thread-safe (use Collections.synchronizedSet if needed).
        // ❌ Does not allow duplicate elements.

        // ✅ Example Usage:

        System.out.println("LinkedHashSet Example:");

        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");

        // Adding a duplicate
        linkedHashSet.add("Apple"); // Ignored

        // Displaying the set (in insertion order)
        System.out.println("LinkedHashSet contents: " + linkedHashSet); // Output: [Apple, Banana, Cherry]

        // Removing an element
        linkedHashSet.remove("Banana");
        System.out.println("After removal: " + linkedHashSet); // Output: [Apple, Cherry]
    }
}
