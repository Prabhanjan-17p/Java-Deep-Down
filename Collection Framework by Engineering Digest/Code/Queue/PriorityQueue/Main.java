package Queue.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        // ✅ PriorityQueue Overview:

        // 🟢 What is PriorityQueue?
        // ✔️ Part of the Java Queue interface (introduced in Java 1.5).
        // ✔️ Orders elements based on **natural ordering** (Min-Heap by default).
        // ✔️ Can also use a **custom Comparator** for reverse or custom sorting.
        // ✔️ Does NOT allow null elements.
        // ✔️ Not thread-safe (use PriorityBlockingQueue for thread safety).

        // ✅ Example with natural ordering (Min-Heap)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 🔁 To use Max-Heap, uncomment this line instead:
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // Adding elements
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);

        // Displaying internal order (not sorted list, it's a heap)
        System.out.println("Initial PriorityQueue (heap structure): " + pq);

        // Polling elements in priority order (smallest to largest)
        System.out.println("Polling elements (Min-Heap):");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // Always retrieves the lowest element
        }

        // 🔍 Internal Working:
        // ✔️ PriorityQueue uses a binary heap (min-heap for natural order).
        // ✔️ Time complexity: O(log n) for insertion and removal.
    }
}
