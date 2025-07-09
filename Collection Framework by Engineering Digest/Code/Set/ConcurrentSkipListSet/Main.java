package Set.ConcurrentSkipListSet;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class Main {

    enum Color { RED, GREEN, BLUE }

    public static void main(String[] args) {

        // ✅ ConcurrentSkipListSet Overview:

        // 🟢 What is ConcurrentSkipListSet?
        // ✔️ A thread-safe, **sorted** set implementation.
        // ✔️ Based on the **Skip List** data structure.
        // ✔️ Automatically sorts elements in natural order (or using a comparator).
        // ✔️ Suitable for concurrent access in multithreaded environments.

        // 🔹 ConcurrentSkipListSet
        //    - Thread-safe and sorted set.
        //    - Based on a concurrent skip list (log(n) time complexity).
        //    - Reflects concurrent modifications immediately during iteration.
        //    - Useful for real-time concurrent ordered data.

        // 🟡 Purpose:
        // - Provides concurrent access like CopyOnWriteArraySet.
        // - Maintains **sorted order** like TreeSet, but unlike TreeSet, it's thread-safe.

        // 🟡 Overcomes:
        // - TreeSet ➝ Not thread-safe.
        // - HashSet ➝ Not sorted and not thread-safe.

        // 🔁 Skip List works similarly to ConcurrentSkipListMap but for set elements (no key-value, just values).

        // ✅ Example Usage:

        System.out.println("ConcurrentSkipListSet Example:");

        Set<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        // Adding elements
        concurrentSkipListSet.add(10);
        concurrentSkipListSet.add(5);
        concurrentSkipListSet.add(15);

        // Displaying elements — automatically sorted
        System.out.println("Sorted Set: " + concurrentSkipListSet); // Output: [5, 10, 15]

        // Additional operations (if needed)
        concurrentSkipListSet.remove(10);
        System.out.println("After removing 10: " + concurrentSkipListSet); // Output: [5, 15]
    }
}
