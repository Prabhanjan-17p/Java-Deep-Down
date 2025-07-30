import java.sql.Connection;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        String name = "prasudfaasudf";
        Map<String,Long> map = Arrays.stream(name.toLowerCase().split(""))
                .collect(Collectors.groupingBy(x->x,Collectors.counting()));
        for (Map.Entry<String, Long> x : map.entrySet()){
            if (x.getValue() >= 2){
                System.out.println(x.getKey() +" :: "+x.getValue());
            }
        }
    }
}
