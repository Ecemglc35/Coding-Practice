import java.util.Arrays;

public class ReverseString {
    // Reverse String question
    // Time complexity -> O(n)
    // Space Complexity -> O(1)
    public void reverseString(char[] s) {
        // Swap the elements from the start and end of the array
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        ReverseString sol = new ReverseString();

        // Test Case 1
        char[] test1 = { 'h', 'e', 'l', 'l', 'o' };
        sol.reverseString(test1);
        System.out.println("Test1: " + Arrays.toString(test1));

        // Test Case 2
        char[] test2 = { 'H', 'a', 'n', 'n', 'a', 'h' };
        sol.reverseString(test2);
        System.out.println("Test2: " + Arrays.toString(test2));

        // Test Case 3
        char[] test3 = { 'A', ' ', 'm', 'a', 'n', ',', ' ', 'a', ' ', 'p', 'l', 'a', 'n', ',', ' ', 'a', ' ', 'c', 'a',
                'n', 'a', 'l', ':', ' ', 'P', 'a', 'n', 'a', 'm', 'a' };
        sol.reverseString(test3);
        System.out.println("Test3: " + Arrays.toString(test3));

        // Test Case 4 (tek eleman)
        char[] test4 = { 'x' };
        sol.reverseString(test4);
        System.out.println("Test4: " + Arrays.toString(test4));

        // Test Case 5 (iki eleman)
        char[] test5 = { 'a', 'b' };
        sol.reverseString(test5);
        System.out.println("Test5: " + Arrays.toString(test5));
    }
}