import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OptimizedApproach {

    // for each element calculate the complement of its target sum
    // if the complement exists in the array
    // return the index of current element and its complement

    public static int[] twoSumPair(int[] a, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int complement = target - a[i];
            if (map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            }
            map.put(a[i], i);
        }
        return null;
    }

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