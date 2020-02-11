public class Main {

    public static void main(String[] args) {
        int[] myArr = new int[1_000_000];

        for (int i = 0; i < myArr.length ; i++) {
            myArr[i] = (int) (Math.random()* 1_000_000);
        }

        MyArrayUtil.searchItem(myArr, 12);


    }






}
