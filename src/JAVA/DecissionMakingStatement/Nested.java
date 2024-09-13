package JAVA.DecissionMakingStatement;

public class Nested {
    public static void main(String args[]) {

        int ch = 6;

        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            if (ch >= 'A' && ch <= 'Z') {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    System.out.println("It's a Upper Case Vowel !");
                } else {
                    System.out.println("its a upper case consoneny");
                }
            } else {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    System.out.println("Its a lower case Vowel");
                } else {
                    System.out.println("its a lower case consonant");
                }
            }
        }
           else if (ch >= '0' && ch <= '9') {
            System.out.println("its a number");
        } else {
            System.out.println("Its not eligible!!");
        }
    }
}


