class Test {
    static {
        System.out.println("Test: static block");
    }

    Test() {
        System.out.println("Test: O-param constructor");
    }
}

class Demo {
    static {
        System.out.println("Demo: static block");
    }

    Demo() {
        System.out.println("Demo: O-param constructor");
    }
}

public class Load_Class_01 {
    public static void main(String[] args) throws Exception{
        System.out.println("start of main(-) method");
//create objs for Demo class
        Demo dl=new Demo();
        Demo d2=new Demo();
        Demo d3=new Demo();
//Load Test class
        Class.forName("Test");
        Class.forName("Test");
        Class.forName("Test");
        Class. forName("Demo");
        System.out.println("end of main(-) method");
    }
}
