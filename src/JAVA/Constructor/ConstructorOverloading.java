package JAVA.Constructor;

public class ConstructorOverloading {
    int a;
    String s;
    int b;
    double d;

    ConstructorOverloading(int a) {
        this.a = a;
    }

    //Constructor overloading based on Datatype
    ConstructorOverloading(String s) {
        this.s = s;
    }


    //Constructor overloading based on length
    ConstructorOverloading(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //Constructor overloading based on length
    ConstructorOverloading(int a, double d, int b, String s) {
        this.a = a;
        this.b = b;
        this.s = s;
        this.d = d;
    }

}

class Overloading {
    public static void main(String[] args) {
        ConstructorOverloading c = new ConstructorOverloading("its string type");
        System.out.println(c.s);
        ConstructorOverloading c1 = new ConstructorOverloading(2);
        System.out.println(c1.a);
        ConstructorOverloading c2 = new ConstructorOverloading(1, 12345, 6, "on basis of formal arguments");
        System.out.println(c2.d);
        ConstructorOverloading c3 = new ConstructorOverloading(1, 2);
        System.out.println(c3.a);
        System.out.println(c3.b);
    }
}
