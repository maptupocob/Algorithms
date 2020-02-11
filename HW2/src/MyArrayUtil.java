public class MyArrayUtil {
    public static int searchItem(int[] arr, int searchItem) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchItem){
                System.out.printf("Index of search item: %,6d", i);
                return i;
            }
        }
        System.out.printf("Search item not found");
        return  -1;
    }

    public static void addItem(int[] arr, int newItem) {

    }

    public static void deleteItem(int[] arr, int deletedItem) {

    }
}
