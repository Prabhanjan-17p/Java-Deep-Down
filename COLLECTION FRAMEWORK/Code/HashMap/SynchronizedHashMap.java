package HashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedHashMap {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        Map m1 = Collections.synchronizedMap(m);
    }
}
