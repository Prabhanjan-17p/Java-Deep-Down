package Java_8.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        /*
        ✅ Consumer<T> – Java 8 Functional Interface
        ------------------------------------------------------
        ➤ Represents an operation that accepts a single input argument and returns no result.
        ➤ Often used to perform side-effects like printing, logging, saving, etc.
        ➤ Method:
           - void accept(T t)
        ➤ Default Method:
           - andThen(Consumer): chains multiple consumers in order
        */

        // 🔹 Example 1: Print square of a number
        Consumer<Integer> square = x -> System.out.println("Square of given number is: " + (x * x));
        square.accept(5); // Output: 25

        // 🔹 Example 2: Print all elements of a list
        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> printList = nums -> {
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        };
        printList.accept(list); // Output: 1 2 3
    }
}
