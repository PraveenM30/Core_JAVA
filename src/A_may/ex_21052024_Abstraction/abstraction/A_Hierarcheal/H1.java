package A_may.ex_21052024_Abstraction.abstraction.A_Hierarcheal;

abstract class H1 {
    void m11() {
        System.out.println("Im the boss");
    }

    abstract void m1();
}

 class H2 extends H1 {
    void m22() {
        System.out.println("m22");
    }

    @Override
    void m1() {
        System.out.println("m1 overided in 1st child");
    }
}

class H3 extends H1 {
    void m33() {
        System.out.println("m33");
    }

    @Override
    void m1() {
        System.out.println("m1 overided in 2nd child");
    }
}

class Runner {
    public static void main(String[] args) {
       H1 h1 = new H2();
        h1.m11();
        h1.m1();
        H1 h2 = new H3();
        h2.m1();
        h2.m11();
    }
}