package Java_8.Stream;

import java.util.*;
import java.util.stream.*;

public class TerminalOps {
    public static void main(String[] args) {

        // ✅ Terminal Operations: Used to trigger the execution of the stream pipeline
        // - They **consume** the stream and produce a result (e.g., value, collection, side-effect)
        // - Once a terminal operation is executed, the stream cannot be reused


        List<Integer> list = Arrays.asList(1, 2, 3);

        /*
         ✅ 1. collect(): Collects the elements of the stream into a collection
         */
        System.out.println("Collect to List: " + list.stream().skip(1).collect(Collectors.toList()));
        System.out.println("Collect using toList(): " + list.stream().skip(1).toList()); // Java 16+

        /*
         ✅ 2. forEach(): Performs an action for each element
         */
        System.out.println("Using forEach:");
        list.stream().forEach(System.out::println);

        /*
         ✅ 3. reduce(): Combines stream elements into a single result
         */
        Optional<Integer> sum = list.stream().reduce(Integer::sum); // Same as (a, b) -> a + b
        sum.ifPresent(value -> System.out.println("Sum using reduce: " + value));

        /*
         ✅ 4. count(): Counts number of elements in stream
         */
        long count = list.stream().count();
        System.out.println("Count: " + count);

        /*
         ✅ 5. anyMatch(), allMatch(), noneMatch(): Short-circuiting operations
         */
        System.out.println("Any even? " + list.stream().anyMatch(x -> x % 2 == 0)); // true
        System.out.println("All positive? " + list.stream().allMatch(x -> x > 0));   // true
        System.out.println("None negative? " + list.stream().noneMatch(x -> x < 0)); // true

        /*
         ✅ 6. findFirst(), findAny(): Return Optional of first/any element
         */
        System.out.println("First element: " + list.stream().findFirst().orElse(-1));
        System.out.println("Any element: " + list.stream().findAny().orElse(-1));

        /*
         ✅ 7. toArray(): Convert stream to array
         */
        Object[] array = list.stream().toArray();
        System.out.println("Array: " + Arrays.toString(array));

        /*
         ✅ 8. min() / max(): Return Optional of min/max element
         */
//        Stream.of(2,4,6).min()
        System.out.println("Max: " + Stream.of(2, 44, 69).max(Integer::compareTo).orElse(-1));
        System.out.println("Min: " + Stream.of(2, 44, 69).min(Comparator.naturalOrder()).orElse(-1));

        /*
         ✅ 9. forEachOrdered(): Maintains encounter order (used with parallelStream)
         */
        List<Integer> numbers0 = IntStream.rangeClosed(1, 10).boxed().toList();
        System.out.println("Using forEach (parallel):");
        numbers0.parallelStream().forEach(System.out::println); // May print in any order
        System.out.println("Using forEachOrdered (parallel):");
        numbers0.parallelStream().forEachOrdered(System.out::println); // Maintains order

        /*
         🔁 Practical Examples
         */

        // Filter names with length > 3
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        System.out.println("Names > 3 chars: " + names.stream().filter(x -> x.length() > 3).toList());

        // Square and sort numbers
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 6);
        System.out.println("Squared & sorted: " + numbers.stream().map(x -> x * x).sorted().toList());

        // Sum values
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
//        System.out.println("Sum using reduce: " + integers.stream().reduce(Integer::sum).get());
        System.out.println("Sum using reduce: " + integers.stream().reduce((x,y)->x+y).get());

        // Count character occurrences
        String sentence = "Hello world";
        System.out.println("Count of 'l': " + sentence.chars().filter(x -> x == 'l').count());

        /*
         ⚠️ Important Note: Streams can't be reused after a terminal operation
         */
        Stream<String> reusableStream = names.stream();
        reusableStream.forEach(System.out::println);
        // reusableStream.map(String::toUpperCase).toList(); // ❌ IllegalStateException

        /*
         Stateless vs Stateful Operations:
         - Stateless: map, filter → no knowledge of previous elements
         - Stateful: sorted, distinct, limit → depend on previous elements
         */
    }
}
