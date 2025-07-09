package Queue.BlockingQueue.ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {

        /*
        ✅ What is ArrayBlockingQueue?
        ---------------------------------------
        - A bounded, thread-safe queue backed by a **circular array**.
        - Part of the `java.util.concurrent` package (since Java 1.5).

        ❓ Why it was introduced:
        ---------------------------------------
        - To solve classic **producer-consumer** problems.
        - Needed a **fixed-size**, thread-safe blocking queue with predictable memory usage.

        ⚠️ The Problem:
        ---------------------------------------
        - Standard queues like LinkedList are **not thread-safe**.
        - Synchronizing manually for producer-consumer leads to complexity.

        🔧 The Fix – ArrayBlockingQueue:
        ---------------------------------------
        - Bounded queue → prevents memory overuse.
        - Uses a **single lock** for both put() and take() → less concurrency but simpler.
        - Blocks producer when full and consumer when empty.
        - Useful in environments with controlled capacity and simple threading.
        */

        // ✅ 1. ArrayBlockingQueue — Fixed capacity, backed by a circular array
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        // 🟢 Key Features:
        // - Bounded, thread-safe queue
        // - Backed by circular array for fixed memory usage
        // - put()     → blocks if full
        // - take()    → blocks if empty
        // - offer(E, timeout, unit) → waits with timeout (optional)
        // - Single lock controls both producers and consumers

        try {
            queue.put(1); // Adds to queue
            queue.put(2);
            queue.put(3);
            queue.put(4);
            queue.put(5);
            System.out.println("Queue after inserts: " + queue);

            // Trying to put sixth item will block unless space is available
            // queue.put(6); // blocks!

            System.out.println("Taking element: " + queue.take()); // Removes head (1)
            System.out.println("Taking element: " + queue.take()); // Removes head (2)

            System.out.println("Queue after removals: " + queue);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread interrupted.");
        }
    }
}
