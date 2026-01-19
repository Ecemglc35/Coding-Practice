public class ValidAnagram {
    // Time complexity -> O(n)
    // Space complexity -> O(1)
    public static boolean isAnagram(String s, String t) {

        // Step 1: If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Frequency array for characters a-z
        int[] freq = new int[26];

        // Step 3: Count characters in first string and increase 1 the character's index
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Step 4: Subtract characters using second string
        for (char c : t.toCharArray()) {
            freq[c - 'a']--;
        }

        // Step 5: Check if all counts are zero
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        // Test Case 1
        System.out.println(isAnagram("anagram", "nagaram"));
        // true → same characters with the same frequency

        // Test Case 2
        System.out.println(isAnagram("rat", "car"));
        // false → characters do not match

        // Test Case 3
        System.out.println(isAnagram("aacc", "ccac"));
        // false → frequency of 'a' is different

        // Test Case 4
        System.out.println(isAnagram("listen", "silent"));
        // true → classic anagram example

        // Test Case 5
        System.out.println(isAnagram("abc", "ab"));
        // false → different lengths

        // Test Case 6
        System.out.println(isAnagram("zzz", "zzz"));
        // true → identical strings
    }
}
