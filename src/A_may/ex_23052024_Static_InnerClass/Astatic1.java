package A_may.ex_23052024_Static_InnerClass;

public class Astatic1 {


    public static void main(String[] args) {
        test t=new test();
        test.name="virat";
        test t1=new test();
        test.m2();
        t.m2();


        t.m1();
    }
}

class test{
    static String name="praveen";
    void m1(){
        System.out.println("Non Static method!");
        System.out.println(test.name);
    }
    static {
        System.out.println("Static block !!");
    }
    {
        System.out.println("Non Static block !  "+test.name);
    }

    static void m2(){
        System.out.println("Static method!");
    }
}