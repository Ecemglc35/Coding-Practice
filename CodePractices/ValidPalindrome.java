import java.util.*;

public class ValidPalindrome {
    // Space Complexity -> O(1)
    // Time Complexity -> O(n)
    public boolean isPalindrome(String s) {
        int p1 = 0; // left pointer
        int p2 = s.length() - 1; // right pointer

        while (p2 >= p1) {
            // skip non-alphanumeric characters from left
            while (p1 < p2 && !Character.isLetterOrDigit(s.charAt(p1)))
                p1++;
            // skip non-alphanumeric characters from right
            while (p1 < p2 && !Character.isLetterOrDigit(s.charAt(p2)))
                p2--;

            // Compare characters (case-insensitive)
            if (Character.toLowerCase(s.charAt(p1)) != Character.toLowerCase(s.charAt(p2)))
                return false;

            p1++;
            p2--;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();

        // Example 1
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Test 1: " + vp.isPalindrome(s1)); // Expected: true

        // Example 2
        String s2 = "race a car";
        System.out.println("Test 2: " + vp.isPalindrome(s2)); // Expected: false

        // Example 3
        String s3 = " ";
        System.out.println("Test 3: " + vp.isPalindrome(s3)); // Expected: true

        // Extra tests
        String s4 = "0P";
        System.out.println("Test 4: " + vp.isPalindrome(s4)); // Expected: false

        String s5 = "ab@a";
        System.out.println("Test 5: " + vp.isPalindrome(s5)); // Expected: true

        String s6 = " ";
        System.out.println("Test 6: " + vp.isPalindrome(s6)); // Expected: true
    }
}
