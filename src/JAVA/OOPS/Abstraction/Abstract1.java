package JAVA.OOPS.Abstraction;

public abstract class Abstract1 {
    abstract void m1();
}

class aa extends Abstract1{

    @Override
    void m1() {
        System.out.println("Abstracted method");
    }
}

class runner3{
    public static void main(String[] args) {
       aa a=new aa();
       a.m1();
    }
}
