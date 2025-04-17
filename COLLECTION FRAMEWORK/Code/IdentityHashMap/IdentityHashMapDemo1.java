package IdentityHashMap;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo1 {
    public static void main(String[] args) {
        // it used internally == operators then it return false means 2 different object will create
        Integer i1 = 1222;
        Integer i2 = 1222;
        IdentityHashMap m = new IdentityHashMap(); // IdentityHashMap
        m.put(i1,"kanha");
        m.put(i2,"Pravu");
        System.out.println(m);	// {1222=Pravu, 1222=kanha}
    }
}
