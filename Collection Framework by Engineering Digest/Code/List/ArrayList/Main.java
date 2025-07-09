//package List.ArrayList;
//
//import java.util.*;
//
//class Student implements Comparable<Student>{
//    private String name;
//    private double gpa;
//
//    public Student(String name, double gpa) {
//        this.name = name;
//        this.gpa  = gpa;
//    }
//
//    public String getName() { return name; }
//    public double getGpa()  { return gpa; }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Double.compare(gpa, student.gpa) == 0 && Objects.equals(name, student.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, gpa);
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", gpa=" + gpa +
//                '}';
//    }
//
//    @Override
//    public int compareTo(Student o) {
//        return Double.compare(o.getGpa(), this.getGpa());
//    }
//}
//
//
//
//public class Main {
//    public static void main(String[] args) {
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("Charlie", 3.5));
//        students.add(new Student("Bob", 3.7));
//        students.add(new Student("Alice", 3.5));
//        students.add(new Student("Akshit", 3.9));
//
//        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
//
//
//        students.sort((o1, o2) -> {
//            if (o2.getGpa() - o1.getGpa() > 0) {
//                return 1;
//            } else if (o2.getGpa() - o1.getGpa() < 0) {
//                return -1;
//            } else {
//                return o2.getName().compareTo(o1.getName());
//            }
//        });
//        for (Student s : students) {
//            System.out.println(s.getName() + ": " + s.getGpa());
//        }
//        Collections.sort(students, comparator);
//
//
//
//        List<Integer> l1 = List.of(1,4,2,7,2);
//        System.out.println(l1);
//
//
//
///*        System.out.println(list.get(2));
//        System.out.println(list.size());
//        for(int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }
//        for(int x: list){
//            System.out.println(x);
//        }
//        System.out.println(list.contains(5));
//        System.out.println(list.contains(50));
//
//        list.remove(2);
//        for(int x: list){
//            System.out.println(x);
//        }
//        list.add(2, 50);
//
//        for(int x: list){
//            System.out.println(x);
//        }
//
//        list.add(1); // 0
//        list.add(5); // 1
//        list.add(80); // 2
//
//        list.set(2, 50);
//
//        System.out.println(list);
//
//
//        ArrayList<Integer> list = new ArrayList<>(11);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//
//        Field field = ArrayList.class.getDeclaredField("elementData");
//        field.setAccessible(true);
//        Object[] elementData = (Object[]) field.get(list);
//        System.out.println("ArrayList capacity: " + elementData.length);
//
//        list.add(1);
//
//
//        elementData = (Object[]) field.get(list);
//        System.out.println("ArrayList capacity: " + elementData.length);
//
//        list.remove(2);
//        list.remove(2);
//        list.remove(2);
//        list.remove(2);
//        list.remove(2);
//        list.remove(2);
//        list.remove(2);
//        list.remove(2);
//
//        elementData = (Object[]) field.get(list);
//        System.out.println("ArrayList capacity: " + elementData.length);
//
//        list.trimToSize();
//
//        elementData = (Object[]) field.get(list);
//        System.out.println("ArrayList capacity: " + elementData.length);
//
//
// List<String> list = new ArrayList<>();
//        System.out.println(list.getClass().getName());
//
//        List<String> list1 = Arrays.asList("Monday", "Tuesday");
//        System.out.println(list1.getClass().getName());
//        list1.set(1, "Wednesday");
//        System.out.println(list1.get(1));
//
//        String[] array = {"Apple", "Banana", "Cherry"};
//        List<String> list2 = Arrays.asList(array);
//        System.out.println(list2.getClass().getName());
//
//        List<String> list4 = new ArrayList<>(list2);
//        list4.add("Mango");
//        System.out.println(list4);
//
//
//        List<Integer> list3 = List.of(1, 2, 3, 4);
//        list3.set(1, 33);
//        // removing first occurence
//
//                List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        list.remove(Integer.valueOf(1));
//        System.out.println(list);
//
//                Object[] array = list.toArray();
//        Integer[] array1 = list.toArray(new Integer[0]);
//
//
//        List<String> words = Arrays.asList("banana", "apple", "date");
//        words.sort((a, b) -> b.length() - a.length());
//        System.out.println(words);
//
//
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(1);
//        list.add(3);
//
//        list.sort((a, b) -> b - a);
//        System.out.println(list);
//
//                List<Student> students = new ArrayList<>();
//        students.add(new Student("Charlie", 3.5));
//        students.add(new Student("Bob", 3.7));
//        students.add(new Student("Alice", 3.5));
//        students.add(new Student("Akshit", 3.9));
//
//        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
//
//        students.sort(comparator);
//        for (Student s : students) {
//            System.out.println(s.getName() + ": " + s.getGpa());
//        }
//
//        */
//
//    }
//
//}
//






package List.ArrayList;

import java.util.*;

