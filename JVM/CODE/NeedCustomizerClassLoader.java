package JVM;

public class NeedCustomizerClassLoader {
    public static void main(String[] args) throws ClassNotFoundException {
        NCC1 n = new NCC1();
        System.out.println(n.num);

        Runtime r =  Runtime.getRuntime();
        System.out.println("");
    }
}
