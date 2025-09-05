package List.Vector;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        /**
         * What is Vector?
         * ----------------
         * - Vector is a legacy class from Java 1.0, present in java.util package.
         * - It is similar to ArrayList, but it is **synchronized** (thread-safe).
         * - Vector implements List, so it maintains insertion order and allows duplicates.
         * - Internally, it uses a dynamic array to store the elements.
         */

        /**
         * Key Features of Vector:
         * ------------------------
         * 1. Synchronized – All methods are thread-safe (unlike ArrayList).
         * 2. Dynamic Resizing – Increases its size automatically when full.
         * 3. Allows Duplicates – Same value can be inserted multiple times.
         * 4. Preserves Order – Maintains the order of insertion.
         * 5. Legacy Class – Part of Java's original Collection Framework.
         */

        /**
         * Problems with Vector:
         * ----------------------
         * 1. Slower Performance – Due to synchronization overhead, it is slower than ArrayList in single-threaded cases.
         * 2. Less Usage Today – In modern code, ArrayList + Collections.synchronizedList() or CopyOnWriteArrayList are preferred.
         * 3. Increases Capacity by Doubling (or defined increment) – May waste memory.
         */

        /**
         * How Vector Overcomes Limitations:
         * ----------------------------------
         * - Unlike arrays, Vector resizes itself dynamically.
         * - Provides thread-safe operations without external synchronization.
         */

        /**
         * Benefits of Vector:
         * --------------------
         * - Best suited for multi-threaded environments where thread safety is required.
         * - Offers methods like add(), remove(), set(), get(), capacity(), etc.
         * - Can be initialized using other collections (like LinkedList or ArrayList).
         */


        // ---------- Constructors and Capacity Demo ----------
        Vector<Integer> vector1 = new Vector<>();
        vector1.add(1);
        vector1.add(2);
        vector1.add(3);
        vector1.add(7);
        System.out.println(vector1.capacity()); // Default capacity = 10
        System.out.println("content "+vector1);

        Vector<Integer> vector = new Vector<>(2); // Custom initial capacity = 2
        vector.add(12);
        vector.add(12);
        vector.add(12); // Triggers capacity increase
        System.out.println(vector.capacity());   // Capacity doubles: 2 -> 4
        System.out.println(vector.size());       // Size = 3
        System.out.println(vector);

        Vector<Integer> vector3 = new Vector<>(2, 20); // Initial capacity = 2, Increment = 20
        vector3.add(12);
        vector3.add(13);
        vector3.add(14); // Capacity grows by +20 instead of doubling
        System.out.println(vector3.capacity());  // Output: 22
        System.out.println(vector3);

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3));
        Vector<Integer> vector4 = new Vector<>(linkedList); // Create vector from LinkedList
        System.out.println(vector4);


        // ---------- Common Methods of Vector ----------
        Vector<Integer> vectorMethods = new Vector<>();
        vectorMethods.add(12);
        vectorMethods.add(12);
        vectorMethods.add(12);
        vectorMethods.add(16);
        vectorMethods.add(2, 20);              // Add element at index
        System.out.println(vectorMethods.get(2)); // Get element at index 2
        vectorMethods.set(2, 30);              // Update element at index 2
        vectorMethods.remove(2);               // Remove element at index 2
        System.out.println(vectorMethods.size());    // Current size of vector
        System.out.println(vectorMethods.isEmpty()); // Check if vector is empty
        System.out.println(vectorMethods.contains(16)); // Check if vector contains value
        System.out.println(vectorMethods);      // Print vector contents
        vectorMethods.clear();                  // Remove all elements
        System.out.println(vectorMethods);      // Print empty vector
    }
}
