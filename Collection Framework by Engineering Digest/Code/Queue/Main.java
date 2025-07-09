package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {

        // ✅ Queue Overview:

        // 🟢 What is a Queue?
        // ✔️ A linear data structure that follows **FIFO (First In, First Out)** order.
        // ✔️ Elements are inserted at the rear (enqueue) and removed from the front (dequeue).

        // 🔴 Problem:
        // - Using LinkedList directly as a queue introduces redundancy.
        // - To provide a standard structure and cleaner API, Java introduced the Queue interface.

        // ✅ 1. Using LinkedList as a Queue:
        System.out.println("LinkedList as Queue:");
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1); // Enqueue
        list.addLast(2);
        list.addLast(3);
        System.out.println("After enqueue: " + list);

        list.removeFirst(); // Dequeue
        System.out.println("After dequeue: " + list);

        System.out.println("Peek (front): " + list.getFirst());
        System.out.println();

        // ✅ 2. Using Queue Interface (Backed by LinkedList):
        System.out.println("Queue Interface Example:");

        Queue<Integer> queue = new LinkedList<>();

        // Enqueue: add() or offer()
        queue.add(10);
        queue.offer(20);

        // Dequeue: remove() or poll()
        System.out.println("Removed (using remove): " + queue.remove()); // throws exception if empty
        System.out.println("Removed (using poll): " + queue.poll());     // returns null if empty

        // Peek: element() or peek()
        System.out.println("Peek (using element): " + queue.element()); // throws exception if empty
        System.out.println("Peek (using peek): " + queue.peek());       // returns null if empty
        System.out.println();

        // ✅ 3. Using ArrayBlockingQueue:
        System.out.println("ArrayBlockingQueue Example:");

        Queue<Integer> queue1 = new ArrayBlockingQueue<>(2);

        queue1.add(1);     // Adds element
        queue1.offer(2);   // Adds element

        // Adding third item beyond capacity
        // queue1.add(3);  // ❌ Throws IllegalStateException: Queue full
        boolean offered = queue1.offer(4); // ✅ Returns false instead of throwing
        System.out.println("Offer result for 4 (full queue): " + offered);

        System.out.println("Final Queue: " + queue1);
    }
}
