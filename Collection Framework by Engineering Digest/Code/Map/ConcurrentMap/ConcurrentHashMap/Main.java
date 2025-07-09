package Map.ConcurrentMap.ConcurrentHashMap;


import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {

        // ✅ ConcurrentHashMap Overview:

        // 🟡 Why ConcurrentHashMap?
        // It was introduced to overcome the limitations of Hashtable.
        // Hashtable is fully synchronized — all methods are synchronized which reduces performance in multithreaded environments.

        // 🟡 Java 7 Implementation:
        // Uses Segment-based locking.
        // Internally divided into 16 segments (each acts like a separate small Hashtable).
        // Only the segment that is being read/written to is locked — improving concurrency.
        // ⚠️ Problem: If the map becomes too large, too many segments lead to more complexity and slower performance.

        // 🟢 Java 8 Implementation:
        // ✔️ No segmentation.
        // ✔️ Uses **Compare-And-Swap (CAS)** for updates — a lock-free technique.
        // ✔️ Locks only during resizing or collision resolution.
        // ✔️ Highly optimized for multi-threaded environments.

        // 🔁 CAS Example:
        // 1. Thread A last saw: x = 42
        // 2. It tries to update x to 50.
        // 3. Before updating, it checks if x is still 42:
        //      - If yes ➝ Update it to 50
        //      - If no ➝ Retry until x is 42 again or the operation is aborted

        // ✅ Simple Example:

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Adding elements
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        // Reading element (No lock required for read)
        System.out.println("Value for key 2: " + map.get(2));

        // Updating element (uses CAS internally in Java 8+)
        map.replace(3, "C++", "JavaScript");

        System.out.println("Updated map: " + map);
    }
}