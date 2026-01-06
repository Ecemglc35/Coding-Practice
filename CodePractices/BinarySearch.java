package CodePractices;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ints = { 1, 2, 3, 4, 7, 9, 11 };
        System.out.println(binarySearch(ints, 9)); // 5
        System.out.println(binarySearch(ints, 8)); // -1
        System.out.println(binarySearch(ints, 1)); // 0

        // with build in library
        System.out.println(Arrays.binarySearch(ints, 9));
    }

    // Array should be sorted
    public static int binarySearch(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int middlePosition = (low + high) / 2;
            int middleNumber = numbers[middlePosition];

            if (target == middleNumber)
                return middlePosition;
            if (target < middleNumber) {
                high = middlePosition - 1;
            } else {
                low = middlePosition + 1;
            }
        }
        return -1;
    }
}
