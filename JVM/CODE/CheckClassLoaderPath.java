package JVM;
public class CheckClassLoaderPath {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
//        System.out.println(JVM.CheckAndPassIntoJAR.class.getClassLoader());
        System.out.println(CheckClassLoaderPath.class.getClassLoader());
        System.out.println();
    }
}
