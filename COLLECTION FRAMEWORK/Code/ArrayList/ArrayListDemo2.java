package ArrayList;

import java.io.Closeable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        System.out.println(l instanceof Serializable);
        System.out.println(l instanceof Closeable);
        System.out.println(l instanceof RandomAccess);
    }
}
