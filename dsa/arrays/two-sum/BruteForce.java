import java.util.Arrays;

public class BruteForce {

    // a = [1, 3, 5, 5, 3]
    // target = 8

    // Order don't matter
    // One or more pairs? Just return one valid pair.

    // Iterate over all the pairs once

    public static int[] twoSumPair(int[] a, int target) {
        int[] pair = new int[2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    pair[0] = i;
                    pair[1] = j;
                    return pair;
                }
            }
        }
        return null;
    }

    // TC O(n^2)
    // SC O(1)

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 5, 3};
        int[] result = twoSumPair(a, 8);
        System.out.println(Arrays.toString(result));

        int[] b = {2, 7, 11, 15};
        int[] pair = twoSumPair(b, 9);
        System.out.println(Arrays.toString(pair));

        int[] c = {13, 543, 64, 34};
        int[] answer = twoSumPair(c, 1);
        System.out.println(Arrays.toString(answer));
    }
}