package Task1;

public class StackExample {
    public static void main(String[] args) {
        int[] exArr = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        MyStack stack = new MyStack(20);

        int i = 0;
        while (!stack.isFull() && i < exArr.length) {
            stack.push(exArr[i++]);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
