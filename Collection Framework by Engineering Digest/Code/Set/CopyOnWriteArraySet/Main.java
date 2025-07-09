package Set.CopyOnWriteArraySet;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class Main {

    public static void main(String[] args) {

        // ✅ CopyOnWriteArraySet Overview:

        // 🟢 What is CopyOnWriteArraySet?
        // ✔️ A thread-safe Set implementation backed by a CopyOnWriteArrayList.
        // ✔️ Ensures no duplicates and maintains insertion order.
        // ✔️ Safe for concurrent read/write without external synchronization.

        // ✅ Overview:
        // 🔹 CopyOnWriteArraySet
        //    - Thread-safe set.
        //    - Backed by a CopyOnWriteArrayList.
        //    - No duplicates allowed.
        //    - Any modification (add/remove) results in a new copy of the underlying array.
        //    - Iterators are fail-safe and do NOT reflect concurrent modifications.

        // 🟡 Purpose:
        // - Ideal for **read-mostly** scenarios where reads are frequent and writes are rare.
        // - Avoids ConcurrentModificationException during iteration.

        // 🔴 Limitations:
        // ❌ High memory usage and performance cost during write operations (creates a copy of the underlying array on each write).
        // ❌ Slower for write-heavy use cases.

        // ✅ Example Usage:

        System.out.println("CopyOnWriteArraySet Example:");

        Set<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();

        // Adding elements
        copyOnWriteArraySet.add("Java");
        copyOnWriteArraySet.add("Python");
        copyOnWriteArraySet.add("Java"); // Duplicate, will be ignored

        // Displaying the set — insertion order preserved
        System.out.println("Set contents: " + copyOnWriteArraySet); // Output: [Java, Python]

        // Safe iteration even during modifications
        for (String lang : copyOnWriteArraySet) {
            System.out.println("Reading: " + lang);
        }



        //------------------------------------------------

        // ✅ Overview:
        // 🔹 CopyOnWriteArraySet
        //    - Thread-safe set.
        //    - Backed by a CopyOnWriteArrayList.
        //    - No duplicates allowed.
        //    - Any modification (add/remove) results in a new copy of the underlying array.
        //    - Iterators are fail-safe and do NOT reflect concurrent modifications.

        // 🔹 ConcurrentSkipListSet
        //    - Thread-safe and sorted set.
        //    - Based on a concurrent skip list (log(n) time complexity).
        //    - Reflects concurrent modifications immediately during iteration.
        //    - Useful for real-time concurrent ordered data.

        CopyOnWriteArraySet<Integer> copyOnWriteSet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        // Adding elements
        for (int i = 1; i <= 5; i++) {
            copyOnWriteSet.add(i);
            concurrentSkipListSet.add(i);
        }

        System.out.println("Initial CopyOnWriteArraySet: " + copyOnWriteSet);
        System.out.println("Initial ConcurrentSkipListSet: " + concurrentSkipListSet);

        // 🔁 CopyOnWriteArraySet Iteration
        System.out.println("\nIterating and modifying CopyOnWriteArraySet:");
        for (Integer num : copyOnWriteSet) {
            System.out.println("Reading from CopyOnWriteArraySet: " + num);
            copyOnWriteSet.add(6); // Safe: will not throw ConcurrentModificationException
        }

        System.out.println("After Iteration (CopyOnWriteArraySet): " + copyOnWriteSet);

        // 🔁 ConcurrentSkipListSet Iteration
        System.out.println("\nIterating and modifying ConcurrentSkipListSet:");
        for (Integer num : concurrentSkipListSet) {
            System.out.println("Reading from ConcurrentSkipListSet: " + num);
            concurrentSkipListSet.add(6); // Safe, modification will reflect immediately
        }

        System.out.println("After Iteration (ConcurrentSkipListSet): " + concurrentSkipListSet);
    }
}
