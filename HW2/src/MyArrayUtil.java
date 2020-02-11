public class MyArrayUtil {
    public static int searchItem(int[] arr, int searchItem) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchItem) {
                return i;
            }
        }
        return -1;
    }

    // Добавление элемента в массив со сдвигом вправо и выталкиванием последнего элемента
    public static void addItem(int[] arr, int newItem, int index) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = newItem;
    }

    //Удаление элемента из массива со сдвигом влево и занулением последнего элемента
    public static void deleteItem(int[] arr, int deletedItem) throws ItemNotFoundException {
        int index = searchItem(arr, deletedItem);
        if (index == -1) {
            throw new ItemNotFoundException();
        } else {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length -1] = 0;
        }
    }

    public static void displayArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        System.out.println(sb);
    }
}
