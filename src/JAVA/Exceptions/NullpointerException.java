package JAVA.Exceptions;

public class NullpointerException {

    public static void main(String[] args) {
        try {

            String s = "sdf";
            s = null;

            System.out.println(s.trim());
        } catch (NullPointerException n) {
            System.out.println("s is null");

        }
    }

}
