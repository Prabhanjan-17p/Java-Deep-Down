package Queue.BlockingQueue.LinkedBlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// ✅ Producer using LinkedBlockingQueue
class LinkedProducer implements Runnable {
    private final BlockingQueue<Integer> queue;
    private int value = 0;

    public LinkedProducer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Producer produced: " + value);
                queue.put(value++); // Blocks if bounded and full
                Thread.sleep(500);  // Simulate time to produce
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Producer interrupted.");
        }
    }
}

// ✅ Consumer using LinkedBlockingQueue
class LinkedConsumer implements Runnable {
    private final BlockingQueue<Integer> queue;

    public LinkedConsumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Integer item = queue.take(); // Blocks if queue is empty
                System.out.println("Consumer consumed: " + item);
                Thread.sleep(1000);  // Simulate time to consume
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Consumer interrupted.");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // ✅ 2. LinkedBlockingQueue — Optionally bounded, backed by a linked list
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(3); // Bounded example (can also be unbounded)

        // 🟢 Features:
        // - Optionally bounded (if no capacity specified, it's effectively unbounded)
        // - Uses **two separate locks** → high concurrency
        // - Suitable for heavy producer-consumer scenarios

        Thread producer = new Thread(new LinkedProducer(queue));
        Thread consumer = new Thread(new LinkedConsumer(queue));

        producer.start();
        consumer.start();
    }
}
