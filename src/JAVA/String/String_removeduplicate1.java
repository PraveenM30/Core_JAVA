package JAVA.String;

import java.util.LinkedHashSet;
import java.util.Set;

public class String_removeduplicate1 {
    public static String removeDuplicate(String input) {
        Set<Character> charAt = new LinkedHashSet();

        for (char c : input.toCharArray()) {
            charAt.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (Character c : charAt) {
            result.append(c);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s=removeDuplicate("aabbcc");
        System.out.println("After removing duplicates >"+ s);
    }
}