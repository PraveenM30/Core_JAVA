package A_may.ex_21052024_Abstraction.abstraction.interfaceKeyword.EX1_Interface;

public interface Test1 {
    void m1();

     default void m2() {
        System.out.println("m2");
    }
}

class Test2 implements Test1 {
   public void m1() {
        System.out.println("m1");
    }

    void m3() {
        System.out.println("m3");
    }
}

class Test3 {
    public static void main(String[] args) {
        Test1 t = new Test2();
        t.m1();
    }
}