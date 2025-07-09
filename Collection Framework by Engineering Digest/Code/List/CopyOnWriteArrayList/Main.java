package CopyOnWriteArrayList;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        - "Copy on Write" means that whenever a write operation
        - like adding or removing an element
        - instead of directly modifying the existing list
        - a new copy of the list is created, and the modification is applied to that copy
        - This ensures that other threads reading the list white it's being modified are unaffected.
        - Read Operations: Fast and direct, since they happen on a stable list without interference from modifications.
        - Write Operations: A new copy of the list is created for every modification.
        - The reference to the list is then updated so that subsequent reads use this new list.

        - The best case used for  -- read more

         */

//        List<String> list = new ArrayList<>(); //It will be gives error because at the time of reading we can't add but in the case of CopyOnWriteArrayList we can do this.
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Lasi");
        System.out.println("Initial Order List :: "+list);
        for (String l:list){
            System.out.println(l);
            if (l.equals("Mango")){
                list.add("Kaju");
                System.out.println("One item added...");
            }
        }
        System.out.println("Update Order List :: "+list);


//        List<String> copy = new ArrayList<>(); // It will gives you error
        List<String> copy = new CopyOnWriteArrayList<>();
        copy.add("Item1");
        copy.add("Item2");
        copy.add("Item3");
        Thread read = new Thread(() -> {
            try{
                while (true){
                    for (String s : copy){
                        System.out.println("Reading the item :: " +s);
                        Thread.sleep(100);
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception in read...." + e.getMessage());
            }
        });

        Thread write = new Thread(() ->{
            try{
                Thread.sleep(500);
                copy.add("Item4");
                System.out.println("Item4 add to the list...");

                Thread.sleep(500);
                copy.remove("Item1");
                System.out.println("Remove Item1 from the List...");
            } catch (Exception e) {
                System.out.println("Exception in writing...." + e.getMessage());
            }
        });
        read.start();
        write.start();
    }
}
