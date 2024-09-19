package JAVA.Z_Assignment;

import java.util.Scanner;
public class reverseNumber_StringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        StringBuilder rev;
        StringBuilder s = new StringBuilder(String.valueOf(a));
        rev = s.reverse();
        System.out.println(rev);
    }
}