package CodePractices;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // Pointer for the last real element in nums1
        int p2 = n - 1; // Pointer for the last element in nums2
        int write = m + n - 1; // Pointer for the position to write in nums1

        // Merge from the back to avoid overwriting unprocessed elements in nums1
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] < nums2[p2]) {
                nums1[write] = nums2[p2];
                p2--;
            } else {
                nums1[write] = nums1[p1];
                p1--;
            }
            write--;
        }

        // If nums2 still has elements left, copy them to nums1
        while (p2 >= 0) {
            nums1[write] = nums2[p2];
            p2--;
            write--;
        }
    }

    public static void main(String[] args) {
        MergeSortedArray sol = new MergeSortedArray();

        // Test case 1
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        sol.merge(nums1, 3, nums2, 3);
        System.out.println("Test 1: " + Arrays.toString(nums1)); // Expected: [1,2,2,3,5,6]

        // Test case 2
        int[] nums3 = { 1 };
        int[] nums4 = {};
        sol.merge(nums3, 1, nums4, 0);
        System.out.println("Test 2: " + Arrays.toString(nums3)); // Expected: [1]

        // Test case 3
        int[] nums5 = { 0 };
        int[] nums6 = { 1 };
        sol.merge(nums5, 0, nums6, 1);
        System.out.println("Test 3: " + Arrays.toString(nums5)); // Expected: [1]

        // Test case 4 (edge case, nums1 empty, nums2 multiple)
        int[] nums7 = { 0, 0, 0 };
        int[] nums8 = { 1, 2, 3 };
        sol.merge(nums7, 0, nums8, 3);
        System.out.println("Test 4: " + Arrays.toString(nums7)); // Expected: [1,2,3]

        // Test case 5 (nums2 empty, nums1 multiple)
        int[] nums9 = { 1, 2, 3 };
        int[] nums10 = {};
        sol.merge(nums9, 3, nums10, 0);
        System.out.println("Test 5: " + Arrays.toString(nums9)); // Expected: [1,2,3]
    }
}
