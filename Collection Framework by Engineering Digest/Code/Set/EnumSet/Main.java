package Set.EnumSet;

import java.util.EnumSet;
import java.util.Set;

public class Main {

    enum Color { RED, GREEN, BLUE }

    public static void main(String[] args) {

        // ✅ EnumSet Overview:

        // 🟢 What is EnumSet?
        // ✔️ A specialized high-performance Set implementation for enum types only.
        // ✔️ Internally uses bit-vector representation (very compact and fast).
        // ✔️ Maintains elements in the order they are declared in the enum.

        // 🟡 Purpose:
        // - Optimized for use with enums.
        // - Provides much better performance than HashSet or other general-purpose sets for enum data.

        // 🔴 Limitations:
        // ❌ Cannot be used with non-enum types.
        // ❌ Does not allow null elements (throws NullPointerException).

        // ✅ Example Usage:

        System.out.println("EnumSet Example:");

        Set<Color> enumSet = EnumSet.of(Color.RED, Color.GREEN); // Add selected enums

        // Displaying the set — output follows enum declaration order
        System.out.println("EnumSet contents: " + enumSet); // Output: [RED, GREEN]

        // Adding another enum constant
        enumSet.add(Color.BLUE);
        System.out.println("After adding BLUE: " + enumSet); // Output: [RED, GREEN, BLUE]
    }
}
