package Queue.ConcurrentLinkedQueue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {

    // ✅ Thread-safe, non-blocking queue — ideal for high-concurrency scenarios
    private static ConcurrentLinkedQueue<String> taskQueue = new ConcurrentLinkedQueue<>();

    public static void main(String[] args) {

        // ✅ Why use ConcurrentLinkedQueue?
        // - Overcomes synchronized issues in legacy queues like LinkedList.
        // - In synchronized collections, if one thread is doing `put`, another thread doing `take` would block.
        // - ConcurrentLinkedQueue uses non-blocking Compare-And-Swap (CAS), allowing true parallelism.

        // 🔁 put-put (Thread A & Thread B adding at the same time):
        // - ✅ Allowed
        // - No blocking or synchronization needed
        // - Uses CAS to add at the tail
        // - Both threads can add concurrently without interference

        // 🔁 take-take (Thread C & Thread D removing at the same time):
        // - ✅ Allowed
        // - CAS used to update the head
        // - Both can poll simultaneously and safely get distinct elements

        // 🔁 put-take (Thread A adding while Thread B polling):
        // - ✅ Allowed
        // - One thread adds to tail, the other removes from head
        // - Both operations use independent CAS, so they don't block each other

        // 🔒 No locks involved, so:
        // ➤ High throughput
        // ➤ No thread blocking
        // ➤ Ideal for message queues, job pipelines, etc.

        /*
        ✅ What is ConcurrentLinkedQueue?
        -------------------------------------------------
        - A **non-blocking**, **thread-safe** queue.
        - Based on **lock-free algorithms** using **Compare-And-Swap (CAS)**.
        - Implements a **FIFO** queue (like LinkedList).

        ❓ Why it was introduced:
        -------------------------------------------------
        - To solve the issue of **synchronized queues** like `LinkedList`, which block during concurrent access.
        - Avoids thread contention → improves performance in high-concurrency environments.

        ⚠️ The Problem:
        -------------------------------------------------
        - Standard queues (e.g., LinkedList) are not thread-safe.
        - Synchronization leads to blocking → reduces throughput.
        - Blocking queues like `ArrayBlockingQueue` are good but may not be needed when non-blocking performance is preferred.

        🔧 The Fix – ConcurrentLinkedQueue:
        -------------------------------------------------
        - Uses lock-free techniques for fast, safe access.
        - Ideal for **scalable concurrent applications** where blocking is unnecessary.
        */

        // 🔁 Producer Thread — continuously adds tasks
        Thread producer = new Thread(() -> {
            while (true) {
                try {
                    String task = "Task " + System.currentTimeMillis();
                    taskQueue.add(task);
                    System.out.println("Produced: " + task);
                    Thread.sleep(500); // Slow down producer slightly
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // 🔁 Consumer Thread — continuously polls tasks
        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    String task = taskQueue.poll(); // returns null if empty
                    if (task != null) {
                        System.out.println("✅ Consumed: " + task);
                    }
                    Thread.sleep(700); // Simulate some processing delay
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
