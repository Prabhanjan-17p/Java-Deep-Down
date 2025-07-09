package Map.HashMap.IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //In case of memory these key1 and key2 point to 2 different location
//        String key1 = new String("key");
//        String key2 = new String("key");
//
//        Map<String,Integer> map = new HashMap<>();
//
//        map.put(key1,1);
//        map.put(key2,2);
//        key1.hashCode()  == key2.hashCode() // So same Location (Means Checking the Content not location)
//
//        System.out.println(map);
        //Output -> {key=2}
            // Because of when ever put work it search the class object content not Object class
            // That so why both have same value "A String class equals() checking the content of the method".
            // Means -->  key1.hashCode()  == key2.hashCode()


        //Case - 2(IdentityHashMap)
        //In case of memory these key1 and key2 point to 2 different location
        // These 2 key1 and key2 are not in String Constant Pool.
        String key1 = new String("key");
        String key2 = new String("key");

        Map<String,Integer> map = new IdentityHashMap<>();

        map.put(key1,1);
        map.put(key2,2);
//        System.identityHashCode(key1) != System.identityHashCode(key2)

        System.out.println(map);
        //Output -> {key=2, key=1}
            // Because of in this put method search in object class (And we know that key1 and key2 are different location)
            // That so why it will be stored in 2 different Index.
            // In case of IdentityHashMap --> System.identityHashCode(key1) != System.identityHashCode(key2) so different different location
    }
}
