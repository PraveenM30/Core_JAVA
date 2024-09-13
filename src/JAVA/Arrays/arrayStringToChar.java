package JAVA.Arrays;

public class arrayStringToChar {
    public static void main(String[] args) {

        //WAPT convert string to char.
        String s="Praveen";
        char ch[]=s.toCharArray();
        for (int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
       // System.out.print("Zeroth index is -> "+ch[0]);
    }
}