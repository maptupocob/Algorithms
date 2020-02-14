package Task1;

public class Stack {
    private int capacity;
    private int[] stackArr;
    private int top;

    public Stack(int capacity) {
        this.capacity = capacity;
        stackArr = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == (stackArr.length - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int e) {
        stackArr[++top] = e;
    }

    public int pop() {
        return stackArr[top--];
    }

    public int peek() {
        return stackArr[top];
    }
}
