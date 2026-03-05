import java.util.HashMap;

//Time Complexity -> O(n), Space Complexity -> O(n)
public class IsomorphicStrings {
    /*
     * Helper method that checks if characters in str1
     * can consistently map to characters in str2.
     */
    public static boolean checkMapping(String str1, String str2) {

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {

            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            // If the character already has a mapping and Check if the mapping matches the
            // current character
            if (map.containsKey(c1) && map.get(c1) != c2)
                return false;
            else
                // Create new mapping
                map.put(c1, c2);
        }

        return true;
    }

    /*
     * Main isomorphic check.
     * We run the mapping check twice:
     * 1. s -> t
     * 2. t -> s
     * 
     * This ensures a one-to-one mapping.
     */
    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        return checkMapping(s, t) && checkMapping(t, s);
    }

    public static void main(String[] args) {

        String[][] testCases = {
                { "egg", "add" },
                { "foo", "bar" },
                { "paper", "title" },
                { "ab", "aa" },
                { "badc", "baba" }
        };

        boolean[] expectedResults = {
                true,
                false,
                true,
                false,
                false
        };

        for (int i = 0; i < testCases.length; i++) {

            String s = testCases[i][0];
            String t = testCases[i][1];

            boolean result = isIsomorphic(s, t);

            System.out.println("Test Case " + (i + 1));
            System.out.println("Input: s = \"" + s + "\", t = \"" + t + "\"");
            System.out.println("Expected Output: " + expectedResults[i]);
            System.out.println("Actual Output:   " + result);
            System.out.println("----------------------------------");
        }
    }
}
