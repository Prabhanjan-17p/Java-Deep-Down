//package Map.ConcurrentMap.ConcurrentSkipListMap;
//
//public class Main {
//    public static void main(String[] args) {
//        // The issue of ConcurrentHashMap is not sorted map or thread safe To overcome this problem introduce "ConcurrentSkipListMap".
//        //ConcurrentSkipListMap -->
//        //          --> in the ConcurrentSkipListMap the data will be stored in SkipList Array.
//        //          --> What is skipList array --> The probability data structure that allows for efficient search,insert and deletion opertion
//        //                                     --> It is similar to stored linked list but with multiple layers that "Skip" over portions of the list to provide faster access to element.
//    }
//}




package Map.ConcurrentMap.ConcurrentSkipListMap;

import java.util.concurrent.ConcurrentSkipListMap;

public class Main {
    public static void main(String[] args) {

        // ✅ ConcurrentSkipListMap Overview:

        // 🟡 Why ConcurrentSkipListMap?
        // ConcurrentHashMap is thread-safe but does NOT maintain any order (not sorted).
        // To get a thread-safe and **sorted** map, Java provides ConcurrentSkipListMap.

        // 🟢 What is a SkipList?
        // ✔️ A SkipList is a probabilistic data structure.
        // ✔️ It allows **efficient search, insertion, and deletion**.
        // ✔️ Think of it like a linked list with multiple levels ("express lanes") that skip over elements,
        //    making traversal faster — similar to binary search.

        // 🔁 SkipList Example Visualization (for array 1 to 9):
        // Level 3:    1 ------- 5 ------- 9
        // Level 2:    1 --- 3 --- 5 --- 7 --- 9
        // Level 1:    1 2 3 4 5 6 7 8 9

        // 🟢 Features of ConcurrentSkipListMap:
        // ✔️ Sorted by natural ordering of keys or by a comparator provided at map creation.
        // ✔️ Thread-safe (supports full concurrency for retrievals and adjustable expected concurrency for updates).
        // ✔️ Non-blocking algorithms are used internally for better performance under concurrent access.

        // ✅ Simple Example:

        ConcurrentSkipListMap<Integer, String> skipListMap = new ConcurrentSkipListMap<>();

        // Adding elements (automatically sorted by key)
        skipListMap.put(3, "Java");
        skipListMap.put(1, "Python");
        skipListMap.put(2, "C++");

        // Displaying the sorted map
        System.out.println("Sorted ConcurrentSkipListMap: " + skipListMap);

        // Output will be in key-sorted order: {1=Python, 2=C++, 3=Java}
    }
}
