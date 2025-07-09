package Queue.BlockingQueue.SynchronousQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        /*
        ✅ What is SynchronousQueue?
        -------------------------------------
        - A thread-safe queue with **zero capacity**.
        - Does NOT store elements — every `put()` must wait for a `take()`, and vice versa.
        - Designed for **direct handoff** between threads.

        ❓ Why it was introduced:
        -------------------------------------
        - Traditional queues (e.g., ArrayBlockingQueue) buffer data temporarily.
        - Some applications need **real-time coordination**: producer should not continue unless consumer is ready.

        ⚠️ The Issue:
        -------------------------------------
        - In systems like task executors or handoff pipelines, we need **immediate delivery** of data.
        - Buffered queues introduce latency and resource use (memory).

        🔧 The Fix – SynchronousQueue:
        -------------------------------------
        - Solves the issue by forcing synchronization between producer and consumer.
        - Ensures tight coupling (synchronous behavior).
        - Commonly used in:
            ➤ ThreadPoolExecutor (using `Executors.newCachedThreadPool()`)
            ➤ Real-time communication tasks
        */
        BlockingQueue<String> queue = new SynchronousQueue<>();
        Thread producer = new Thread(() -> {
            try {
                System.out.println("Producer is waiting to transfer...");
                queue.put("Hello from producer!");
                System.out.println("Producer has transferred the message.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Producer was interrupted.");
            }
        });
        Thread consumer = new Thread(() -> {
            try {
                System.out.println("Consumer is waiting to receive...");
                String message = queue.take();
                System.out.println("Consumer received: " + message);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Consumer was interrupted.");
            }
        });
        producer.start();
        consumer.start();

    }
}