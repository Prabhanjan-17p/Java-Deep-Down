package Java_8.Predicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        /*
        ✅ Predicate Functional Interface
        ---------------------------------------------------
        ➤ Represents a boolean-valued function of one argument.
        ➤ Belongs to java.util.function package.
        ➤ Commonly used in filtering, validation, and conditions.
        ➤ Method:
           - boolean test(T t)
           - and(), or(), negate() — default methods for combining predicates
        */

        // 🔍 Example 1: Check if number is even
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4)); // true

        // 🔍 Example 2: Check if name starts with 'a'
        Predicate<String> nameStartsWithA = x -> x.toLowerCase().startsWith("a");
        System.out.println("Does 'Amar' start with A? " + nameStartsWithA.test("Amar")); // true

        // 🔍 Example 3: Check if name ends with 't'
        Predicate<String> nameEndsWithT = x -> x.toLowerCase().endsWith("t");
        System.out.println("Does 'Kanha' end with T? " + nameEndsWithT.test("Kanha")); // false

        // 🔗 Combine predicates using and()
        Predicate<String> combined = nameStartsWithA.and(nameEndsWithT);
        System.out.println("Does 'aT' start with A and end with T? " + combined.test("aT")); // true
    }
}
