package TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class CustomizedSortingOrderTreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap t = new TreeMap(new MyComparator());
        t.put("AAA",123);
        t.put("XXX",456);
        t.put("LLL",789);
        t.put("ZZZ","kanha");
        System.out.println(t); //{ZZZ=kanha, XXX=456, LLL=789, AAA=123}
    }
}
class  MyComparator implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        String str1 = (String) obj1;
        String str2 = (String) obj2;
        return str2.compareTo(str1);
    }
}