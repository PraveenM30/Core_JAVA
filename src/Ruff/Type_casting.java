package Ruff;

public class Type_casting {

    //Implicit or Widening
    public static void main(String[] args) {
        int a=10;
        float b=a;
        System.out.println(b);

        long l=123456;
        double d=l;
        System.out.println(d);

        float f=69f;
        double dd=f;
        System.out.println(dd);
    }
}

//Explicit or Narrowing
class Explicit{
    public static void main(String[] args) {
        double d=10.2;
        int a=(int)d;
        System.out.println(a);    }
}


