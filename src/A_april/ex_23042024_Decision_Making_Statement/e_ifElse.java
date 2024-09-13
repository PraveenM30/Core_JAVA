package A_april.ex_23042024_Decision_Making_Statement;

import java.util.Scanner;

public class e_ifElse {
    public static void main(String[] args) {
        //program to print even or odd using if else statement

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("its a even number");
        }
        else{
            System.out.println("its a odd number");
        }
    }
}
