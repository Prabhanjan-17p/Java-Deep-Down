package LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo1 {
    public static void main(String[] args) {
        LinkedHashMap m = new LinkedHashMap();
        m.put("kanha",700);
        m.put("Pravu",500);
        m.put("Dibya",200);
        m.put("Danu",500);
        System.out.println(m); //{kanha=700, Pravu=500, Dibya=200, Danu=500}

//        Integer i1 = new Integer(10);
//        Integer i2 = new Integer(10);
        Integer i3= 1220;
        Integer i4= 1220;
        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));
    }
}
