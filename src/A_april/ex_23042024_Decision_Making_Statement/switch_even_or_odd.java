package A_april.ex_23042024_Decision_Making_Statement;

import java.util.Scanner;

public class switch_even_or_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int a=sc.nextInt();
        switch (a%2){
            case 0: System.out.println("its a even");
                break;
                case 1:  System.out.println("It's a ODD");
              break;
        }
    }
}
