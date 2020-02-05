package Task1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<Integer[]> findNumbersTriples(int[] inArr) {
        ArrayList<Integer[]> outList = new ArrayList<>();
        for (int i = 0; i < inArr.length; i++) {
            for (int j = i + 1; j < inArr.length; j++) {
                for (int k = j + 1; k < inArr.length; k++) {
                    if ((inArr[i] + inArr[j] + inArr[k]) == 0) {
                        outList.add(new Integer[]{inArr[i], inArr[j], inArr[k]});
                    }
                }
            }
        }
        return outList;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 3, -2, -1, 0, -5, 2, 7, 4, -2, 6, -4, 1, -3};
        ArrayList<Integer[]> list = findNumbersTriples(myArray);
        for (Integer[] arr : list) {
            System.out.println(Arrays.deepToString(arr));
        }
    }
}
