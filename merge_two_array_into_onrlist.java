import java.util.*;

public class Solution {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        int i = 0, j = 0;
        List<Integer> arr = new ArrayList<>();

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                checkD(arr, a[i]);
                i++;
            } else if (a[i] > b[j]) {
                checkD(arr, b[j]);
                j++;
            } else {
                checkD(arr, a[i]);
                i++;
                j++;
            }
        }

        while (i < a.length) {
            checkD(arr, a[i]);
            i++;
        }

        while (j < b.length) {
            checkD(arr, b[j]);
            j++;
        }

        return arr;
    }

    public static void checkD(List<Integer> arr, int val) {
        if (arr.isEmpty() || arr.get(arr.size() - 1) != val) {
            arr.add(val);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4};
        int[] b = {2, 3, 5};
        System.out.println(sortedArray(a, b)); // Output: [1, 2, 3, 4, 5]
    }
}
