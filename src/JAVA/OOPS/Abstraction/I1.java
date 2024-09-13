package JAVA.OOPS.Abstraction;

public interface I1 {
    void m1();
}

interface I2 {
    void m2();
}
 class  c1 implements I2,I1{

     @Override
     public void m1() {
         System.out.println("Method 1 !!");
     }

     @Override
     public void m2() {
         System.out.println("Method 2 !!");
     }
 }

 class runner{
    public static void main(String[] args) {
    c1 c=new c1();
    c.m1();
    c.m2();
}
        }

