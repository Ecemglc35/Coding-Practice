import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
    // Time Complexity -> O(n)
    // Space Complexity -> O(1)
    public static int[] replaceElementsWithGreatestElementOnRightSide(int[] arr) {
        // Edge case: null or empty array
        if (arr == null || arr.length == 0)
            return arr;

        // Store the last element as the initial maximum
        int max = arr[arr.length - 1];

        // Last element always becomes -1
        arr[arr.length - 1] = -1;

        // Traverse the array from right to left
        for (int i = arr.length - 2; i >= 0; i--) {
            // Kepp the current element
            int temp = arr[i];
            // Replace current element with the maximum on its right
            arr[i] = max;
            // Update the greatest element on the right side
            max = Math.max(max, temp);
        }

        return arr;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] test1 = { 17, 18, 5, 4, 6, 1 };
        System.out.println(Arrays.toString(test1) + " -> "
                + Arrays.toString(replaceElementsWithGreatestElementOnRightSide(test1)));
        // Expected: [18, 6, 6, 6, 1, -1]

        // Test Case 2
        int[] test2 = { 400 };
        System.out.println(Arrays.toString(test2) + " -> "
                + Arrays.toString(replaceElementsWithGreatestElementOnRightSide(test2)));
        // Expected: [-1]

        // Test Case 3
        int[] test3 = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(test3) + " -> "
                + Arrays.toString(replaceElementsWithGreatestElementOnRightSide(test3)));
        // Expected: [5, 5, 5, 5, -1]

        // Test Case 4
        int[] test4 = {};
        System.out.println(Arrays.toString(test4) + " -> "
                + Arrays.toString(replaceElementsWithGreatestElementOnRightSide(test4)));
        // Expected: []

        // Test Case 5
        int[] test5 = { 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(test5) + " -> "
                + Arrays.toString(replaceElementsWithGreatestElementOnRightSide(test5)));
        // Expected: [4, 3, 2, 1, -1]
    }
}
