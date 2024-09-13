package JAVA.Arrays;

import java.util.Scanner;

public class charToArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of character !");
        int a=sc.nextInt();
        char ch[]=new char[a];
        System.out.println("Enter the character");
        for (int i=0;i<ch.length;i++){
            ch[i]=sc.next().charAt(0);
        }
        for (int i = 0; i<ch.length ; i++) {
            System.out.println(ch[i]);
        }
    }
}
