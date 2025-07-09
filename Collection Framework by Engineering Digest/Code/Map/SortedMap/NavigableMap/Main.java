package Map.SortedMap.NavigableMap;

import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(5, "Five");
        map.put(3, "Three");

        // TreeMap automatically sorts keys in ascending order
        System.out.println("Sorted Map: " + map); // Output: {1=One, 3=Three, 5=Five}

        // Returns the entry with key >= 2
        Map.Entry<Integer, String> ceilingEntry = map.ceilingEntry(2);
        System.out.println("ceilingEntry(2): " + ceilingEntry); // Output: 3=Three

        // Returns the least key >= 2
        Integer ceilingKey = map.ceilingKey(2);
        System.out.println("ceilingKey(2): " + ceilingKey); // Output: 3

        // Returns the entry with key <= 4
        Map.Entry<Integer, String> floorEntry = map.floorEntry(4);
        System.out.println("floorEntry(4): " + floorEntry); // Output: 3=Three

        // Returns the greatest key <= 4
        Integer floorKey = map.floorKey(4);
        System.out.println("floorKey(4): " + floorKey); // Output: 3

        // Returns the entry with key > 3
        Map.Entry<Integer, String> higherEntry = map.higherEntry(3);
        System.out.println("higherEntry(3): " + higherEntry); // Output: 5=Five

        // Returns the least key > 3
        Integer higherKey = map.higherKey(3);
        System.out.println("higherKey(3): " + higherKey); // Output: 5

        // Returns the entry with key < 3
        Map.Entry<Integer, String> lowerEntry = map.lowerEntry(3);
        System.out.println("lowerEntry(3): " + lowerEntry); // Output: 1=One

        // Returns the greatest key < 3
        Integer lowerKey = map.lowerKey(3);
        System.out.println("lowerKey(3): " + lowerKey); // Output: 1
    }
}
