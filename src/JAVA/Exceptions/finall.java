package JAVA.Exceptions;

public class finall {
    public static void main(String[] args) {
        try {
            int a=1/0;
            System.out.println(a);
        }
//        catch (ArithmeticException a){
//            System.out.println("its a Arthmetic exception !");
//        }
        finally {
            System.out.println("im final i will execute!");
        }
    }
}
