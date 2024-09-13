package JAVA.Arrays;

import java.util.Scanner;

public class NumToArray {
    public static void main(String[] args) {

        //WAP to pass number in an array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int a = sc.nextInt();
        int[] b = new int[a];
        System.out.println("Enter the number");

        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
