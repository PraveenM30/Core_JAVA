package A_april.Arrays;

public class array5 {
    public static void main(String[] args) {

        //WAPT convert string to char.
        String s="Praveen";
        char ch[]=s.toCharArray();
        for (int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
        System.out.println("Zeroth index is -> "+ch[0]);
    }
}