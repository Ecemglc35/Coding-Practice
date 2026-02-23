import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    // Time Complexity -> O(n)
    // Space Complexity -> O(n)
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            // Check the hashset has the number
            if (seen.contains(num))
                return true;
            // Else add the number into the hashset
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] test1 = { 1, 2, 3, 1 };
        int[] test2 = { 1, 2, 3, 4 };
        int[] test3 = { 1, 1, 1, 3, 3, 4 };
        int[] test4 = {};
        int[] test5 = { 5 };

        System.out.println(Arrays.toString(test1) + " -> " + containsDuplicate(test1));
        System.out.println(Arrays.toString(test2) + " -> " + containsDuplicate(test2));
        System.out.println(Arrays.toString(test3) + " -> " + containsDuplicate(test3));
        System.out.println(Arrays.toString(test4) + " -> " + containsDuplicate(test4));
        System.out.println(Arrays.toString(test5) + " -> " + containsDuplicate(test5));
    }
}
