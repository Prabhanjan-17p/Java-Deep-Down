package WeakHashMap;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo1 {
    public static void main(String[] args) throws InterruptedException {
//        HashMap h = new HashMap();  //{temp=kanha} {temp=kanha}
        WeakHashMap h = new WeakHashMap();  //{temp=kanha} {}
        Temp t = new Temp();
        h.put(t,"kanha");
        System.out.println(h);
        t = null;
        System.gc(); // To call Garbage collector to clean non-reference object
        Thread.sleep(3000);
        System.out.println(h);

    }
}

class  Temp{
    @Override
    public String toString() {
        return "temp";
    }
    public void finalize()
    {
        System.out.println("It Executed when Garbage Collectors Clean the temp Object");
    }
}