package A_april.ex_20042024_string;

public class str_tocharArray {
    public static void main(String[] args) {
       String s="abcd";
       char ch[]=s.toCharArray();
     //   System.out.println(ch.length);
       for (int i=ch.length-1;i>=0;i--){
           System.out.print(ch[i]);
        }
    }
}
