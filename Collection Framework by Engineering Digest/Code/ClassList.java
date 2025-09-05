import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;


interface  intern{
    void show();
}
abstract class sum implements intern{}

//ELC
public class ClassList  {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(3,"Kanha");
        map.put(1,"Hari");
        map.put(2,"Ritesh");
        map.put(5,"ww");
        map.put(4,"A");
        map.put(6,"zz");
        System.out.println(map);
    }

}

class A {
    Vector v = new Vector(5,2);
}

class B extends ArrayList{}

abstract class C implements List{ }

class D implements List{
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return List.of();
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}














/*
class Eng implements AutoCloseable{
    public void start(){
        System.out.println("Started!!!");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Close Eng");
    }
}

class Car{

    public Eng eng;

    public Car(Eng eng) {
        this.eng = eng;
    }

    public void carStart(){
        eng.start();
    }
}
 */























/*
class Eng{
    public void start(){
        System.out.println("Started!!!");
    }
}

class Car{
    //HAS-A
    public Eng eng;

    Car(){
        this.eng = new Eng(); //Strong - Com
    }

    public void carStart(){
        eng.start();
    }
}

 */