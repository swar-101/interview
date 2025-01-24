import java.util.Arrays;

public class TwoPointerApproach {
    // NOTE:
// This approach works only if the array is already sorted.
// Two-pointer technique:
// Start with one pointer at the beginning (left) and the other at the end (right) of the array.
// If the sum of the two elements is greater than the target, move the right pointer leftward to reduce the sum.
// If the sum is less than the target, move the left pointer rightward to increase the sum.

    // a = [1, 2, 3, 3, 5, 7]
    // target 10


    public static int[] twoSumPair(int[] a, int target) {
        if (Arrays.equals(a, null) || Arrays.equals(a, new int[0])) {
            return null;
        }
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            int sum = a[left] + a[right];
            if (sum == target) {
                return new int[]{left, right};
            }
            if (sum < target) {
                left++;
            }
            if (sum > target) {
                right--;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 5, 7};
        int[] result = twoSumPair(a, 10);
        System.out.println(Arrays.toString(result)); // Positive case

        int[] b = {1, 7, 22, 35, 36, 100};
        int[] pair = twoSumPair(b, 799);
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
