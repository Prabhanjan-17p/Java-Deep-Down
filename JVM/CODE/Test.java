package JVM;

import java.lang.reflect.*;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Student c = new Student();
//        Class  c = Class.forName("Student");

        Field[] f = c.getClass().getFields();
        for (Field f1:f){
            System.out.println(f1);
        }

        Method[] m = c.getClass().getDeclaredMethods();
        for (Method m1:m){
            System.out.println(m1);
        }

        Student s1 = new Student();
        Class c1 = s1.getClass();

        Student s2 = new Student();
        Class c2 = s2.getClass();

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1==c2);

    }
}
