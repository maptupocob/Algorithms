public class Main {

    public static void main(String[] args) {
        int[] bigArr = new int[1_000_000];
        int[] lilArr = {1,2,3,4,5,6,7};

        for (int i = 0; i < bigArr.length ; i++) {
            bigArr[i] = (int) (Math.random()* 1_000_000);
        }

        int index =  MyArrayUtil.searchItem(bigArr, 12);
        if (index == -1){
            System.out.printf("Search item not found\n");
        }else{
            System.out.printf("Index of search item: %,6d\n", index);
        }

        System.out.println("Init array state:");
        MyArrayUtil.displayArray(lilArr);
        try {
            MyArrayUtil.deleteItem(lilArr, 3);
        } catch (ItemNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("After deleting element:");
        MyArrayUtil.displayArray(lilArr);

        MyArrayUtil.addItem(lilArr, 5, 4);
        System.out.println("After adding element:");
        MyArrayUtil.displayArray(lilArr);






    }






}
