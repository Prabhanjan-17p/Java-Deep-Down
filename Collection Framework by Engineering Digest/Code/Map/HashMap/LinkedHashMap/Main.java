package Map.HashMap.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //The main difference between HashMap and LinkedHashMap is :
        // LinkedHashMap is have :: Insertion Order Or Assess order

        //1
//        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
//        linkedHashMap.put("Apple",120);
//        linkedHashMap.put("Mango",20);
//        linkedHashMap.put("Banana",80);
//
//        for (Map.Entry<String,Integer> m : linkedHashMap.entrySet()){
//            System.out.println(m.getKey() +" : "+m.getValue());
//        }


        //2 -> That means initial capacity is 11 and if more than  3  (11*0.3) the size will be double
//        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(11,0.3f);
//        linkedHashMap.put("Apple",120);
//        linkedHashMap.put("Mango",20);
//        linkedHashMap.put("Banana",80);
//
//        for (Map.Entry<String,Integer> m : linkedHashMap.entrySet()){
//            System.out.println(m.getKey() +" : "+m.getValue());
//        }

        //3 -> AccessOrder , by-default false , if true (Means recent used are stored in last)
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(1,0.3f,true);
        linkedHashMap.put("Apple",120);
        linkedHashMap.put("Mango",20);
        linkedHashMap.put("Banana",80);

        linkedHashMap.get("Apple");

        for (Map.Entry<String,Integer> m : linkedHashMap.entrySet()){
            System.out.println(m.getKey() +" : "+m.getValue());
        }
    }
}
