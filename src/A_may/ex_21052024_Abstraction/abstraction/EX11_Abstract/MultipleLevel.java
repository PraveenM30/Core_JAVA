package A_may.ex_21052024_Abstraction.abstraction.EX11_Abstract;

public abstract class MultipleLevel {
    void m1() {
        System.out.println("m1");
    }

    abstract void m2();
}

abstract class MultipleLevel2 extends MultipleLevel {

    @Override
    void m2() {
        System.out.println("m2");
    }

    abstract void m3();
}

class MultipleLevel3 extends MultipleLevel2 {

    @Override
    void m3() {
        System.out.println("m3");
    }

    void m4(){
        System.out.println("m4");
    }

}

class runner {
    public static void main(String[] args) {
        MultipleLevel a = new MultipleLevel3();
        a.m2();
        a.m1();
       // a.m3();



        MultipleLevel2 b = new MultipleLevel3();
        b.m1();
        b.m2();
        b.m3();
        //b.m4();
    }
}
