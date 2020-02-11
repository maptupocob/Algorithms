import java.util.Arrays;
import java.util.Date;

public class Main {
    public  static Date date1;
    public  static Date date2;

    public static void main(String[] args) {
        int[] bigArr = new int[100_000];
        int[] lilArr = {10,12,3,14,5,16,7};

        for (int i = 0; i < bigArr.length ; i++) {
            bigArr[i] = (int) (Math.random()* 1_000_000);
        }

        int index =  MyArrayUtil.searchItem(bigArr, 12);
        if (index == -1){
            System.out.print("Search item not found\n");
        }else{
            System.out.printf("Index of search item: %,6d\n", index);
        }

        System.out.println("Init array state:");
        MyArrayUtil.displayArray(lilArr);
        int deletingItem = 3;
        try {
            MyArrayUtil.deleteItem(lilArr, deletingItem);
        } catch (ItemNotFoundException e) {
            System.out.printf("Item %d was not found in array\n", deletingItem);
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println("After deleting element:");
        MyArrayUtil.displayArray(lilArr);

        MyArrayUtil.addItem(lilArr, 3, 2);
        System.out.println("After adding element:");
        MyArrayUtil.displayArray(lilArr);

        int[] bubbleArr =  Arrays.copyOf(bigArr, bigArr.length);
        date1 = new Date();
        MyArrayUtil.bubbleSort(bubbleArr);
        date2 = new Date();
        System.out.printf("Time of bubble sorting: %d ms\n", (date2.getTime() - date1.getTime()));

        int[] selectArr =  Arrays.copyOf(bigArr, bigArr.length);
        date1 = new Date();
        MyArrayUtil.selectSort(selectArr);
        date2 = new Date();
        System.out.printf("Time of selection sorting: %d ms\n", (date2.getTime() - date1.getTime()));

        int[] insertArr =  Arrays.copyOf(bigArr, bigArr.length);
        date1 = new Date();
        MyArrayUtil.insertSort(insertArr);
        date2 = new Date();
        System.out.printf("Time of insertion sorting: %d ms\n", (date2.getTime() - date1.getTime()));

        int[] mergeArr =  Arrays.copyOf(bigArr, bigArr.length);
        date1 = new Date();
        MyArrayUtil.mergeSort(mergeArr);
        date2 = new Date();
        System.out.printf("Time of merge sorting: %d ms\n", (date2.getTime() - date1.getTime()));

//        MyArrayUtil.displayArray(mergeArr);
    }
}
