package A_may.ex_21052024_Abstraction.abstraction.interfaceKeyword.Hierarcheal_Interface;

interface Test1 {
    void m1();
}

class Test2 implements Test1 {

    @Override
    public void m1() {
        System.out.println("m1 from 1st child");
    }
}

class Test3 implements Test1 {

    @Override
    public void m1() {
        System.out.println("m1 from 2nd child");
    }

    public static void main(String[] args) {
        Test1 t = new Test3();
        t.m1();
        Test1 t1 = new Test2();
        t1.m1();
    }
}
abstract class test4 implements Test1{
    abstract void m3();
}
class test5 extends test4{

    @Override
    void m3() {
        System.out.println("Its a abstract class");
    }

    @Override
    public void m1() {
        System.out.println("m1 from 3rd child");
    }

    public static void main(String[] args) {
        test5 tt=new test5();
        tt.m1();
        tt.m3();
    }
}
