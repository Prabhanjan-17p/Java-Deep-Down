package LinkedList;

import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Kanha");
        l.add(30);
        l.add(null);
        l.add("Kanha");
        System.out.println(l); // [Kanha, 30, null, Kanha]
        l.set(0, "Software"); // it means replace
        l.add(0, "venky"); // it means add a new element
        l.removeLast(); // remove last element
        l.addFirst("ccc"); // add the first of the linked list
        System.out.println(l); // [ccc, venky, Software, 30, null]
    }
}
