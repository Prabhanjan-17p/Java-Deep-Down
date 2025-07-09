package Map.HashMap;

import java.util.HashMap;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    // Force same hashCode to cause collision
    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Person) obj).name);
    }
}

public class SimpleCollision {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();

        Person p1 = new Person("Alice");
        Person p2 = new Person("Bob");

        map.put(p1, "Developer");
        map.put(p2, "Designer");

        for (Person key : map.keySet()) {
            System.out.println(key.name + " => " + map.get(key));
        }
    }
}
