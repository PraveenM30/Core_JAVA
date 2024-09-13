package A_april.ex_23042024_Decision_Making_Statement;

import java.util.Scanner;

public class eNestedDecision {
    public static void main(String[] args) {

        //to print the character is vowel or consonant
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");
        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            if (ch >= 'A' && ch <= 'Z') {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    System.out.println("It's a upper case Vowel");
                } else {
                    System.out.println("It's a Lower case Consonant");
                }
            } else {
                if (ch >= 'a' && ch <= 'z')
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        System.out.println("It's a lower case vowel");
                    } else {
                        System.out.println("it's a lower case consonant");
                    }
            }
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Its a numeric number");
        } else {
            System.out.println("Its a invalid character");
        }
    }

}

