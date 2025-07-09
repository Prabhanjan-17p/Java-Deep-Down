package Queue.ConcurrentLinkedDeque;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Main {
    public static void main(String[] args) {

        /*
        ✅ What is ConcurrentLinkedDeque?
        --------------------------------------------------
        - A **non-blocking**, **thread-safe**, **double-ended queue** (deque).
        - Based on **lock-free** algorithms using **Compare-And-Swap (CAS)**.
        - Allows concurrent insertion/removal at both head and tail.

        ❓ Why it was introduced:
        --------------------------------------------------
        - Traditional Deques (e.g., LinkedList) are not thread-safe.
        - Synchronizing both ends causes contention and blocking.
        - Needed a deque for high-concurrency environments.

        ⚠️ The Problem:
        --------------------------------------------------
        - In multithreaded systems, `LinkedList` and `ArrayDeque` fail under concurrent access.
        - Manual synchronization leads to performance bottlenecks.

        🔧 The Fix – ConcurrentLinkedDeque:
        --------------------------------------------------
        - Provides thread-safe operations at both ends.
        - Ideal for work-stealing queues, async pipelines, and parallel tasks.
        - Lock-free → better scalability than synchronized deques.
        */

        // ✅ Create a thread-safe, lock-free deque
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();

        // 🔁 Add elements from both ends
        deque.add("Element1");        // Adds to tail (like addLast)
        deque.addFirst("Element0");   // Adds to head
        deque.addLast("Element2");    // Adds to tail

        System.out.println("Deque after insertions: " + deque); // [Element0, Element1, Element2]

        // 🧹 Remove from both ends
        String first = deque.removeFirst(); // Removes "Element0"
        String last = deque.removeLast();   // Removes "Element2"

        System.out.println("First removed: " + first); // Element0
        System.out.println("Last removed: " + last);   // Element2
        System.out.println("Final Deque: " + deque);   // [Element1]
    }
}
