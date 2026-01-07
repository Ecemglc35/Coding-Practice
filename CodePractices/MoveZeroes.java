package CodePractices;

import java.util.Arrays;

// Time Complexity O(n) - Space Complexity O(1)
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        // find the non zero numbers and put the next position
        int position = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[position++] = num;
            }
        }
        // fill other position with zero
        while (position < nums.length) {
            nums[position++] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeroes solution = new MoveZeroes();
        // Test Case 1: Mixed values
        int[] nums1 = { 0, 1, 0, 3, 12 };
        solution.moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));
        // Expected: [1, 3, 12, 0, 0]

        // Test Case 2: Single zero
        int[] nums2 = { 0 };
        solution.moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2));
        // Expected: [0]

        // Test Case 3: No zeros
        int[] nums3 = { 1, 2, 3, 4 };
        solution.moveZeroes(nums3);
        System.out.println(Arrays.toString(nums3));
        // Expected: [1, 2, 3, 4]

        // Test Case 4: All zeros
        int[] nums4 = { 0, 0, 0 };
        solution.moveZeroes(nums4);
        System.out.println(Arrays.toString(nums4));
        // Expected: [0, 0, 0]

        // Test Case 5: Zeros at the end
        int[] nums5 = { 1, 2, 3, 0, 0 };
        solution.moveZeroes(nums5);
        System.out.println(Arrays.toString(nums5));
        // Expected: [1, 2, 3, 0, 0]

        // Test Case 6: Negative and positive numbers
        int[] nums6 = { -1, 0, 2, 0, 3 };
        solution.moveZeroes(nums6);
        System.out.println(Arrays.toString(nums6));
        // Expected: [-1, 2, 3, 0, 0]
    }
}
