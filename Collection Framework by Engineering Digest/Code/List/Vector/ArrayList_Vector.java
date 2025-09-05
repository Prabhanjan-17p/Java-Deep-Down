package List.Vector;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayList_Vector {
    public static void main(String[] args) {
        //ArrayList VS LinkedList
        //In case of ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        Thread t1 = new Thread(() ->{
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        t1.start(); // this t1 and t2 thread running together
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(list.size());

        //In case of Vector
        Vector<Integer> vector = new Vector<>();
        Thread t3 = new Thread(() ->{
            for (int i = 0; i < 1000; i++) {
                vector.add(i);
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                vector.add(i);
            }
        });
        t3.start(); // it will stop after t3 realise the lock because vector is thread safe or synchronised
        t4.start();

        try {
            t3.join();
            t4.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(vector.size());

    }
}
