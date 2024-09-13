package A_may.ex_23052024_Static_InnerClass;

public class Astatic2 {
    static int a=10;
    static {
        int a=20;
    }

    public static void main(String[] args) {
       a=30;

        // Astatic2 d=new Astatic2();
        System.out.println(a);
    }
}
