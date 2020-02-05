//Сложность O(n);

package Task2;

import java.util.Arrays;

public class Main {
    public static int[] find2max(int[] arr) {
        int[] outArr = new int[2];
        int max1 = arr[0];
        int max2 = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
        }
        outArr[0] = max1;
        outArr[1] = max2;
        return outArr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 7, 11, 15, 1, 25};
        System.out.println(Arrays.toString(find2max(arr)));
    }
}
