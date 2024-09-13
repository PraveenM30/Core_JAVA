package A_may.ex_23052024_Static_InnerClass;

public class AInnerClass {
    public static void main(String[] args) {
        OuterC.inner c=new OuterC.inner();
        c.m1();
        OuterC cc=new OuterC();
        cc.m0();
    }
}

class OuterC {
    static int a = 10;
    int b=20;
    void m0(){
        System.out.println(OuterC.a);
        System.out.println(b);
    }

    static class inner {
       // OuterC d=new OuterC();
        void m1() {
            System.out.println(a);
            //System.out.println(d.b);
        }
    }
}