package HashMap;

import java.util.*;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("kanha",700);
        m.put("Pravu",500);
        m.put("Dibya",200);
        m.put("Danu",500);
        System.out.println(m); // {kanha=700, Pravu=500, Danu=500, Dibya=200}
        System.out.println(m.put("kanha",1000)); // 700(it return the old values)

        Set s = m.keySet();
        System.out.println(s); // [kanha, Pravu, Danu, Dibya] (it return of key only)

        Collection c = m.values();
        System.out.println(c); // [1000, 500, 500, 200]  (it return of values only )

        Set s1 = m.entrySet();
        System.out.println(s1); // [kanha=1000, Pravu=500, Danu=500, Dibya=200]

        Iterator itr = s1.iterator();
        while (itr.hasNext()){
            Map.Entry m1 = (Map.Entry)itr.next();
            System.out.println(m1.getKey()+"------------------"+m1.getValue());
            if (m1.getKey().equals("kanha")){
                m1.setValue(120000);
            }
        }
        System.out.println(m); // {kanha=120000, Pravu=500, Danu=500, Dibya=200}
    }
}
