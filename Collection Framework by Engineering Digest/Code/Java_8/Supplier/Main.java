package Java_8.Supplier;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        /*
        ✅ Supplier<T> – Java 8 Functional Interface
        ------------------------------------------------------
        ➤ Represents a supplier of results → takes no input, returns a value
        ➤ Commonly used for lazy generation or fetching data (e.g. DB call, random ID, etc.)
        ➤ Method:
           - T get()
        */

        // 🔹 Example 1: Return a static string
        Supplier<String> stringSupplier = () -> "Kanha";
        System.out.println("String from Supplier: " + stringSupplier.get()); // Output: Kanha

        // 🔹 Example 2: Return a fixed number
        Supplier<Integer> integerSupplier = () -> 1;
        System.out.println("Integer from Supplier: " + integerSupplier.get()); // Output: 1
    }
}
