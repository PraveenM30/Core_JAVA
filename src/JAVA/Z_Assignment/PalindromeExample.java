package JAVA.Z_Assignment;

public class PalindromeExample {

    public static void main(String[] args) {
        String str = "madam"; // Change this string to test different inputs

        // Check if the string is a palindrome
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    // Function to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Initialize pointers for start and end of the string
        int left = 0;
        int right = str.length() - 1;

        // Loop through the string from both ends towards the center
        while (left < right) {
            // Compare characters at left and right positions
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters don't match, not a palindrome
            }
            left++; // Move left pointer forward
            right--; // Move right pointer backward
        }

        return true; // If all characters matched, it's a palindrome
    }
}
