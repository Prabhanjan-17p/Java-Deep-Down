package Enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo1 {
    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 1; i <= 10 ; i++) {
            v.addElement(i);
        }
        System.out.println(v);
        Enumeration e = v.elements();
        while (e.hasMoreElements()){
            Integer i =(Integer) e.nextElement();
            if (i % 2 == 0){
                System.out.println(i); // Even Number
            }else {
                System.out.println(i +" will be removed");
                v.remove(i);
                System.out.println(v);
            }
        }
        System.out.println(v); // [2, 4, 6, 8, 10]
    }
}
