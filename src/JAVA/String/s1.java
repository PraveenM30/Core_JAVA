package JAVA.String;

public class s1 {
    public static void main(String[] args){
        String s1=new String("hi");
        String s2=new String("hi");
        String s3="hello";
        String s4="hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);
    }
}
