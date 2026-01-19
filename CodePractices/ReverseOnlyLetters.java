public class ReverseOnlyLetters {
    // Time complexity -> O(n)
    // Space complexity -> O(n)
    public static String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int p1 = 0;
        int p2 = arr.length - 1;

        while (p2 > p1) {
            // Move left pointer until it points to a letter
            while (p2 > p1 && !isLetter1(arr[p1])) {
                p1++;
            }

            // Move right pointer until it points to a letter
            while (p2 > p1 && !isLetter1(arr[p2])) {
                p2--;
            }

            // Swap letters
            char temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            // Move pointers
            p1++;
            p2--;
        }

        return new String(arr);
    }

    public static boolean isLetter1(char s) {
        return (s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z');
    }

    public static void main(String[] args) {

        // Test Case 1
        String s1 = "ab-cd";
        System.out.println(reverseOnlyLetters(s1));
        // Expected Output: "dc-ba"

        // Test Case 2
        String s2 = "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(s2));
        // Expected Output: "j-Ih-gfE-dCba"

        // Test Case 3
        String s3 = "Test1ng-Leet=code-Q!";
        System.out.println(reverseOnlyLetters(s3));
        // Expected Output: "Qedo1ct-eeLg=ntse-T!"

        // Test Case 4 (Only letters)
        String s4 = "leetcode";
        System.out.println(reverseOnlyLetters(s4));
        // Expected Output: "edocteel"

        // Test Case 5 (No letters)
        String s5 = "123-456";
        System.out.println(reverseOnlyLetters(s5));
        // Expected Output: "123-456"

        // Test Case 6 (Single character)
        String s6 = "a";
        System.out.println(reverseOnlyLetters(s6));
        // Expected Output: "a"
    }
}
