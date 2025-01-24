import java.util.Arrays;

public class BinarySearchApproach {
    // NOTE:
// This approach works only if the array is already sorted.
// Two-pointer technique:
// Start with one pointer at the beginning (left) and the other at the end (right) of the array.
// If the sum of the two elements is greater than the target, move the right pointer leftward to reduce the sum.
// If the sum is less than the target, move the left pointer rightward to increase the sum.

    // a = [1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10]
    // target = 19

    public static int[] twoSumPair(int[] a, int target) {
        if ( Arrays.equals(a, null) || Arrays.equals(a, new int[0])) {
            return null;
        }

        for (int i = 0; i < a.length; i++) {
            int complement = target - a[i];
            int index = binarySearch(a, i + 1, a.length - 1, complement);
            if (index != -1) {
                return new int[]{i, index};
            }
        }
        return null;
    }

    public static int binarySearch(int[] a, int low, int high, int key) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                low = mid + 1;
            } else if (a[mid] > key) {
                low = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 6, 7};
        int[] result = twoSumPair(a, 8);
        System.out.println(Arrays.toString(result)); // Positive case

        int[] b = {1, 7, 22, 35, 36, 102};
        int[] pair = twoSumPair(b, 793);
        System.out.println(Arrays.toString(pair));  // Sum not found

        int[] c = {0, 3, 4, 5, 7, 9};
        int[] answer = twoSumPair(c, 5);
        System.out.println(Arrays.toString(answer)); // Positive case

        int[] twoSum = twoSumPair(null, 5);
        System.out.println(Arrays.toString(twoSum)); // 'a' is null

        int[] twoSumPair = twoSumPair(new int[0], 5);
        System.out.println(Arrays.toString(twoSumPair)); // 'a' is an empty array
    }
}