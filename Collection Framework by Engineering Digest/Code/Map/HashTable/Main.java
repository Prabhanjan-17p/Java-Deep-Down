package Map.HashTable;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        // Hashtable is synchronized (thread-safe)
        // Legacy class (before Java 1.2) – slower than HashMap
        // Doesn't allow null keys or null values
        // Uses LinkedList to handle collisions internally

        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Adding key-value pairs
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Cherry");

        // Print the hashtable
        System.out.println("Initial Hashtable: " + hashtable); // {3=Cherry, 2=Banana, 1=Apple}

        // Get value using key
        System.out.println("get(2): " + hashtable.get(2)); // Output: Banana

        // Check if key exists
        System.out.println("containsKey(3): " + hashtable.containsKey(3)); // Output: true

        // Remove key
        hashtable.remove(3);
        System.out.println("After remove(3): " + hashtable); // {2=Banana, 1=Apple}

        // Following lines will throw NullPointerException
        // hashtable.put(null, "Juice");   // Null key not allowed
        // hashtable.put(4, null);         // Null value not allowed

        // Example of thread-safe behavior with multiple threads
        Hashtable<Integer, String> map = new Hashtable<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Thread1");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                map.put(i, "Thread2");
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Final size should be 2000 if no data race occurred (proves synchronization)
        System.out.println("Full Size of Hashtable is :: " + map.size()); // Output: 2000
    }
}
