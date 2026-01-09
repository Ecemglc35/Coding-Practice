public class FirstUniqueCharacterInaString {
    // Time Complexity = O(n)
    // Space complexity = O(1) -> contant size -> 26
    public int firstUniqChar(String s) {
        int[] arr = new int[26]; // array to store frequency of each lowercase letter

        // 1st pass: count frequency of each character -> for character a -> arr[0] =
        // frequency
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        // 2nd pass: find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        // return -1 if there is no unique character
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterInaString sol = new FirstUniqueCharacterInaString();

        // Test Case 1: first unique character is 'l' at index 0
        String test1 = "leetcode";
        System.out.println("Test1: " + sol.firstUniqChar(test1)); // Expected: 0

        // Test Case 2: first unique character is 'v' at index 2
        String test2 = "loveleetcode";
        System.out.println("Test2: " + sol.firstUniqChar(test2)); // Expected: 2

        // Test Case 3: no unique character
        String test3 = "aabbcc";
        System.out.println("Test3: " + sol.firstUniqChar(test3)); // Expected: -1

        // Test Case 4: single character
        String test4 = "x";
        System.out.println("Test4: " + sol.firstUniqChar(test4)); // Expected: 0

        // Test Case 5: first character is unique
        String test5 = "zabcabc";
        System.out.println("Test5: " + sol.firstUniqChar(test5)); // Expected: 0
    }
}
