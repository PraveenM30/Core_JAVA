package JAVA.Exceptions;

public class ArthmeticException {
    public static void main(String[] args) {
        try {

            String s = "sdf";
            s = null;
            int a=10/0;
            System.out.println(s.trim());
        }
        catch (NullPointerException | ArithmeticException n){
            System.out.println( "s is null");
        }
        catch (Exception e){
            System.out.println("a issue");
        }
        catch (Throwable t){
            System.out.println("issue here");
        }
    }
}
