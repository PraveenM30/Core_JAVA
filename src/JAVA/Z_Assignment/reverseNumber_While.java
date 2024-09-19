package JAVA.Z_Assignment;

import java.util.Scanner;

public class reverseNumber_While {

    public static void main(String[] args) {
        int rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        while (num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println(rev);
    }
}
