import java.util.Arrays;

public class PrefixSum {

    public static int[] prefixSumArray(int[] a) {
        if (a == null) {
            throw new IllegalArgumentException("The input cannot be null to calculate a prefix sum array.");
        } else if (a.length == 0) {
            return new int[0];
        }
        int[] prefixSum = new int[a.length];
        prefixSum[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            prefixSum[i] = a[i] + prefixSum[i - 1];
        }
        return prefixSum;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 3, 5, 5, 1, 3, 5}; // 26
        int[] b = {3, 4, 5, 5, 6, 2}; // 25
        System.out.println(Arrays.toString(prefixSumArray(a)));
        System.out.println(Arrays.toString(prefixSumArray(b)));

        // edge cases
        System.out.println(Arrays.toString(prefixSumArray(new int[]{234})));
        System.out.println(Arrays.toString(prefixSumArray(new int[]{})));
        System.out.println(Arrays.toString(prefixSumArray(null)));
    }
}