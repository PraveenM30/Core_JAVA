package A_april.Operators;

public class Logical {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        System.out.println(a==b || a<b);   //OR operator --> any one should be true
        System.out.println((a<=b && b>a)); // AND operator -> both should be true
        System.out.println(!(a>b));        //will get opposite result
        System.out.println(!!(a>b));
    }
}
