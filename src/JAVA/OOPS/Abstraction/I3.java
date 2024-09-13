package JAVA.OOPS.Abstraction;

public interface I3 {
    void m111();
}

class a implements I3{

    @Override
    public void m111() {
        System.out.println("from class a");
    }
}

class b implements  I3{
   public void m111(){
       System.out.println("from class b");
    }
}

class runner2{
    public static void main(String[] args) {
        b bb=new b();
        bb.m111();
        a aa=new a();
        aa.m111();

        // or u can use upcasting
        I3 i=new a();
        i.m111();
        I3 ii=new b();
        ii.m111();

    }
}
