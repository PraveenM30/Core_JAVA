package JAVA.Arrays;

public class swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;

//       int temp=a;
//        a=b;
//        b=temp;

        a=a+b;//30
        b=a-b;//10
        a=a-b;
        System.out.println("after swapping, value of a is -> "+a);
        System.out.println("after swapping, value of b is -> "+b);

    }
}
