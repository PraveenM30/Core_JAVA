package JAVA.Arrays;

import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {

        //WAPTF whether the character is vowel or not using scanner class, take size and input from user.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the character");
        int a= sc.nextInt();
        char ch[]=new char[a];
        System.out.println("Enter lower case character!");
        for (int i=0;i<ch.length;i++){
            ch[i]=sc.next().charAt(0);
        }
        for (int i=0;i<ch.length;i++){
            if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'|| ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                System.out.println(ch[i]+ " it is a vowel!");
            }else {
                System.out.println(ch[i]+" it is not a vowel character");
            }
        }

    }
}
