package JVM;

public class CustomClassLoader extends ClassLoader{
    public Class  loadClass(String cname) throws  ClassNotFoundException{
        /*
            Check whether updated version is available or not.
            If updated version is available then load updated version
            and returns the corresponding class Class object.
            otherwise return class Class object of already loaded .class
         */

        return cname.getClass();
    }
}

class CustomClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Student s1 = new Student();
        CustomClassLoader c = new CustomClassLoader();
        c.loadClass("Student");
        c.loadClass("Student");
    }
}