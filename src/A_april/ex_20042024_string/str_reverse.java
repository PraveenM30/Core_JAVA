package A_april.ex_20042024_string;

public class str_reverse {
    public static void main(String[] args) {
        String s = "praveen";
        //System.out.println(s.length());//7
        for (int i = s.length() - 1; i > -1; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
