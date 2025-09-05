package List.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Mian {
    public static void main(String[] args) {

        /**
         * What is LinkedList?
         * ---------------------
         * A LinkedList is a linear data structure where elements are stored in nodes.
         * Each node contains two parts: the data and a reference (link) to the next node in the sequence.
         * Java provides a doubly-linked list implementation via java.util.LinkedList.
         * It implements both the List and Deque interfaces, allowing it to be used as a list, queue, or stack.
         */

        /**
         * Key Features of LinkedList:
         * ----------------------------
         * 1. Dynamic Size – Can grow and shrink dynamically without memory reallocation.
         * 2. Faster Insertion/Deletion – Especially at the beginning or middle (O(1) for head/tail operations).
         * 3. Doubly Linked – Each node points to both the previous and next node.
         * 4. Allows Duplicate Elements.
         * 5. Maintains Insertion Order.
         */

        /**
         * Problems with LinkedList:
         * --------------------------
         * 1. Slower Access Time – Random access (get(index)) is O(n) because we must traverse nodes.
         * 2. More Memory Usage – Each node stores two references (next and previous).
         * 3. Not Cache Friendly – Nodes are scattered in memory, so not optimal for cache performance.
         */

        /**
         * How LinkedList Overcomes Limitations of ArrayList:
         * ---------------------------------------------------
         * - ArrayList has slow insertions/removals from the middle (O(n)) due to shifting elements.
         *   LinkedList overcomes this with O(1) insert/remove (once you reach the node).
         * - ArrayList has fixed capacity (resizing costly), but LinkedList can grow as needed.
         */

        /**
         * Benefits of LinkedList:
         * ------------------------
         * - Ideal when frequent add/remove operations are required.
         * - Suitable for implementing stacks, queues, and deques.
         * - Provides methods like addFirst(), addLast(), getFirst(), getLast() that are efficient.
         */

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
//        linkedList.add(2,2223);
        System.out.println(linkedList.get(2)); // Find the value according to the index (O(n) time)

        linkedList.addFirst(0); // Time complexity is O(1)
        linkedList.addLast(4); // Time complexity is O(1)
        linkedList.getFirst(); // Retrieve first element (O(1))
        linkedList.getLast();  // Retrieve last element (O(1))

        // removeIf: removes elements based on a condition (lambda expression)
        linkedList.removeIf(x -> x % 2 == 0); // It will remove the even numbers
        System.out.println(linkedList); // Output will show remaining odd elements

        /*
         * removeAll() example:
         * ---------------------
         * This method removes all elements from the list that are also present in the provided collection.
         * Useful to filter out common elements between two lists.
         */

        LinkedList<String> animal = new LinkedList<>(Arrays.asList("cat", "dog", "elephant"));
        LinkedList<String> animalToRemove = new LinkedList<>(Arrays.asList("dog", "Lion"));
        animal.removeAll(animalToRemove);
        System.out.println(animal); // Output: [cat, elephant]
    }
}
