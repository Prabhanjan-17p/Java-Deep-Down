package Map.HashMap.WeakHashMap;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashmapDemo {
    public static void main(String[] args) {
        WeakHashMap<String,Image> hashMap = new WeakHashMap<>();
        loadCache(hashMap);
        System.out.println(hashMap);
        System.gc();
        simulationApp();
        System.out.println("catch after running (Some entries may be clear) : "+hashMap);
    }

     private static void loadCache(Map<String,Image> load){
        //These 2 are Strong Reference but due to within a method it's eligible for Garbage collector
        String k1 = new String("img1");
        String k2 = new String("img1");

        load.put(k1,new Image("Image 1"));
        load.put(k2,new Image("Image 2"));
    }

    private static  void simulationApp(){
        try {
            System.out.println("Application running wait few sec... ");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Image{
    String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }
}
