package JAVA.OOPS.Abstraction;

public abstract class Abstract2 {

    void concreteNethod() {
        System.out.println("Im a concrete method!!");
    }

    abstract void m1();
}

abstract class ML2 extends Abstract2 {
    @Override
    void m1() {
        System.out.println("It is abstracted!!");
    }
    abstract void m2();
}

class ML3 extends ML2 {

    @Override
    void m2() {
        System.out.println("Im a method 2");
    }
    void m3(){
        System.out.println("Im from ML3 method");
    }
 }
 class runner4 {
    public static void main(String[] args) {
        Abstract2 a = new ML3();
        a.m1();
        a.concreteNethod();

        ML2 b = new ML3();
        b.m1();
        b.m2();
        b.concreteNethod();

        ML3 c= (ML3) b; //downcasting
        c.m3();
    }
}
