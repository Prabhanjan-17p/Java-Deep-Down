package Map.HashMap.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU_Cache<k,v> extends LinkedHashMap<k,v> {

    private int capacity;

    public LRU_Cache(int capacity){
        super(capacity,0.74f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<k, v> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRU_Cache<String,Integer> lruCache = new LRU_Cache<>(3);
        //1- In this case top will be Remove
//        lruCache.put("Bob",91);
//        lruCache.put("Alic",88);
//        lruCache.put("Manoj",68);
//        lruCache.put("Joy",58);
//        System.out.println(lruCache);

        //2- In this case "Alic" will remove because Bob is used again before insert 4th element
//        lruCache.put("Bob",91);
//        lruCache.put("Alic",88);
//        lruCache.put("Manoj",68);
//        lruCache.get("Bob"); // here used before insert 4th element
//        lruCache.put("Joy",58);
//        System.out.println(lruCache);

        //3- In this case "Bob" will remove because of Bob used in after insert 4th element
        lruCache.put("Bob",91);
        lruCache.put("Alic",88);
        lruCache.put("Manoj",68);
        lruCache.put("Joy",58);
        lruCache.get("Bob"); // here used after insert 4th element
        System.out.println(lruCache);




        System.out.println(lruCache.size());
        System.out.println(lruCache.capacity);

    }
}
