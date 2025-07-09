package Java_8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        /*
        ✅ Stream API — Introduced in Java 8
        ----------------------------------------------------
        ➤ Used to process collections of data in a functional & declarative way
        ➤ Helps in:
           - Simplifying data processing
           - Embracing functional programming
           - Improving readability and maintainability
           - Enabling easy parallelism for better performance
        */

        /*
        ✅ What is a Stream?
        ➤ A sequence of elements that supports various operations to process data
        ➤ Works with collections (like List, Set) without modifying the original data
        */

        /*
        ✅ Why Streams?
        ➤ Reduces boilerplate code using filter, map, reduce, etc.
        ➤ Encourages cleaner code by chaining operations
        ➤ Avoids manual loops and conditional logic
        */

        /*
        ✅ Example: Count even numbers using Stream
        */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        long evenCount = numbers.stream()
                .filter(x -> x % 2 == 0) // filter even
                .count();                // count them
        System.out.println("Total even numbers: " + evenCount); // Output: 2

        /*
        ✅ Creating Streams in Java
        -----------------------------------------------------
        */

        // 1. From a collection (List, Set, etc.)
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> streamFromList = list.stream();

        // 2. From an array
        String[] array = {"a", "b", "c"};
        Stream<String> streamFromArray = Arrays.stream(array);

        // 3. Using Stream.of()
        Stream<String> streamOfValues = Stream.of("a", "b");

        // 4. Infinite Streams (use with limit!)
        Stream<Integer> generatedStream = Stream.generate(() -> 1).limit(5);  // 1, 1, 1, 1, 1
        Stream<Integer> iteratedStream = Stream.iterate(1, x -> x + 1).limit(5); // 1, 2, 3, 4, 5

        // Just printing to verify infinite stream usage
        generatedStream.forEach(System.out::println);
        iteratedStream.forEach(System.out::println);
    }
}
