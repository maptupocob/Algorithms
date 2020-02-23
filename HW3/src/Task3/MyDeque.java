package Task3;

import java.util.Arrays;

public class MyDeque {
    private int capacity;
    private int amount;
    private int front;
    private int rear;
    private int deqArr[];

    public MyDeque(int capacity) {
        this.capacity = capacity;
        deqArr = new int[capacity];
        amount = 0;
        front = 0;
        rear = -1;
    }

    public boolean isFull() {
        return capacity == amount;
    }

    public boolean isEmpty() {
        return amount == 0;
    }

    public int removeLeft() {
        if (rear == 0) {
            rear = capacity;
        }
        int temp = deqArr[--rear];
        amount--;
        return temp;
    }

    public int removeRight() {
        int temp = deqArr[front++];
        if (front == capacity) {
            front = 0;
        }
        amount--;
        return temp;
    }

    public void insertLeft(int el) {
        if (rear == capacity - 1) {
            rear = -1;
        }
        deqArr[++rear] = el;
        amount++;
    }


    public void insertRight(int el) {
        if (front == 0) {
            front = capacity;
        }
        deqArr[--front] = el;
        amount++;
    }


    @Override
    public String toString() {
        return Arrays.toString(deqArr);
    }
}
