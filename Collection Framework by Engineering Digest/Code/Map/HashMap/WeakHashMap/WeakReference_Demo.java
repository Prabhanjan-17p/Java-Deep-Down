package Map.HashMap.WeakHashMap;
//import java.lang.ref.WeakReference;

import java.lang.ref.WeakReference;

public class WeakReference_Demo {
    public static void main(String[] args) {
        WeakReference<Phone> iPhone = new WeakReference<>(new Phone("Apple","16 pro Max"));
        System.out.println(iPhone.get());

        System.gc(); // Compiler Remove the iPhone Object because of it is a weak Reference.

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(iPhone.get()); // null
    }
}

class  Phone{
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + this.brand + '\'' +
                ", model='" + this.model + '\'' +
                '}';
    }
}
