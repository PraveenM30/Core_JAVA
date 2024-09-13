package A_april.ex_23042024_Decision_Making_Statement;

import java.util.Scanner;

public class switch_vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any any Alphanumeric character");
        char ch = sc.next().charAt(0);
        switch (ch) {
//            case 'a':
//                System.out.println("its a vowel");
//                break;
//            case 'e':
//                System.out.println("its a vowel");
//                break;
//            case 'i':
//                System.out.println("its a vowel");
//                break;
//            case 'o':
//                System.out.println("its a vowel");
//                break;
//            case 'u':
//                System.out.println("its a vowel");
//                break;


            //METHOD 2
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("its a vowel");
                break;

            default:
                System.out.println("not a vowel");
        }

    }
}
