package Map.SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // SortedMap maintains keys in natural (ascending) order by default.
        // You can use a custom comparator for descending order:
        // SortedMap<Integer, String> map = new TreeMap<>((a, b) -> b - a);

        SortedMap<Integer, String> map = new TreeMap<>();
        map.put(90, "Vipul");
        map.put(99, "Radhe");
        map.put(78, "Kanha");
        map.put(77, "Dora");

        // Prints the map in sorted order of keys
        System.out.println("SortedMap: " + map); // Output: {77=Dora, 78=Kanha, 90=Vipul, 99=Radhe}

        // Returns the first (lowest) key in the map
        System.out.println("firstKey(): " + map.firstKey()); // Output: 77

        // Returns the last (highest) key in the map
        System.out.println("lastKey(): " + map.lastKey()); // Output: 99

        // Returns a view of the portion of the map whose keys are strictly less than 90
        System.out.println("headMap(90): " + map.headMap(90)); // Output: {77=Dora, 78=Kanha}

        // Returns a view of the portion of the map whose keys are greater than or equal to 90
        System.out.println("tailMap(90): " + map.tailMap(90)); // Output: {90=Vipul, 99=Radhe}

        // Retrieves the value for a specific key (if exists)
        System.out.println("get(90): " + map.get(90)); // Output: Vipul

        // Checks if a specific key is present
        System.out.println("containsKey(90): " + map.containsKey(90)); // Output: true

        // Checks if a specific value is present
        System.out.println("containsValue(\"Dora\"): " + map.containsValue("Dora")); // Output: true
    }
}
