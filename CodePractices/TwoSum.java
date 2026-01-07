package CodePractices;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        // map -> (target - currentNumber = difference, index of element )
        for (int i = 0; i < nums.length; i++) {
            // check if the current number exists in the map
            // if you find, return the index of the previous number(from map) and current
            // number
            if (map.get(nums[i]) != null)
                return new int[] { map.get(nums[i]), i };
            // keep add the difference and indexes
            map.put((target - nums[i]), i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        // Test Case 1
        int[] nums1 = { 2, 7, 11, 15 };
        int target1 = 9;
        System.out.println(Arrays.toString(solution.twoSum(nums1, target1)));
        // Expected: [0, 1]

        // Test Case 2
        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;
        System.out.println(Arrays.toString(solution.twoSum(nums2, target2)));
        // Expected: [1, 2]

        // Test Case 3
        int[] nums3 = { 3, 3 };
        int target3 = 6;
        System.out.println(Arrays.toString(solution.twoSum(nums3, target3)));
        // Expected: [0, 1]

        // Test Case 4 (Negative numbers)
        int[] nums4 = { -1, -2, -3, -4, -5 };
        int target4 = -8;
        System.out.println(Arrays.toString(solution.twoSum(nums4, target4)));
        // Expected: [2, 4]

        // Test Case 5 (No solution)
        int[] nums5 = { 1, 2, 3 };
        int target5 = 10;
        System.out.println(Arrays.toString(solution.twoSum(nums5, target5)));
        // Expected: []
    }
}
