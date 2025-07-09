package Map.EnumMap;

import java.util.EnumMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // ✅ EnumMap Overview:

        // 🟢 Why use EnumMap?
        // ✔️ It is a specialized Map implementation for use with enum keys.
        // ✔️ Internally uses an array — not hashing.
        // ✔️ Very fast (faster than HashMap) when keys are enums.
        // ✔️ Memory-efficient since keys are stored using their ordinal (index) values.

        // 🔁 Example internal structure for enum Day:
        // Indexes based on enum ordinal:
        // enum Day { SUNDAY(0), MONDAY(1), ..., THURSDAY(4) }
        // Internal array might look like:
        // [null, "Play", null, null, "Gym", null, null]

        // ✅ EnumMap Example:

        Map<Day, String> map = new EnumMap<>(Day.class);

        // Adding values
        map.put(Day.THURSDAY, "Gym");
        map.put(Day.MONDAY, "Play");

        // Accessing a value
        String activity = map.get(Day.THURSDAY);
        System.out.println("Activity on Thursday: " + activity);

        // Displaying the full map
        System.out.println("EnumMap contents: " + map);
    }
}

// Enum definition
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
