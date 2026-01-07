package CodePractices;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        // with Kadane’s Algorithm
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0)
                currentSum = 0;
        }
        return maxSum;

    }

    public static void main(String[] args) {
        MaximumSubarray solution = new MaximumSubarray();

        // Test Case 1: Mixed positive & negative (classic case)
        int[] nums1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(solution.maxSubArray(nums1));
        // Expected: 6 -> [4, -1, 2, 1]

        // Test Case 2: All positive numbers
        int[] nums2 = { 1, 2, 3, 4 };
        System.out.println(solution.maxSubArray(nums2));
        // Expected: 10

        // Test Case 3: All negative numbers
        int[] nums3 = { -1, -2, -3, -4 };
        System.out.println(solution.maxSubArray(nums3));
        // Expected: -1

        // Test Case 4: Single element (positive)
        int[] nums4 = { 5 };
        System.out.println(solution.maxSubArray(nums4));
        // Expected: 5

        // Test Case 5: Single element (negative)
        int[] nums5 = { -7 };
        System.out.println(solution.maxSubArray(nums5));
        // Expected: -7

        // Test Case 6: Zeros included
        int[] nums6 = { 0, -3, 5, -2, 0, 3 };
        System.out.println(solution.maxSubArray(nums6));
        // Expected: 6 -> [5, -2, 0, 3]

        // Test Case 7: Large negative reset case
        int[] nums7 = { -100, 1, 2, 3, 4 };
        System.out.println(solution.maxSubArray(nums7));
        // Expected: 10
    }
}
