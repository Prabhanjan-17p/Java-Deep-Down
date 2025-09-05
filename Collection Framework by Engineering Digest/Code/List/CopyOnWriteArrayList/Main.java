package List.CopyOnWriteArrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {

        /*
         * What is CopyOnWriteArrayList?
         * ------------------------------
         * - CopyOnWriteArrayList is a thread-safe variant of ArrayList in Java.
         * - It belongs to java.util.concurrent package.
         * - It is designed for **concurrent read** and **occasional write** operations.
         *
         * - "Copy on Write" means:
         *    → When a write operation (add, remove, etc.) occurs, it does NOT modify the list directly.
         *    → Instead, it creates a **new copy** of the underlying array, applies the modification, and replaces the old reference.
         *
         * - This ensures that any thread reading the list will not be affected by ongoing modifications.
         */

        /*
         * Key Features of CopyOnWriteArrayList:
         * --------------------------------------
         * 1. Thread-safe – Safe for use in multi-threaded environments without synchronization.
         * 2. Read Stability – Reads never throw ConcurrentModificationException.
         * 3. Snapshot Iteration – Iterators work on the snapshot of the array at the time the iterator was created.
         * 4. No Synchronization Needed – You don’t need to use synchronized blocks manually.
         * 5. Performance – Excellent for read-heavy and write-light use cases.
         */

        /*
         * Problems / Drawbacks:
         * ----------------------
         * 1. Expensive Writes – Each write operation creates a new array (high memory and CPU cost).
         * 2. Not Suitable for Frequent Updates – Not efficient if you need to write frequently.
         * 3. Slightly Higher Memory Usage – Because of array copying during each mutation.
         */

        /*
         * How It Overcomes Concurrency Issues:
         * -------------------------------------
         * - Eliminates ConcurrentModificationException while iterating and modifying.
         * - Provides thread safety without needing external synchronization or locks.
         * - Supports safe iteration even during modifications.
         */

        /*
         * Benefits of CopyOnWriteArrayList:
         * ----------------------------------
         * - Ideal for event systems, caching, read-mostly collections.
         * - Excellent choice in observer pattern or real-time read scenarios.
         * - Provides safe and predictable behavior in multi-threaded environments.
         */

        // ------------------ Example 1: Add during Iteration ------------------
        // Normal ArrayList will throw ConcurrentModificationException here
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Lasi");

        System.out.println("Initial Order List :: " + list);

        for (String l : list) {
            System.out.println(l);
            if (l.equals("Mango")) {
                list.add("Kaju"); // This is safe in CopyOnWriteArrayList //copy at that point
                System.out.println("One item added...");
            }
        }
        System.out.println("Updated Order List :: " + list);


        // ------------------ Example 2: Concurrent Read/Write Threads ------------------
        List<String> copy = new CopyOnWriteArrayList<>();
        copy.add("Item1");
        copy.add("Item2");
        copy.add("Item3");

        Thread read = new Thread(() -> {
            try {
                while (true) {
                    for (String s : copy) {
                        System.out.println("Reading the item :: " + s);
                        Thread.sleep(100); // simulate slow read
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception in read...." + e.getMessage());
            }
        });

        Thread write = new Thread(() -> {
            try {
                Thread.sleep(500); // delay to allow reading
                copy.add("Item4");
                System.out.println("Item4 added to the list...");

                Thread.sleep(500);
                copy.remove("Item1");
                System.out.println("Removed Item1 from the list...");
            } catch (Exception e) {
                System.out.println("Exception in writing...." + e.getMessage());
            }
        });

        read.start();
        write.start();
    }
}
