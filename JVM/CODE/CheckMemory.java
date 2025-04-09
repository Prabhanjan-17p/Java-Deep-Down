


public class CheckMemory {
    public static void main(String[] args) {
        System.out.println(CheckMemory.class.getClassLoader().hashCode());
        System.out.println(CheckClassLoaderPath.class.getClassLoader().hashCode());
        System.out.println(formating.class.getClassLoader().hashCode());
    }
}
