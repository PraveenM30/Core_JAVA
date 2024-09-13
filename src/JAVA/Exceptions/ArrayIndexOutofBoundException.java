package JAVA.Exceptions;

public class ArrayIndexOutofBoundException {
    public static void main(String[] args) {
        try {
            int a[] = {1, 2, 3, 4};
            System.out.println(a[4]);
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Its a ArrayIndex out of Bound Exceptiion !!");
        }
    }
}