/**
 * ✅ What is ArrayList?
 * -------------------------------
 * ArrayList is a resizable array implementation of the List interface in Java.
 * It allows dynamic storage, duplicate elements, maintains insertion order, and supports index-based access.
 *
 * ✅ Key Features:
 * - Dynamic size: expands automatically as you add elements
 * - Allows duplicate values
 * - Maintains insertion order
 * - Fast random access via index (like array)
 *
 * ✅ Benefits:
 * - Easy to use for ordered collections
 * - Provides many helpful methods (`add`, `get`, `remove`, `contains`, `sort`, etc.)
 * - More flexible than arrays (no need to know size in advance)

 * ✅ Common Problems & Solutions:
 * ----------------------------------------------------------------------
 * ❌ Problem: Slower performance when inserting/removing in the middle
 * ✅ Solution: Use LinkedList if frequent insert/delete from middle is needed

 * ❌ Problem: Not thread-safe
 * ✅ Solution: Use Collections.synchronizedList(new ArrayList<>()) or CopyOnWriteArrayList

 * ❌ Problem: Capacity increases in chunks (overhead)
 * ✅ Solution: Call `trimToSize()` after large removals to free memory

 * ❌ Problem: Cannot modify immutable lists (`List.of(...)`)
 * ✅ Solution: Use `new ArrayList<>(List.of(...))` for mutability
 */

class Student implements Comparable<Student> {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() { return name; }
    public double getGpa()  { return gpa; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(gpa, student.gpa) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gpa);
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", gpa=" + gpa + '}';
    }

    // Used for Comparable sorting
    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getGpa(), this.getGpa()); // Descending GPA
    }
}

public class Main {
    public static void main(String[] args) {

        // ✅ Creating and adding custom objects to ArrayList
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Akshit", 3.9));

        // ✅ Custom sorting logic using lambda
        students.sort((o1, o2) -> {
            if (o2.getGpa() - o1.getGpa() > 0) return 1;
            else if (o2.getGpa() - o1.getGpa() < 0) return -1;
            else return o2.getName().compareTo(o1.getName());
        });

        System.out.println("Sorted by Lambda:");
        for (Student s : students) {
            System.out.println(s.getName() + ": " + s.getGpa());
        }

        // ✅ Sorting using Comparator chaining
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        Collections.sort(students, comparator);

        // ✅ Immutable List using List.of()
        List<Integer> l1 = List.of(1, 4, 2, 7, 2);
        System.out.println("Immutable List (List.of): " + l1);

        // ✅ Sample List methods usage
        List<Integer> list = new ArrayList<>();
        list.add(1); // Add element
        list.add(5);
        list.add(80);
        list.set(2, 50); // Update value at index 2
        list.add(2, 100); // Add element at specific index
        System.out.println("List after modifications: " + list);
        list.remove(Integer.valueOf(5)); // Remove by value
        System.out.println("After removing 5: " + list);
        System.out.println("Contains 1? " + list.contains(1)); // Check if value exists
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Size: " + list.size());

        // ✅ Convert List to Array
        Object[] array = list.toArray();
        Integer[] array1 = list.toArray(new Integer[0]);

        // ✅ Sorting Strings by length
        List<String> words = Arrays.asList("banana", "apple", "date");
        words.sort((a, b) -> b.length() - a.length());
        System.out.println("Words sorted by length: " + words);

        // ✅ Sorting integers in reverse order
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 1, 3));
        nums.sort((a, b) -> b - a);
        System.out.println("Sorted nums: " + nums);

        // ✅ Working with Arrays.asList() vs ArrayList
        List<String> list1 = Arrays.asList("Monday", "Tuesday");
        list1.set(1, "Wednesday"); // Modifiable
        System.out.println("Modified list1: " + list1);

        String[] fruitsArray = {"Apple", "Banana", "Cherry"};
        List<String> list2 = Arrays.asList(fruitsArray); // Fixed size
        List<String> list4 = new ArrayList<>(list2); // Make mutable
        list4.add("Mango");
        System.out.println("New ArrayList from array: " + list4);

        // ✅ Dynamic capacity checking (for interview understanding)
        try {
            ArrayList<Integer> dynamicList = new ArrayList<>(11);
            for (int i = 0; i < 11; i++) dynamicList.add(1);

            java.lang.reflect.Field field = ArrayList.class.getDeclaredField("elementData");
            field.setAccessible(true);
            Object[] elementData = (Object[]) field.get(dynamicList);
//            System.out.println("Capacity before adding 12th: " + elementData.length);

            dynamicList.add(1);
            elementData = (Object[]) field.get(dynamicList);
            System.out.println("Capacity after adding 12th: " + elementData.length);

            // After trimming
            dynamicList.trimToSize();
            elementData = (Object[]) field.get(dynamicList);
            System.out.println("Capacity after trimToSize(): " + elementData.length);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // ✅ Immutable List can't be modified
        try {
            List<Integer> list3 = List.of(1, 2, 3, 4);
            // list3.set(1, 33); // ❌ Throws UnsupportedOperationException
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        /*
         ✅ Summary of Methods used in this file:
         -----------------------------------------------
         - add(E e)
         - add(int index, E e)
         - get(int index)
         - set(int index, E e)
         - remove(Object o)
         - contains(Object o)
         - size()
         - sort(Comparator)
         - toArray()
         - trimToSize()
         - equals(), hashCode(), compareTo() for custom sorting
         - Arrays.asList(), List.of()
        */
    }
}
