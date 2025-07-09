package Java_8.Stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Collectors_Java8 {
    public static void main(String[] args) {

        // 🔹 Collectors: A utility class in java.util.stream
        // Provides various methods for reduction, summarization, grouping, mapping, etc.

        // 1️⃣ Collecting to a List
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> res = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(res); // [Alice]

        // 2️⃣ Collecting to a Set (removes duplicates)
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        System.out.println(set); // [1, 2, 3, 4, 5]

        // 3️⃣ Collecting to a Specific Collection (e.g., ArrayDeque)
        ArrayDeque<String> collect = names.stream()
                .collect(Collectors.toCollection(ArrayDeque::new));

        // 4️⃣ Joining Strings
        String concatenatedNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println(concatenatedNames); // ALICE, BOB, CHARLIE

        // 5️⃣ Summarizing Data (count, sum, min, avg, max)
        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11);
        IntSummaryStatistics stats = numbers.stream()
                .collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Avg: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());

        // 6️⃣ Calculating Average
        Double average = numbers.stream()
                .collect(Collectors.averagingInt(x -> x));
        System.out.println("Average: " + average);

        // 7️⃣ Counting Elements
        Long count = numbers.stream().collect(Collectors.counting());
        System.out.println("Count: " + count);

        // 8️⃣ Grouping Elements
        List<String> words = Arrays.asList("hello", "world", "java", "streams", "collecting");
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));
        TreeMap<Integer, Long> treeMap = words.stream()
                .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(treeMap);

        // 9️⃣ Partitioning Elements (true/false groups)
        System.out.println(words.stream()
                .collect(Collectors.partitioningBy(x -> x.length() > 5)));

        // 🔟 Mapping Before Collecting
        System.out.println(words.stream()
                .collect(Collectors.mapping(String::toUpperCase, Collectors.toList())));

        // 1️⃣1️⃣ Grouping By Example
        List<String> l1 = Arrays.asList("Anna", "Bob", "Alexander", "Brian", "Alice");
        System.out.println(l1.stream().collect(Collectors.groupingBy(String::length)));

        // 1️⃣2️⃣ Word Occurrence Count
        String sentence = "hello world hello java world";
        System.out.println(Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        // 1️⃣3️⃣ Partitioning Even/Odd
        List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(l2.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0)));

        // 1️⃣4️⃣ Summing Map Values
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 15);
        System.out.println(items.values().stream().reduce(Integer::sum));
        System.out.println(items.values().stream().collect(Collectors.summingInt(x -> x)));

        // 1️⃣5️⃣ Creating a Map from Stream
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(fruits.stream()
                .collect(Collectors.toMap(String::toUpperCase, String::length)));

        // 1️⃣6️⃣ Merge Duplicate Keys in Map
        List<String> words2 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println(words2.stream()
                .collect(Collectors.toMap(k -> k, v -> 1, Integer::sum))); // {banana=2, orange=1, apple=3}
    }
}
