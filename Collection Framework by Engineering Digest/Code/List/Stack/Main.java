package List.Stack;

import java.util.LinkedList;
import java.util.Stack;

// Stack extends Vector, which means Stack is also synchronized by default (Thread-safe)
public class Main {
    public static void main(String[] args) {

        /**
         * What is Stack?
         * ----------------
         * - Stack is a linear data structure based on the **LIFO (Last In, First Out)** principle.
         * - Java provides a built-in Stack class in java.util package.
         * - Stack is a subclass of Vector, hence it inherits synchronization and dynamic array behavior.
         * - Elements are added or removed only from the top of the stack.
         */

        /**
         * Key Features of Stack:
         * ------------------------
         * 1. Follows LIFO – Last element pushed is the first one popped.
         * 2. Synchronized – Because it extends Vector.
         * 3. Dynamic – Grows/shrinks dynamically as needed.
         * 4. Methods like push(), pop(), peek(), search(), isEmpty() are available.
         * 5. Useful in recursive algorithms, parsing expressions, undo mechanisms, etc.
         */

        /**
         * Problems with Stack:
         * ---------------------
         * 1. Slower – Due to synchronization overhead.
         * 2. Limited Usage – Considered outdated in modern concurrent environments.
         * 3. Inherits all of Vector’s inefficiencies and memory usage.
         */

        /**
         * How Stack Overcomes Limitations:
         * ----------------------------------
         * - Provides built-in methods tailored for stack operations unlike general-purpose lists.
         * - Easy to implement LIFO logic without writing from scratch.
         */

        /**
         * Benefits of Stack:
         * -------------------
         * - Simple and ready-to-use LIFO structure.
         * - Thread-safe without needing external synchronization.
         * - Still useful for basic stack-based operations in single-threaded or legacy apps.
         *
         * ✅ Modern alternative: Use Deque (ArrayDeque or LinkedList) for better performance in single-threaded environments.
         */

        // ---------------- Using Stack ----------------
        Stack<Integer> stack = new Stack<>();

        // Adding elements to the stack (push operation)
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack); // Output: [1, 2, 3, 4, 5]

        // Removing the top element (pop operation)
        Integer s1 = stack.pop();
        System.out.println(s1);    // Output: 5
        System.out.println(stack); // Output: [1, 2, 3, 4]

        // Accessing the top element without removing it (peek)
        Integer peak = stack.peek();
        System.out.println(peak);  // Output: 4
        System.out.println(stack); // Stack remains unchanged

        // Check if the stack is empty
        System.out.println(stack.isEmpty()); // false

        // Check size of the stack
        System.out.println(stack.size()); // 4

        // Search element in stack (returns 1-based position from top or -1 if not found)
        Integer search = stack.search(1);
        System.out.println(search); // Output: 4 (if 1 is 4th from top)

        /*
         * Alternative: Stack using LinkedList
         * -------------------------------------
         * Though Java provides Stack class, you can implement a stack using LinkedList.
         * LinkedList provides methods like addLast(), removeLast(), and getLast()
         * which make it suitable for stack behavior.
         */

        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        System.out.println(list);       // Output: [1, 2, 3, 4, 5]

        Integer find = list.getLast();  // Peek operation
        System.out.println(find);       // Output: 5

        list.removeLast();              // Pop operation
        System.out.println(list);       // Output: [1, 2, 3, 4]
    }
}
