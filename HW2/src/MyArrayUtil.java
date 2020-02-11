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
            arr[arr.length - 1] = 0;
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

    public static void bubbleSort(int[] arr) {
        int length = arr.length;
        int temp;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void selectSort(int[] arr) {
        int length = arr.length;
        int temp;
        for (int i = 0; i < length; i++) {
            int minIndex = i;
            for (int j = i; j < length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && (arr[j-1] > temp)){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }

    public static void mergeSort(int[] arr) {
        int[] tmp = new int[arr.length];
        mergeSortInt(arr, tmp, 0, arr.length-1);
    }

    private static void mergeSortInt(int[] arr, int[] tmp, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        mergeSortInt(arr, tmp, lo, mid);
        mergeSortInt(arr, tmp, mid+1, hi);
        merge(arr, tmp, lo, mid, hi);
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static void merge(int[] arr, int[] tmp, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) {
            tmp[k] = arr[k];
        }

        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if      (i > mid)              arr[k] = tmp[j++];
            else if (j > hi)               arr[k] = tmp[i++];
            else if (tmp[j] < tmp[i]) arr[k] = tmp[j++];
            else                           arr[k] = tmp[i++];
        }
    }

}
