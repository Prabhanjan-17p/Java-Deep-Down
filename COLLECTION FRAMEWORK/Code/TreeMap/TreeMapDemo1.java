package TreeMap;

import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap t = new TreeMap();
        t.put(100,"kanha");
        t.put(103,"ZZZ");
        t.put(101,"XXX");
        t.put(106,123);
//        t.put("FFFF","CCX"); // ClassCastException
//        t.put(null,"NPX"); //NullPointerException
        System.out.println(t); //{100=kanha, 101=XXX, 103=ZZZ, 106=123}
    }
}
