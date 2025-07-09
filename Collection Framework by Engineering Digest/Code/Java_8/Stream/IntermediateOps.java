package Java_8.Stream;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {

        /*
        ✅ Intermediate Operations in Streams
        --------------------------------------------------------
        ➤ Transform a stream into another stream
        ➤ Always lazy — only executed when a terminal operation (like count(), collect()) is called
        */

        List<String> list = Arrays.asList("Akshit", "Ram", "Shyam", "Ghanshyam", "Akshit");

        // 1️⃣ filter(): Select elements based on a condition
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A"));
        long countA = filteredStream.count(); // now executed
        System.out.println("Names starting with 'A': " + countA);

        // 2️⃣ map(): Transform each element
        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println); // [AKSHIT, RAM, SHYAM, GHANSHYAM, AKSHIT]

        // 3️⃣ sorted(): Sort elements (natural or custom order)
        list.stream()
                .sorted() // natural order
                .forEach(System.out::println);

        list.stream()
                .sorted((a, b) -> a.length() - b.length()) // by length
                .forEach(System.out::println);

        // 4️⃣ distinct(): Remove duplicates
        long distinctA = list.stream().filter(x -> x.startsWith("A")).distinct().count();
        System.out.println("Distinct names starting with 'A': " + distinctA);

        // 5️⃣ limit(): Take only first n elements
        long limitCount = Stream.iterate(1, x -> x + 1)
                .limit(100)
                .count();
        System.out.println("Limited to 100: " + limitCount);

        // 6️⃣ skip(): Skip first n elements
        long skipCount = Stream.iterate(1, x -> x + 1)
                .skip(10)
                .limit(100)
                .count();
        System.out.println("Skipped 10, limited to 100: " + skipCount);

        // 7️⃣ peek(): Debug or perform action on each element
        Stream.iterate(1, x -> x + 1)
                .skip(10)
                .limit(5)
                .peek(System.out::println)
                .count(); // prints numbers 11–15

        // 8️⃣ flatMap(): Flatten nested collections (List<List<T>> → List<T>)
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "kiwi"),
                Arrays.asList("pear", "grape")
        );

        List<String> flatList = nestedList.stream()
                .flatMap(List::stream)
                .map(String::toUpperCase)
                .toList();
        System.out.println(flatList); // [APPLE, BANANA, ORANGE, KIWI, PEAR, GRAPE]

        // flatMap with strings (sentence → words)
        List<String> sentences = Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "flatMap is useful"
        );
        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .map(String::toUpperCase)
                .toList();
        System.out.println(words); // [HELLO, WORLD, JAVA, STREAMS, ARE, POWERFUL, FLATMAP, IS, USEFUL]

    }
}
