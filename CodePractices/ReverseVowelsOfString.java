public class ReverseVowelsOfString {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int l = 0;
        int r = arr.length - 1;

        while (l < r) {

            // Move left pointer until a vowel is found
            while (l < r && !isVowel(arr[l])) {
                l++;
            }

            // Move right pointer until a vowel is found
            while (l < r && !isVowel(arr[r])) {
                r--;
            }

            // Swap the vowels
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }

        return new String(arr);
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    // Test cases
    public static void main(String[] args) {

        ReverseVowelsOfString sol = new ReverseVowelsOfString();

        System.out.println(sol.reverseVowels("hello"));
        // expected: holle

        System.out.println(sol.reverseVowels("leetcode"));
        // expected: leotcede

        System.out.println(sol.reverseVowels("aA"));
        // expected: Aa

        System.out.println(sol.reverseVowels("programming"));
        // expected: prigrammong

        System.out.println(sol.reverseVowels("bcdfg"));
        // expected: bcdfg (no vowels)

        System.out.println(sol.reverseVowels("AEIOU"));
        // expected: UOIEA

        System.out.println(sol.reverseVowels(""));
        // expected: ""

        System.out.println(sol.reverseVowels("a"));
        // expected: a
    }
}