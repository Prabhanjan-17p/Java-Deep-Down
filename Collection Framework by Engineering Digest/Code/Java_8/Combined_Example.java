package Java_8;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Combined_Example {
    public static void main(String[] args) {

        // ✅ Basic Functional Interfaces:

        // Predicate: Takes one input, returns boolean (used for filtering or conditions)
        Predicate<Integer> predicate = x -> x % 2 == 0;

        // Function: Takes one input, returns one output (used for transformation/mapping)
        Function<Integer, Integer> function = x -> x * x;

        // Consumer: Takes input, returns nothing (used for printing/logging, etc.)
        Consumer<Integer> consumer = x -> System.out.println(x);

        // Supplier: Takes nothing, returns something (used for lazy value generation)
        Supplier<Integer> supplier = () -> 100;

        // Using all above together
        if (predicate.test(supplier.get())) { // Check if supplier value is even
            consumer.accept(function.apply(supplier.get())); // Square it and print
        }


        // ✅ Bi-Functional Interfaces:

        // BiPredicate: Takes 2 inputs, returns boolean
        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;
        System.out.println(isSumEven.test(12, 2)); // true

        // BiConsumer: Takes 2 inputs, returns nothing
        BiConsumer<String, Integer> stringLen = (x, y) -> {
            System.out.print(x.length()); // prints string length
            System.out.println(" " + y);
        };
        stringLen.accept("kanha", 3);

        // BiFunction: Takes 2 inputs, returns 1 output
        BiFunction<String, String, Integer> sumStringLen = (x, y) -> x.length() + y.length();
        System.out.println(sumStringLen.apply("pravanjan", "amanta")); // total length


        // ✅ UnaryOperator & BinaryOperator:

        // Function that takes and returns same type (instead of Function<T, T>)
        Function<Integer, Integer> tt = x -> x * x; // normal function
        UnaryOperator<Integer> tt2 = x -> x * x;    // better for same-type in/out

        // BiFunction with same type input/output
        BiFunction<Integer, Integer, Integer> tt3 = (x, y) -> x + y; // normal bi-function
        BinaryOperator<Integer> tt4 = (x, y) -> x + y;               // better alternative


        // ✅ Method Reference:

        // Method reference as an alternative to lambda for clean syntax
        List<String> student = Arrays.asList("Amar", "Harshit", "kanha");

        // Using Consumer with lambda
        student.forEach(x -> System.out.println(x));

        // Using method reference (cleaner)
        student.forEach(System.out::println);



        // ✅ Constructor Reference:

        List<String> name = Arrays.asList("iPhone", "Realm", "Vivo");

        // Create Mobile objects from names using constructor reference
        List<Mobile> collectMobile = name.stream()
                .map(Mobile::new) // Constructor reference
                .collect(Collectors.toList());

        // Print the list of Mobile objects
        System.out.println(collectMobile);
    }
}

// POJO class for constructor reference example
class Mobile {
    String name;

    public Mobile(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                '}';
    }
}
