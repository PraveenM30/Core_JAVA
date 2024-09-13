package JAVA.OOPS.Abstraction;

public interface I22 {
    void mm1();
}
class c11{
    void mm2(){
        System.out.println("Class 1");
    }
 }

 class c12 extends c11 implements I22{

     @Override
     public void mm1() {
         System.out.println("Method 1");
     }
 }

 class runner1{
     public static void main(String[] args) {
        c12 c=new c12();
        c.mm1();
        c.mm2();
     }
 }