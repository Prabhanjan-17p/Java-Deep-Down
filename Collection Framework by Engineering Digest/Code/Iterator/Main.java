package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        /*
        ✅ What is Iterator?
        ------------------------------------------
        - A **universal cursor** for traversing collections.
        - Can be used with any Collection (List, Set, etc.)
        - Methods:
          → hasNext()
          → next()
          → remove()

        ❌ For-each loop doesn't allow element removal during traversal.
        ✅ Iterator allows **safe removal** while iterating.
        */

        System.out.println("🔁 Basic Iteration Using for-each:");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        for (int i : list) {
            System.out.println(i); // Internally uses iterator
        }

        System.out.println("\n🔁 Iteration Using Iterator:");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*
        🔄 Demonstrating Modification:
        ------------------------------------------
        - Removing items while iterating with for-each → ❌ ConcurrentModificationException
        - Using Iterator's remove() method → ✅ Safe
        */

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2); // to be removed
        numbers.add(3);
        numbers.add(4); // to be removed
        numbers.add(5);

        System.out.println("\n🔁 Removing even numbers using Iterator:");
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            Integer number = itr.next();
            if (number % 2 == 0) {
                itr.remove(); // ✅ Safe remove
            }
        }
        System.out.println("Updated list: " + numbers); // [1, 3, 5]

        /*
        ✅ ListIterator:
        ------------------------------------------
        - Only for List interface.
        - Bi-directional cursor → can move both forward and backward.
        - Additional methods: previous(), hasPrevious(), add(), set()
        */

        System.out.println("\n🔁 Traversing using ListIterator:");
        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()) {
            Integer value = listIterator.next();
            System.out.println("Value: " + value);
            // listIterator.set(value + 100); // You can modify elements here
        }

        System.out.println("Final list: " + numbers);
    }
}
