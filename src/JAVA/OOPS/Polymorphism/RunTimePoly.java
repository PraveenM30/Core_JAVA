package JAVA.OOPS.Polymorphism;

public class RunTimePoly {

    //A link between method call statement and method implementation happens during run time is called as Run Time Poly.
    //method overriding>> the process of overriding the super class method with sub class method.
    //
    void m() {
        System.out.println("super class method");
    }
}

class RunTimePoly2 extends RunTimePoly {
    @Override
    void m() {
        System.out.println("super class method overrided !!");
    }
}

class runner2 {
    public static void main(String[] args) {
        RunTimePoly r = new RunTimePoly2();
        r.m();
    }
}
