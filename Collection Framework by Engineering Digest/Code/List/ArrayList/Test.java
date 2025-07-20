package List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(9,6,1,20,8,3));
        Collections.sort(list);
        System.out.println(list);

    }
}
