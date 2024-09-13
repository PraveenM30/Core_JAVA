package JAVA.OOPS.Polymorphism;

public class CompileTimePoly {
//A link b/w method call statement and method implementation happens during compile time is called compile time polymorphism.
    //method Overloading>> A single class having multiple methods with same name but with different parameter.

    void m() {
        System.out.println("zero parameter");
    }

    void m(int a) {
        System.out.println("single parameterized !");
    }
    void m(String s,int a){
        System.out.println(s+a);
    }
}
class runner1 {
    public static void main(String[] args) {
        CompileTimePoly c = new CompileTimePoly();
        c.m();
        c.m(1);
        c.m("Hi",2);
    }
}
