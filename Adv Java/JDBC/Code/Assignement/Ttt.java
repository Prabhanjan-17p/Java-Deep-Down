package Assignement;

public class Ttt {
    public static void main(String[] args) {
        Test(3);
    }

    private static void Test(int i) {
        if (i > 0){
            System.out.println(i); //3
            Test(i-1); //
            Test(i-1);
        }
    }
}
