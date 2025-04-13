package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("A");
        l.add(10);
        l.add("A");
        l.add(null);
        System.out.println(l); // [A, 10, A, null]
        l.remove(2);
        System.out.println(l); // [A, 10, null]
        l.add(2,"M");
        System.out.println(l);// [A, 10, M, null]
    }
}
