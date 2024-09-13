package JAVA.Exceptions;

public class Throw {
    public static void main(String[] args) throws Exception {
        int a = -1;
        if (a < 0) {
            throw new Exception("Number cannot be negative!!");
        }
    }
}