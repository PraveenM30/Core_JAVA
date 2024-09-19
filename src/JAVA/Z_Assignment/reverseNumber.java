package JAVA.Z_Assignment;

import java.sql.SQLOutput;
import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number u want to reverse ");
        int num=sc.nextInt();
        //int rev=0;
//        while (num != 0) {
//            rev=rev*10+num%10;
//            num=num/10;
//        }
//        System.out.println(rev);
        StringBuffer rev;
        StringBuffer s=new StringBuffer(String.valueOf(num));
        rev=s.reverse();
        System.out.print(rev);
    }
}
