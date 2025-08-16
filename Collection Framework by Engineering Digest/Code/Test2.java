import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        String name = "aaafgggkrrrkyytv";
        //Counting Duplicate
        System.out.println("Duplicate Element found");
        Map<String, Long> collect = Arrays.stream(name.toLowerCase().split("")).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        for (Map.Entry<String,Long> v : collect.entrySet()){
            if (v.getValue() > 1){
                System.out.println(v.getKey()+" :: "+v.getValue());
            }
        }


        //Least Frequency
        System.out.println("Least Frequency Element found");
        Map<String,Long> map = Arrays.stream(name.toLowerCase().split(""))
                .collect(Collectors.groupingBy(x->x,Collectors.counting()));

        Long min = 9l;
        for (Map.Entry<String, Long> x : map.entrySet()){
            if (x.getValue() < min){
                min = x.getValue();
            }
        }
        int count = 0;
        for (Map.Entry<String, Long> x : map.entrySet()) {
            if (x.getValue() == min) {
                count++;
            }
        }

        int i = 1;
        for (Map.Entry<String, Long> x : map.entrySet()) {
            if (x.getValue() == min) {
                System.out.print(x.getKey());
                if (i < count) {
                    System.out.print(",");
                }
                i++;
            }
        }

    }
}
