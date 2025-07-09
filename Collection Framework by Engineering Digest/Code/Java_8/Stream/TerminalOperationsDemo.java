package Java_8.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class TerminalOperationsDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        // 1. forEach(): performs action on each element
        System.out.println("1. forEach:");
        list.stream().forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        // 2. forEachOrdered(): ordered version of forEach in parallel streams
        System.out.println("2. forEachOrdered:");
        list.parallelStream().forEachOrdered(System.out::println);

        // 3. toArray(): converts to array
        System.out.println("3. toArray:");
        Object[] arr = list.stream().toArray();
        System.out.println(Arrays.toString(arr));

        // 4. reduce(): reduce elements to a single result
        System.out.println("4. reduce:");
        Optional<Integer> reducedSum = list.stream().reduce((a, b) -> a + b);
        reducedSum.ifPresent(x -> System.out.println("Sum = " + x));

        // 5. collect(): gather elements into collection
        System.out.println("5. collect:");
        List<Integer> collectedList = list.stream().collect(Collectors.toList());
        System.out.println(collectedList);

        // 6. min(): find minimum element
        System.out.println("6. min:");
        Optional<Integer> min = list.stream().min(Integer::compareTo);
        min.ifPresent(x -> System.out.println("Min = " + x));

        // 7. max(): find maximum element
        System.out.println("7. max:");
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        max.ifPresent(x -> System.out.println("Max = " + x));

        // 8. count(): number of elements
        System.out.println("8. count:");
        long count = list.stream().count();
        System.out.println("Count = " + count);

        // 9. anyMatch(): check if any match the condition
        System.out.println("9. anyMatch:");
        boolean anyMatch = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println("Any even? " + anyMatch);

        // 10. allMatch(): check if all match the condition
        System.out.println("10. allMatch:");
        boolean allMatch = list.stream().allMatch(x -> x > 0);
        System.out.println("All positive? " + allMatch);

        // 11. noneMatch(): check if none match the condition
        System.out.println("11. noneMatch:");
        boolean noneMatch = list.stream().noneMatch(x -> x < 0);
        System.out.println("No negative? " + noneMatch);

        // 12. findFirst(): get the first element
        System.out.println("12. findFirst:");
        Optional<Integer> first = list.stream().findFirst();
        first.ifPresent(x -> System.out.println("First = " + x));

        // 13. findAny(): get any element (especially in parallel)
        System.out.println("13. findAny:");
        Optional<Integer> any = list.parallelStream().findAny();
        any.ifPresent(x -> System.out.println("Any = " + x));
    }
}
