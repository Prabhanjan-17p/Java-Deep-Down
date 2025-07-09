package Queue.Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // ✅ Deque Overview:

        // 🟢 What is Deque?
        // ✔️ Deque = "Double-Ended Queue"
        // ✔️ Allows insertion and removal of elements **from both front and rear**.
        // ✔️ Supports both **queue** and **stack** operations.
        // ✔️ More versatile than regular queues or stacks.

        // ✅ Types of Implementations:
        // 🔸 ArrayDeque — faster, memory-efficient, no nulls allowed.
        // 🔸 LinkedList — supports insertion/removal in the middle too.

        // 🛠️ INSERTION METHODS:
        // addFirst(E e)      — Inserts at front (throws exception if fails)
        // addLast(E e)       — Inserts at rear (throws exception if fails)
        // offerFirst(E e)    — Inserts at front (returns false if fails)
        // offerLast(E e)     — Inserts at rear (returns false if fails)

        // 🧹 REMOVAL METHODS:
        // removeFirst()      — Removes from front (throws exception if empty)
        // removeLast()       — Removes from rear (throws exception if empty)
        // pollFirst()        — Removes from front (returns null if empty)
        // pollLast()         — Removes from rear (returns null if empty)

        // 🔍 EXAMINATION METHODS:
        // getFirst()         — Peeks front (throws exception if empty)
        // getLast()          — Peeks rear (throws exception if empty)
        // peekFirst()        — Peeks front (returns null if empty)
        // peekLast()         — Peeks rear (returns null if empty)

        // 📦 STACK METHODS:
        // push(E e)          — Same as addFirst()
        // pop()              — Same as removeFirst()

        // ✅ Using ArrayDeque
        Deque<Integer> deque1 = new ArrayDeque<>();
        deque1.addFirst(10);      // Adds to front → [10]
        deque1.addLast(20);       // Adds to rear → [10, 20]
        deque1.offerFirst(5);     // Adds to front → [5, 10, 20]
        deque1.offerLast(25);     // Adds to rear → [5, 10, 20, 25]

        System.out.println("Initial Deque: " + deque1); // Output: [5, 10, 20, 25]

        // Examining elements
        System.out.println("First Element: " + deque1.getFirst()); // 5
        System.out.println("Last Element: " + deque1.getLast());   // 25

        // Removing from both ends
        deque1.removeFirst(); // Removes 5 → [10, 20, 25]
        deque1.pollLast();    // Removes 25 → [10, 20]

        // Iterating current deque
        System.out.println("Deque after removals:");
        for (int num : deque1) {
            System.out.println(num); // Output: 10, 20
        }

        // ✅ Using LinkedList as Deque
        Deque<Integer> deque2 = new LinkedList<>();
        deque2.push(100); // Same as addFirst()
        deque2.push(200);
        deque2.pop();     // Same as removeFirst()

        System.out.println("LinkedList as Deque: " + deque2); // Output: [100]
    }
}
