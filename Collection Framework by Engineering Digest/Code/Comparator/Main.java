package Comparator;

/*
Comparator --> It is used for custom sorting order.
           --> When we write custom Logic.
           --> And used multiple criteria(ex - age , name etc to sort them).
           --> And if i used multiple field to sort then Comparator used.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class  CustomSort1 implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        // All the +ve value are shifted into right
        // All the -ve value are shifted into left
        // All the 0 are same reference

        return o2-o1; // Descending
//        return o1-o2; // Ascending
    }
}

class  LengthSort implements  Comparator<String>{
    @Override
    public int compare(String o1,String o2){
        return o1.length() - o2.length(); // For Ascending
//        return o1.length() - o2.length(); // For Descending
    }
}

public class Main {
    public static void main(String[] args) {
/*
        List<Integer> list = new ArrayList<>(List.of(1,9,2,7,4));
        System.out.println("Before sort:: "+list);

        //2 ways to sort the number
//        list.sort(null);
//        Collections.sort(list);

        // Custom sort
        list.sort(new CustomSort1());

        // Custom sort using lambda
        list.sort((a,b) -> a - b ); // For Ascending
        list.sort((a,b) -> b - a ); // For descending


        System.out.println("After Sort:: "+list);

 */

        //Sort according to the length
        List<String> list2 = Arrays.asList("banana","apple","date");
        System.out.println("Before Sort:: "+list2);

        // Custom sort
//        list2.sort(new LengthSort());

        // Custom sort using lambda
        list2.sort((a,b) -> a.length() - b.length()); //  For Ascending
//        list2.sort((a,b) -> b.length() - a.length()); //  For descending

        System.out.println("After Sort:: "+list2);


    }
}

