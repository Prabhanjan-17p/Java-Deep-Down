package SortedMap;

import java.util.HashMap;
import java.util.SortedMap;

public class SortedMapEDemo1 {
    public static void main(String[] args) {
        /*
        101 -> A
        103 -> B
        104 -> C
        107 -> D
        125 -> E
        136 -> F

        firstKey() --> 101
        lastKey() --> 136
        headMap(107) --> {101=A,103=B,104=C}
        tailMap(107) --> {107=D,125=E,136=F}
        subMap(103,125) --> {103=B,104=C,107=D}
        comparator() --> null (due to default Ascending order apply then it return null)
         */

    }
}
