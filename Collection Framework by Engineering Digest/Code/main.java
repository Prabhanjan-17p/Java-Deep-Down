public class main {
    public static void main(String[] args) {

        MySingle.mySingle();
        MySingle.mySingle();
        MySingle.mySingle();


//        MySingle m1 = MySingle.m;
//        MySingle m2 = MySingle.m;
//        MySingle m3  = MySingle.m;
//        MySingle m4 = MySingle.m;
    }
}


class  MySingle{
    int x ;

//    public static  MySingle m = new MySingle() ;

    private MySingle(){
        x = 10;
        System.out.println(x);
    }

    public static  MySingle mySingle(){
        return new MySingle();
    }
}