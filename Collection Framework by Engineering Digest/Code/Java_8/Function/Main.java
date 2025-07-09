package Java_8.Function;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        /*
        ✅ Function<T, R> – Java 8 Functional Interface
        ------------------------------------------------------
        ➤ Takes one input (T), returns one output (R)
        ➤ Used for transformation, mapping, etc.
        ➤ Method:
           - apply(T t)
        ➤ Default Methods:
           - andThen(Function): chains functions, executes second after first
           - compose(Function): chains functions, executes first before second
        ➤ Static Method:
           - identity(): returns input as output
        */

        // 🔹 Example 1: Double a number
        Function<Integer, Integer> doubleIt = x -> 2 * x;
        System.out.println("Double 20: " + doubleIt.apply(20)); // 40

        // 🔹 Example 2: Triple a number
        Function<Integer, Integer> tripleIt = x -> 3 * x;
        System.out.println("Triple 20: " + tripleIt.apply(20)); // 60

        // 🔗 Chaining with andThen (double first, then triple)
        System.out.println("Double then Triple (20): " + doubleIt.andThen(tripleIt).apply(20)); // (20*2)=40 → 40*3=120

        // 🔗 Chaining with compose (triple first, then double)
        System.out.println("Triple then Double (20): " + doubleIt.compose(tripleIt).apply(20)); // (20*3)=60 → 60*2=120

        // 🔗 Another chaining: triple then double
        System.out.println("Triple then Double (20): " + tripleIt.andThen(doubleIt).apply(20)); // same → 120

        // 🔹 identity(): returns the same value
        Function<Integer, Integer> identity = Function.identity();
        Integer res = identity.apply(5); // returns 5
        System.out.println("Identity of 5: " + res);
    }
}
