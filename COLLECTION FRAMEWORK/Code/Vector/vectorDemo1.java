package Vector;

import java.util.Vector;

public class vectorDemo1 {
    public static void main(String[] args) {
//        Vector v = new Vector(110); // it say that the capacity is 110
//        Vector v = new Vector(110,10); // it say that the capacity is 110 then after adding 110 element if you add new element then the new capacity will be 120
        Vector v = new Vector(); // it is the default capacity taken by 10.
        System.out.println(v.capacity()); // initial capacity 10
        for (int i = 1; i <= 10 ; i++) {
            v.addElement(i);
        }
        System.out.println(v.capacity());
        v.addElement("A"); // after 10 capacity if you add a new element then the capacity will be 20
        System.out.println(v.capacity());
        System.out.println(v); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]
    }
}
