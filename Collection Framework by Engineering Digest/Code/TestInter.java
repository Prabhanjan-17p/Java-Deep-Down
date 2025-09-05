
@FunctionalInterface
public interface TestInter {
    void add();
//    void div();


    default  void addSub(){
        //....
    }
    static void mul(){
        //....
    }

}


class  TestClass implements  TestInter{

    @Override
    public void add() {

    }

    @Override
    public void addSub() {

    }
}
