package Java_8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluationDemo {
    public static void main(String[] args) {

        // 🔹 Stream in Java is lazily evaluated.
        // That means intermediate operations (like filter, map, etc.)
        // do NOT execute until a terminal operation is called.

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // 🔸 This creates a stream with a filter operation,
        // but nothing is printed yet (no execution happens).
        Stream<String> stream = names.stream()
                .filter(name -> {
                    System.out.println("Filtering: " + name); // this runs only during terminal operation
                    return name.length() > 3;
                });

        System.out.println("Before terminal operation");

        // 🔸 Terminal operation: collect triggers stream processing
        List<String> result = stream.collect(Collectors.toList());

        System.out.println("After terminal operation");
        System.out.println(result);  // prints: [Alice, Charlie, David]
    }
}
