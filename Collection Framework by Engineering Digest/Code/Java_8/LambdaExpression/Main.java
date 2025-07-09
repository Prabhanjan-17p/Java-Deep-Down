
package Java_8.LambdaExpression;

public class Main {
    public static void main(String[] args) {

        /*
        ✅ Lambda Expression (Java 8 Feature)
        ---------------------------------------------------
        ❓ What is it?
        - A **lambda expression** is an anonymous function — no name, no return type, no access modifier.

        🔍 Why use it?
        - To **reduce boilerplate code** in functional-style programming.
        - Useful with **functional interfaces** (interfaces with a single abstract method).

        🧠 Syntax:
        (parameters) -> { body }

        ✅ Functional interfaces examples:
        - Runnable
        - Comparator
        - Callable
        - Custom interface with one abstract method
        */

        // 🔁 Traditional way (before Java 8)
        Thread t1 = new Thread(new Task());

        // ✅ Lambda expression replacement (simpler, cleaner)
        Thread t2 = new Thread(() -> {
            System.out.println("Introduce Lambda Expression!!");
        });

        t1.start();
        t2.start();

        /*
        🔧 Lambda with custom functional interface
        -------------------------------------------
        Interface: MathOp → has only one abstract method → eligible for lambda
        */

        MathOp sum = (int a, int b) -> {
            return a + b;
        };

        MathOp sub = (a, b) -> a - b; // type inference and single-line return

        System.out.println("Sum: " + sum.operation(12, 34));
        System.out.println("Sub: " + sub.operation(52, 34));
    }
}

// ✅ Custom Functional Interface
@FunctionalInterface
interface MathOp {
    int operation(int a, int b);
}

// 🧱 Traditional Runnable Implementation (for comparison)
class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Introduce Functional Programming!!");
    }
}
