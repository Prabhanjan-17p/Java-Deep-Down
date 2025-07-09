import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateLetterCounter {
    public static void main(String[] args) {
        String name = "PPRASANNA";
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count frequency of each letter
        for (char ch : name.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        int duplicateCount = 0;

        // Print duplicate letters and count
        System.out.println("Duplicate letters in " + name + ":");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
                duplicateCount += (entry.getValue() - 1); // Only count extra occurrences
            }
        }

        System.out.println("Total duplicate letters: " + duplicateCount);






        String se = "PraPvanjanAmanta";

        Map<String, Long> mm = Arrays.stream(se.toLowerCase().split("")).collect(Collectors.groupingBy(x -> x,Collectors.counting()));


        for(Map.Entry<String, Long> x : mm.entrySet()){

            if(x.getValue() > 1){
                System.out.println(x.getKey() + " :: "+x.getValue());
            }
        }












        /*
                String sentence = "PraPvanjanAmanta";
        Map<String, Long> collect = Arrays.stream(sentence.toLowerCase().split(""))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        for(Map.Entry<String, Long> x : collect.entrySet()){
            if (x.getValue() > 1){
                System.out.println(x.getKey() +" :: "+x.getValue());
            }
        }
         */
    }
}
