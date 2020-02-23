package Task1;

public class MyQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int amount;
    private int capacity;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        amount = 0;
    }

    public boolean isFull() {
        return amount == queue.length;
    }

    public boolean isEmpty() {
        return amount == 0;
    }

    public void insert(int el){
        if (rear == capacity -1){
            rear = -1;
        }
        queue[++rear] = el;
        amount++;
    }

    public int remove(){
        int temp = queue[front++];
        if (front == capacity){
            front = 0;
        }
        amount--;
        return temp;
    }

    public  int peak(){
        return queue[front];
    }
}
