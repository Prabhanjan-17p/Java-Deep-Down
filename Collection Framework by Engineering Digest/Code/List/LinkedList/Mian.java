package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Mian {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList.get(2)); // Find the value according to the index
        linkedList.addFirst(0); //Time complexity is O(1)
        linkedList.addLast(4); //Time complexity is O(1)
        linkedList.getFirst();
        linkedList.getLast();

        //removeIf
        linkedList.removeIf(x -> x % 2 == 0); // it will remove the even number using lambda expression
        System.out.println(linkedList);



        //Here it is common element will be remove method(removeAll)
//        LinkedList<String> animal = new LinkedList<>(Arrays.asList("cat","dog","elephant"));
//        LinkedList<String> animalToRemove = new LinkedList<>(Arrays.asList("dog","Lion"));
//        animal.removeAll(animalToRemove);
//        System.out.println(animal);

    }
}
