package Stack;

import java.util.Stack;

public class StackDemo1 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("2");
        s.push("B");
        s.push("C");
        s.push("5");
        s.push("A");
        System.out.println(s); // [2, B, C, 5, A]
        s.removeLast(); // It remove the last element of the stack (LIFO)
        System.out.println(s); // [2, B, C, 5]
        System.out.println(s.search("A")); // -1 // it return the position
        System.out.println(s.search("2")); // 4
    }
}
