//package Queue.BlockingQueue;
//
//import java.util.Comparator;
//import java.util.concurrent.*;
//
//class Producer implements Runnable {
//    private BlockingQueue<Integer> queue;
//    private int value = 0;
//
//    public Producer(BlockingQueue<Integer> queue) {
//        this.queue = queue;
//    }
//
//    @Override
//    public void run() {
//        while (true) {
//            try {
//                System.out.println("Producer produced: " + value);
//                queue.put(value++);
//                Thread.sleep(1000);
//            } catch (Exception e) {
//                Thread.currentThread().interrupt();
//                System.out.println("Producer interrupted");
//            }
//        }
//    }
//}
//
//
//class Consumer implements Runnable {
//    private BlockingQueue<Integer> queue;
//
//    public Consumer(BlockingQueue<Integer> queue) {
//        this.queue = queue;
//    }
//
//    @Override
//    public void run() {
//        while (true) {
//            try {
//                Integer value = queue.take();
//                System.out.println("Consumer consumed: " + value);
//                Thread.sleep(2000);
//            } catch (Exception e) {
//                Thread.currentThread().interrupt();
//                System.out.println("Consumer interrupted");
//            }
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
//        // thread-safe queue
//        // wait for queue to become non-empty / wait for space
//        // simplify concurrency problems like producer-consumer
//        // standard queue --> immediately
//        // empty --> remove ( no waiting )
//        // full --> add ( no waiting )
//        // Blocking queue
//        // put -->  Blocks if the queue is full until space becomes available
//        // take --> Blocks if the queue is empty until an element becomes available
//        // offer --> Waits for space to become available, up to the specified timeout
//
//        // A bounded, blocking queue backed by circular array
//        // low memory overhead
//        // uses a single lock for both enqueue and dequeue operations
//        // more threads --> problem
//        Thread producer = new Thread(new Producer(queue));
//        Thread consumer = new Thread(new Consumer(queue));
//        producer.start();
//        consumer.start();
//        BlockingQueue<Integer> queue1 =  new LinkedBlockingQueue<>();
//        // optionally bounded backed by LinkedList
//        // Uses two separate locks for enqueue and dequeue operations
//        // Higher concurrency between producers and consumers
//        BlockingQueue<String> queue2 = new PriorityBlockingQueue<>(11, Comparator.reverseOrder());
//        // unbounded
//        // Binary Heap as array and can grow dynamically
//        // Head is based on their natural ordering or a provided Comparator like priority queue
//        // put wont block
//        queue2.add("apple");
//        queue2.add("banana");
//        queue2.add("cherry");
//        System.out.println(queue2);
//        BlockingQueue<Integer> queue3 =  new SynchronousQueue<>();
//        // each insert operation must wait for a corresponding remove operation by another thread and vice versa.
//        // it cannot store elements, capacity of at most one element
//
//    }
//}


package Queue.BlockingQueue;

import java.util.Comparator;
import java.util.concurrent.*;

// ✅ Producer class: Adds data into the queue
class Producer implements Runnable {
    private final BlockingQueue<Integer> queue;
    private int value = 0;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Producer produced: " + value);
                queue.put(value++); // Blocks if queue is full
                Thread.sleep(1000);  // Simulate processing time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer interrupted");
            }
        }
    }
}

// ✅ Consumer class: Consumes data from the queue
class Consumer implements Runnable {
    private final BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Integer value = queue.take(); // Blocks if queue is empty
                System.out.println("Consumer consumed: " + value);
                Thread.sleep(2000);  // Simulate processing time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // ✅ 1. ArrayBlockingQueue — Fixed capacity, backed by a circular array
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        // 🟢 Key Features:
        // - Bounded, thread-safe queue
        // - Uses one lock for both put and take
        // - Suitable for basic producer-consumer problems
        // - put() → blocks if full
        // - take() → blocks if empty
        // - offer(E, timeout, unit) → waits with timeout

        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));
        producer.start();
        consumer.start();

        // ✅ 2. LinkedBlockingQueue — Optionally bounded, backed by a linked list
        BlockingQueue<Integer> queue1 = new LinkedBlockingQueue<>();
        // 🟢 Features:
        // - Can be bounded or unbounded
        // - Uses **two locks**: one for put(), another for take() → better concurrency
        // - Ideal for high-volume producer-consumer scenarios

        // ✅ 3. PriorityBlockingQueue — Unbounded, supports element priority
        BlockingQueue<String> queue2 = new PriorityBlockingQueue<>(11, Comparator.reverseOrder());

        queue2.add("apple");
        queue2.add("banana");
        queue2.add("cherry");

        // 🟢 Features:
        // - Unbounded blocking queue
        // - Orders elements based on **natural ordering** or custom Comparator
        // - Internally uses a binary heap
        // - put() does NOT block since it's unbounded
        System.out.println("PriorityBlockingQueue contents: " + queue2); // Output based on priority

        // ✅ 4. SynchronousQueue — No storage; each put waits for a take
        BlockingQueue<Integer> queue3 = new SynchronousQueue<>();

        // 🟢 Features:
        // - Capacity is always 0 (no internal storage)
        // - put() and take() must happen simultaneously (handoff)
        // - Ideal for **direct handoff** or rendezvous between threads
    }
}

