package JAVA.Exceptions;

public class ClassCasteException1 {
    int a = 20;
}

class ClassCasteException2 extends ClassCasteException1 {
    int b = 20;
}

class ClassCasteException {
    public static void main(String[] args) {
        try {
            ClassCasteException1 a = new ClassCasteException1();
//without upcasting im doing dowcating so i will get class caste exception.
            ClassCasteException2 a1 = (ClassCasteException2) a;
        } catch (ClassCastException c) {
            System.out.println("Its a ClassCasteException !!");
        }
    }
}