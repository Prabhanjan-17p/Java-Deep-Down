package Map.EnumMap.ImmutableMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // ✅ ImmutableMap Overview:

        // 🟢 1. Using Collections.unmodifiableMap():
        // ✔️ Makes an existing map read-only (no structural modification allowed).
        // ✔️ But if the original map (map1) is modified, those changes reflect in the unmodifiable map (map2).

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Kanha", 90);
        map1.put("Pravu", 50);

        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        System.out.println("Unmodifiable Map using Collections: " + map2);

        // map2.put("Hari", 33); // ❌ Throws UnsupportedOperationException

        // 🟡 Issue: map2 still reflects changes in map1 (shallow immutability).
        // Java 9 introduced true immutable map factories: Map.of() and Map.ofEntries()

        // 🟢 2. Using Map.of()
        // ✔️ Returns an immutable map.
        // ✔️ Supports up to 10 key-value pairs.
        // ✔️ No null keys or values allowed.

        Map<String, Integer> map3 = Map.of("Subham", 12, "Harish", 55, "Aja", 99);
        System.out.println("Immutable Map using Map.of(): " + map3);

        // map3.put("Kanha", 88); // ❌ Throws UnsupportedOperationException

        // 🟢 3. Using Map.ofEntries()
        // ✔️ Overcomes the 10-entry limit of Map.of().
        // ✔️ Also returns a fully immutable map.

        Map<String, Integer> map4 = Map.ofEntries(
                Map.entry("Aka", 11),
                Map.entry("Kanha", 33),
                Map.entry("Sita", 99),
                Map.entry("Ayush", 99)
        );
        System.out.println("Immutable Map using Map.ofEntries(): " + map4);

        // map4.put("Jamal", 92); // ❌ Throws UnsupportedOperationException
    }
}
