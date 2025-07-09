package Queue.BlockingQueue.PriorityBlockingQueue;


import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {
    public static void main(String[] args) {

        /*
        ✅ What is PriorityBlockingQueue?
        ----------------------------------------
        - An **unbounded**, thread-safe priority queue.
        - Supports **natural ordering** (Comparable) or a **custom Comparator**.
        - Backed internally by a **binary heap**.

        ❓ Why it was introduced:
        ----------------------------------------
        - In concurrent environments, regular PriorityQueue is **not thread-safe**.
        - Needed a blocking version to support **producer-consumer** style patterns where priority matters.

        ⚠️ The Problem:
        ----------------------------------------
        - With standard queues, all elements are treated equally (FIFO).
        - In real-world scenarios (task scheduling, job prioritization), priorities are often required.

        🔧 The Fix – PriorityBlockingQueue:
        ----------------------------------------
        - Automatically reorders elements based on priority.
        - **put()** doesn't block because it's unbounded.
        - **take()** waits if queue is empty.
        - Efficient and scalable for concurrent access.
        */

        // ✅ 3. PriorityBlockingQueue — Unbounded, supports element priority
        BlockingQueue<String> queue = new PriorityBlockingQueue<>(11, Comparator.reverseOrder());

        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");

        // 🟢 Features:
        // - Unbounded, thread-safe queue
        // - Priority-based ordering (reverse order here: Z to A)
        // - Does not allow null elements
        // - Suitable for job/task prioritization in concurrent apps
        // - No blocking on put()

        System.out.println("PriorityBlockingQueue contents (heap structure): " + queue);

        System.out.println("Polling based on priority:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // Polls in descending order: cherry, banana, apple
        }
    }
}
