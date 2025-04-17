package DoubleEqualVSEqualsMethod;

import java.util.HashMap;

public class Demo1 {
    public static void main(String[] args) {
        // if i1 and i2 in the range of 1 to 127 then it will show true for all the case.
        Integer i1 = 1222;
        Integer i2 = 1222;
        System.out.println(i1 == i2); // it return false because of it check the reference not value
        System.out.println(i1.equals(i2)); // it return true because of it check value not reference

        HashMap m = new HashMap();
        m.put(i1,"kanha");
        m.put(i2,"Pravu");
        System.out.println(m);
    }
}
