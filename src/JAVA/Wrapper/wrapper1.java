package JAVA.Wrapper;

public class wrapper1 {
    public static void main(String[] args) {
        int a = 10;//primitiva data type
        Integer b = Integer.valueOf(3);//wrapper class
        b.doubleValue();
        System.out.println(b);

        System.out.println(Integer.max(13, 0));
        System.out.println(Integer.min(0, -1));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


    }
}
