package Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(3,"Kanha");
        map.put(1,"Hari");
        map.put(2,"Ritesh");
        System.out.println(map);

        //According to the key we can check the value
        String std1 = map.get(3);
        System.out.println(std1);

        //According to the key we can check the value if not present then it gives you null
        String std2 = map.get(11);
        System.out.println(std2);

        //It check the key are present or not(true - false)
        System.out.println(map.containsKey(2));

        //It check the value are present or not
        System.out.println(map.containsValue("Kanha"));

        //Using Loop in HashMap
        for (int name : map.keySet()){
            System.out.println(map.get(name));
        }
        //key : values pair
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> i : entries){
            System.out.println(i.getKey() +" : "+i.getValue());
        }


        //we can update the data inside the HashMap
        Set<Map.Entry<Integer, String>> entries2 = map.entrySet();
        for (Map.Entry<Integer, String> i : entries2){
            i.setValue(i.getValue().toUpperCase()); // Modify all value to the upper case
        }
        System.out.println(map);

        //remove
        map.remove(3); // remove the key 3
        System.out.println(map);
//        map.remove(3,"Hari"); // it not remove both key and value are here then it will be remove
        boolean checkRemove = map.remove(3, "Hari");
        System.out.println("Removed ? : "+checkRemove);
        System.out.println(map);

        //getOrDefault -> if the key is not present it will show the default value that ever you set
        map.getOrDefault(4,"Omm");

        //putIfAbsent -> if a map not have that key then add it.
        map.putIfAbsent(5,"Lasi");

        System.out.println(map);
    }
}
