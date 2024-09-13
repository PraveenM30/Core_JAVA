package A_april.ex_20042024_string;

public class str_split {
    public static void main(String[] args) {
        String s = "Hi how are you!";
        String s1[] = s.split(" ");
        for (int i = 0; 1 <= s1.length; i++) {
            System.out.println(s1[i]);
        }
    }
}